import pandas as pd



df = pd.read_parquet('/home/sunbeam/Downloads/consumerInternet.parquet')
df1 = df.to_csv('/home/sunbeam/consumerInternet.csv')
print(df)