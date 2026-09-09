'''
2. Write a Python program that allows you to create a list of words and then provides four options:
Count: Asks for a string and must say how many times it appears in the list.
Modify: Asks for a string and another string to modify, and modifies all occurrences of the first string with the second one in the created list.
Delete: Asks for a string and deletes it from the list.
Show: Displays the list of strings.
Finish: Ends the program.
'''

Lista = []

for i in range(10):
    palabra = input("Write a word: ")
    Lista.append(palabra)

Lista.sort() # > To sort in alphabetical order from A-Z.

print("\nList: ")

for i in Lista:
    print(i, end=" ")

Seleccionar = ""

while str.upper(Seleccionar) != "5":
    print("\n\n1. Count")
    print("2. Modify")
    print("3. Delete")
    print("4. Show")
    print("5. Finish")

    Seleccionar = input("Select one of the options: ")

    if Seleccionar == "1":
        palabra = input("Write the string you want to count: ")
        contador = Lista.count(palabra)
        print("The word", palabra, "appears", contador, "times")

    elif Seleccionar == "2":
        palabra1 = input("Write a string: ")
        palabra2 = input("Write another string to modify: ")

        for i in range(len(Lista)): # > Go through the list.
            if Lista[i] == palabra1:
                Lista[i] = palabra2

    elif Seleccionar == "3":
        palabra = input("Write the string you want to delete from the list: ")
        Lista.remove(palabra)

    elif Seleccionar == "4":
        print("List: ")

        for i in Lista:
            print(i, end=" ")
