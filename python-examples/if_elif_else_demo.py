marks = float(input("Enter some float value for marks: "))

if marks >= 70:
    print("FCD marks = ", marks)
elif marks < 70 and marks >= 60:
    print("First class marks = ", marks)
elif marks < 60 and marks >= 50:
    print("Second class marks = ", marks)
elif marks < 50 and marks >= 40:
    print("Pass marks = ", marks)
else:
    print("Failed marks = ",marks)

print("End of the program")