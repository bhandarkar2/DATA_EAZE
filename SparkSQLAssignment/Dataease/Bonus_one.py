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



startups.createOrReplaceTempView("startup_view")
startups.printSchema()

# Find the top startup(by amount raised) from each city?
sql = "select City, SUM(CAST(regexp_replace(Amount_in_USD, '[^0-9]*', '') AS BIGINT)) total from startup_view group by City order by total desc"
result = spark.sql(sql)
result.printSchema()
result.show()

spark.stop()
