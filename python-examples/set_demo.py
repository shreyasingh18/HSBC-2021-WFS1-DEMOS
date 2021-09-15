basket = {"orange", "strawberry", "pineapple", "apple", "banana", "orange"}
print(basket)
for b in basket:
    if len(b) > 6:
        print(b)

#displaying the items in the set using or and xor and so on
prime = {1, 2, 3, 5, 7, 11}
even = {2, 4, 8, 10}

#display items that are prime but should not be in even
print("prime - even: ",(prime-even))
#display prime or even both
print("prime | even: ", (prime | even))
#display data in both prime and even
print("prime & even: ",(prime & even))
#display prime or even but not boty
print("prime ^ even: ", (prime ^ even))