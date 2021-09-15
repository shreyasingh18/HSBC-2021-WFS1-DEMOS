items = [[1, 4, 3], [5, 8, 9, 10]]
#above list is nested list
print(len(items))
#finding the number of items of the particular index
print(len(items[0]))
#for loop to iterate the list
for x in items:
    print(x)

print("--------------")
for x in items:
    for y in x:
        print(y)

print(items)
#deleting the items based on index
del items[0]
print(items)