

import json
import pymongo
con=pymongo.MongoClient("mongodb://localhost:27017")

db=con["college"]
col=db["studlist"]


# insert data
# with open(r"c:\Users\cacet\Desktop\S2 AJML\adbms\test.json") as file:
#     file_data=json.load(file)

# if isinstance(file_data,list):
#     col.insert_many(file_data)
# else:
#     col.insert_one(file_data)

# Question 1.
# for i in col.find({"gender":"female","course":"MCA"}):
#     print(i["name"]["fname"]," ",i["name"]["lname"]," ",i["mark"])


# question 2
top_mca = col.find({"course": "MCA"}).sort("mark", -1).limit(1)

for student in top_mca:
    print(f"Top Scorer: {student['name']['fname']} {student['name']['lname']} - Mark: {student['mark']}")

#question 3
print("Male students with A+ grade:")
for i in col.find({"gender": "male", "grade": "A+"}):
    print(i["name"]["fname"], i["name"]["lname"])


# Question 4
top_mech = col.find({"course": "Mechanical"}).sort("mark", -1).limit(3)

print("Top 3 Students in Mechanical Department:")
for student in top_mech:
    fname = student["name"]["fname"]
    lname = student["name"]["lname"]
    mark = student["mark"]
    print(f"- {fname} {lname} (Score: {mark})")

# Question 5
query = {
    "gender": "female", 
    "mark": {"$gt": 90} 
}

students = col.find(query)

print("Female students with marks > 90:")
print("-" * 30)

for i in students:
    fname = i["name"]["fname"]
    lname = i["name"]["lname"]
    grade = i["grade"]
    mark = i["mark"]
    contact = i["phone"]["no"]
    
    print(f"Name: {fname} {lname}")
    print(f"Grade: {grade}")
    print(f"Mark: {mark}")
    print(f"Contact: {contact}")

#question 6

for i in col.find({"mark":{"$gt":80,"$lt":90}}):
    fname = i["name"]["fname"]
    lname = i["name"]["lname"]
    mark = i["mark"]
    course = i["course"]
    
    print(f"Name: {fname} {lname}")
    print(f"Course: {course}")
    print(f"Mark: {mark}")
    print("-" * 30)

#question 7

for i in col.find({"name.fname":{"$regex":"^V"}}):
    fname = i["name"]["fname"]
    lname = i["name"]["lname"]
    course = i["course"]
    mark = i["mark"]
    
    print(f"Name: {fname} {lname}")
    print(f"Course: {course}")
    print(f"Mark: {mark}")
    print("-" * 30)

#question 8

print("Students from Kollam:")
print("-" * 30)

for i in col.find({"address.city":"Kollam"}):
    fname = i["name"]["fname"]
    lname = i["name"]["lname"]
    house = i["address"]["house_name"]
    course = i["course"]
    
    print(f"Name: {fname} {lname}")
    print(f"House: {house}")
    print(f"Course: {course}")
    print("-" * 30)

# question 9

print("Students not from Kollam or Thiruvananthapuram:")
print("-" * 30)

for i in col.find({"addrees.city":{"$nin":["Kollam","Thiruvananthapuram"]}}):
    fname = i["name"]["fname"]
    lname = i["name"]["lname"]
    city = i["address"]["city"]
    course = i["course"]
    
    print(f"Name: {fname} {lname}")
    print(f"City: {city}")
    print(f"Course: {course}")
    print("-" * 30)

# question 10
print("Female Students eithetr from Kollam or Thiruvananthapuram:")
print("-" * 30)

for i in col.find({"gender":"female","addrees.city":{"$in":["Kollam","Thiruvananthapuram"]}}):
    fname = i["name"]["fname"]
    lname = i["name"]["lname"]
    city = i["address"]["city"]
    course = i["course"]
    
    print(f"Name: {fname} {lname}")
    print(f"City: {city}")
    print(f"Course: {course}")
    print("-" * 30)