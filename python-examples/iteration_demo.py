#Reverse order iteration
for i in reversed(range(0, 10)):
    print(i, end = ' ')
print()
#Sorted iteration
fruits = ["apple", "orange", "grapes", "banana", "apple", "banana", "grapes"]
for i in sorted(fruits):
    print(i)
print("----------------")
#Convert the list to set using set()
for i in sorted(set(fruits)):
    print(i)
