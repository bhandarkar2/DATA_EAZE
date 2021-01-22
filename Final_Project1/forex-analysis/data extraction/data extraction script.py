from datetime import timedelta, date
import http.client
import time
import json
import pandas as pd
def daterange(start_date, end_date):
    for n in range(int((end_date - start_date).days)):
        yield start_date + timedelta(n)

start_date = date(2015, 11, 22)
end_date = date(2020, 11, 23 )
date_diff=end_date.day-start_date.day
dt_lst=[]
for single_date in daterange(start_date, end_date):
    dt_lst.append(single_date.strftime("%Y-%m-%d"))

for dt in dt_lst:
	conn = http.client.HTTPSConnection("currencyscoop.p.rapidapi.com")
	headers = {
		'x-rapidapi-key': "9516dcb65dmshe386567644201e7p15a0bbjsnff57248f213f",
		'x-rapidapi-host': "currencyscoop.p.rapidapi.com"
		}

	conn.request("GET", f"/historical?date={dt}", headers=headers)
	res = conn.getresponse()
	data = res.read()
	data=data.decode("utf-8")
	#print(data)

	try:
		dt_json=json.loads(data)
		# print(dt_json["response"]['rates'])
		if dt_json["response"]["rates"]==[]:
			pass
		else:
			df=pd.DataFrame(dt_json["response"])
			df.to_csv('curr_data.csv', mode='a', header=False)
			print(dt_json["response"])


	# df.to_csv("./sample.csv")


			#
	#splited_data=data.split("},")
	#splited_data_split=splited_data[1].split("ponse\":")
	#print(splited_data[1])
	#print(data)
	#return the rsponse jason file
	#print(splited_data_split[1])




# with open("/tmp/sample.json", "w") as outfile:
#outfile.write(dt_json["response"])
	#time.sleep(0.665)

#json data geted into response
	except:
		pass