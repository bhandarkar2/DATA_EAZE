from pyspark.sql import SparkSession
from pyspark.sql.functions import *


spark = SparkSession.builder\
    .config("spark.sql.shuffle.partitions", "2")\
    .appName("demo01")\
    .master("local[2]")\
    .getOrCreate()

startups = spark.read\
    .option("header", "true")\
    .option("delimiter", ",")\
    .option("inferSchema", "true")\
    .csv("/home/sunbeam/startup.csv")

# Find the top Investor(by amount) of each year.

startups.createOrReplaceTempView("stup_view")
sql = "select Investors_Name, (CAST(regexp_replace(SUBSTRING(Date,6,10), '[^0-9]*', '') AS BIGINT)) date, SUM(CAST(regexp_replace(Amount_in_USD, '[^0-9]*', '') AS BIGINT)) amount from stup_view where Investors_Name not in ('nan') group by Investors_Name, date ORDER BY amount desc"

result = spark.sql(sql)
result.printSchema()
result.show()


spark.stop()