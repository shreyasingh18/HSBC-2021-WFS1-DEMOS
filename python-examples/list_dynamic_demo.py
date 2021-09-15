items = []

size = int(input("Enter number of items you want to add to the list: "))

for x in range(0, size):
    data = int(input("Enter the data:"))
    items.append(data)

print("----- Added items in the list -----")
print(items)