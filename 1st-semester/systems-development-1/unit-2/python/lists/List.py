'''
1. Develop a Python program that creates a list and initializes it with 5 character strings read from the keyboard.
Copy the elements of the list into another list but in reverse order, and display its elements on the screen.
'''

Lista1 = []

for i in range(5):
    valores = input("Enter values for list 1: ")
    Lista1.append(valores)

print("List 1: ")

for Item in Lista1:
    print(Item, end=" ")

Lista2 = Lista1.copy()
Lista2.reverse()

print("\nList 2: ")

for Item in Lista2:
    print(Item, end=" ")
