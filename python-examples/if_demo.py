x = int(input("Enter value for x: "))
y = int(input("Enter value for y: "))

if x > y:
    print("if: x > y")
    print("if: x = ", x, "y = ", y)
else:
    print("else: inside the else condition")
    print("else: x = ", x, "y = ", y)
print("outside if condition")