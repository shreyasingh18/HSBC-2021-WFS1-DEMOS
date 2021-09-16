items1 = ["Black", "Jack"]
items2 = ["Blue", "Jue"]

#output like black and blue, Jack and Jue

for x, y in zip(items1, items2):
    print(x, 'and', y)
print("--------------------")
#Assume you have questions in one list & answers in another list
questions = ["Name","Skills", "Favorite Movie"]
answers = ["Alexandar", "Python", "Chakde India"]

for q, a in zip(questions, answers):
    print(q, ":", a)