import pymongo
conn=pymongo.MongoClient("mongodb://localhost:27017")
#print(conn.list_database_names())
#choose db,collection
#insert some data
db=conn["student"]
col=db["mark"]
#data={"rollno":3,"name":"Abhinav","mark":3}
#x=col.insert_one(data)

# data=[
#     {"rollno":1,"name":"AJMAL","mark1":5,"mark2":6,"mark3":7},
#     {"rollno":2,"name":"Abhinav","mark1":5,"mark2":5,"mark3":7},
#     {"rollno":3,"name":"Hafis","mark1":5,"mark2":9,"mark3":7},
#     {"rollno":4,"name":"Aafthab","mark1":5,"mark2":6,"mark3":9},
#     {"rollno":5,"name":"Devika","mark1":8,"mark2":6,"mark3":7},
#     {"rollno":6,"name":"Ashin","mark1":5,"mark2":1,"mark3":7},
#     {"rollno":7,"name":"Sarath","mark1":9,"mark2":6,"mark3":7},
#     {"rollno":8,"name":"Shifna","mark1":9,"mark2":2,"mark3":7},
#     {"rollno":9,"name":"Aslam","mark1":10,"mark2":6,"mark3":7},
#     {"rollno":10,"name":"AJMAL KHAN","mark1":9,"mark2":3,"mark3":7},
#     ]
# x=col.insert_many(data)

# count=0
# for i in col.find({"mark1":{"$gt":8}},{"_id":0}):
#     total=i["mark1"]+i["mark2"]+i["mark3"]
#     count+=1
#     print(i["name"],total)
# print(count)

# count=0
# total={}
# for i in col.find({"name":{"$regex":"a$"}},{"_id":0}):
#    total[i["name"]] = i["mark1"] + i["mark2"] + i["mark3"]
   
    
# for key,value in total.items():
#     print(key,":",value)

#print(count)

col.update_one({"rollno":1},{"$set":{"mark1":100}})
print(col.find_one({"rollno":1})["name"])

col.update_many({"name":{"$regex":"^A"}},{"$set":{"mark1":100}})
for i in col.find({},{}):
    print(i["name"]," ",i["mark1"])

col.delete_many({"name":{"regex":"^S"}})