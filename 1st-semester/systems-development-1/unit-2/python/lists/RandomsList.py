'''
1. Create a Python program that allows you to create a list of 10 random numbers, print the list, and determine how many are greater than 10.
'''

import random

Lista = []
contador = 0

for i in range(10):
    numeros = random.randint(1, 20)
    Lista.append(numeros)

    if numeros > 10:
        contador += 1

print("\nList: ")

for i in Lista:
    print(i, end=" ")

print("\n\nNumbers greater than 10: ")
print("There are", contador, "numbers that are greater than 10")
