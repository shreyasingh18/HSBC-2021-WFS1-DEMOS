def test():
    print("function test is called")

#calling test from another function
def demo():
    print("function demo is calling test")
    test()


def sayHello(name):
    return "Welcome, "+name

def printSayHello(msg):
    print(msg)

#calling test
demo()
print("-----------")
data = sayHello("Alexandar")
printSayHello(data)
