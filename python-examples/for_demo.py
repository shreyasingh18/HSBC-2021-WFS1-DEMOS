#itearting using for loop sequentially incrementing by 1
x = 2
y = 2
for i in range(0, 9):
    print("i =",i)

#iterating using for loop by specifyin the incrementation
print("------------------------")
for i in range(0, 10, x * y):
    print("i = ", i)
