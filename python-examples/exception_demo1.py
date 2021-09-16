
while True:
    try:
        x = int(input("Enter an int value: "))
        y = int(input("Enter an int value: "))
        print("x = ", x, "y = ", y)
        z = x / y
        print("y = ", y)
        break
    except ValueError as err:
        print(err)
    except ZeroDivisionError as err:
        print(err)
    finally:
        print("finally block")
print("End of the program")