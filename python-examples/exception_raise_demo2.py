def db(x):
    if x != 0:
        print("we can perform DB operations")
    else:
        raise IOError("DB Operation failed")

#calling db function using try & except
try:
    data = int(input("Enter some int value:"))
    db(data)
    print("db operation is successfull")
except IOError as e:
    print(e)