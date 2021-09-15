information = {"username":"admin", "password": "root", "description":"Datasource Info"}
print("Information: ", information)
#add a new key & value 
information["url"] = "http://localhost:9090"

print("print before sort")
print("Information: ", information)

#get all the keys and store in the list
x = list(information)
print("Unsorted key: ", x)
#sort the list
x.sort()
print("Sorted key: ", x)

print("print after sort")
print("Information: ", information)
#delete the data based on the key
del information["password"]
print("Information: ", information)
#iterating using for loop can be done with items() which gives key & value both
for k, v in information.items():
    print("Key = ", k, "Value = ", v)

