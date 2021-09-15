data = ["orange", "banana", "grapes", "apple", "banana", "grapes", "orange"]
print(data) # prints all the data
#append adds the item at the end of the list
data.append("pineapple")
print(data)
#extend it adds mulitple items of the another list at the end
data.extend(["mango", "kiwi"])
print(data)
#insert is used to add at a specific index
data.insert(1, "strawberry")
print(data)
#remove the first item
data.remove("grapes")
print(data)
#pop removes the item based on the index
data.pop(6)
print(data)
#count counts the number of times the data appears
print(data.count("orange"))
#sort is used to sort
data.sort()
print(data)
#reverse is used to reverse
data.reverse()
print(data)