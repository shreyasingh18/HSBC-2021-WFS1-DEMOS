fr = open("desc2.txt", "r")
fr.seek(2) #points to the 2nd character
print(fr.read(6))
fr.close()