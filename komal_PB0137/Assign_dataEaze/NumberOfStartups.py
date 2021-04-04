from pyspark.sql import SparkSession
from pyspark.sql.functions import *

spark = SparkSession.builder\
    .config("spark.sql.shuffle.partitions", "2")\
    .appName("demo01")\
    .master("local[2]")\
    .getOrCreate()

consumerInt = spark.read\
    .option("header", "true")\
    .option("delimiter", ",")\
    .option("inferSchema", "true")\
    .csv("/home/sunbeam/consumerInternet.csv")

startups = spark.read\
    .option("header", "true")\
    .option("delimiter", ",")\
    .option("inferSchema", "true")\
    .csv("/home/sunbeam/startup.csv")

no_of_startups = startups\
    .where(startups['City']=="Pune")\
    .groupBy('City').count()

no_of_startups.printSchema()
no_of_startups.show()

spark.stop()