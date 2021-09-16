items = [10, 20, "hello", "hi", 30]

for i in items:
    try:
        if type(i) != int:
            raise Exception("Iterating item have non-integers")
        else:
            print("i: ",i)
    except Exception as e:
        print(e)
print("---- DONE -----")