fr = open("desc.txt", "r")
fw = open("dummy.txt", "a")

for line in fr:
    fw.write(line)
fr.close()
fw.close()
print("--- done performing read and write ----")