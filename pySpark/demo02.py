from pyspark import SparkConf
from pyspark import SparkContext

cnf = SparkConf().setAppName("demo01").setMaster("local")
sc = SparkContext(conf=cnf)

stopwords = ('the', 'of', 'or', 'and', 'to', 'any', 'in', 'this', 'a')

file = sc.textFile("/home/sunbeam/hadoop-2.7.3/LICENSE.txt")
result = file.map(lambda line: line.lower())\
    .flatMap(lambda line:line.split())\
    .filter(lambda word: word not in stopwords)\
    .map(lambda word: (word,1))\
    .reduceByKey(lambda a,c: a + c)\
    .sortBy(lambda wordone: wordone[1], ascending=False)\
    .take(10)
print(result)

sc.stop()