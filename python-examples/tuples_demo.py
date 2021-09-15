data = (1, 2, 3, 4, 5)
print(data)
#creating another tuple from the existing one
anotherData = [4, 8, 12], data #this adds list to another list and keeps in tuple
print(anotherData)
print("Type of data: ", type(data))
for i in anotherData:
    print("Data: ", i, "Type of Data: ", type(i))

fewMoreData = [10, 20]
someMoreData = [30, 40], fewMoreData
print("Type of fewMoreData: ", type(fewMoreData)) #list
print("Type of someMoreData: ", type(someMoreData)) #tuple
print(someMoreData)
