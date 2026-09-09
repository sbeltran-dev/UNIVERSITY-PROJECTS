'''
2. Create a Python program that asks for names and ages, and creates a dictionary with this data. It must print the dictionary and classify the people into
two groups, one group for those under 18 years old and the other for those over 18, then print both dictionaries.
'''

nombre = []
edad = []
diccionario = {}
diccionarioMenores = {}
diccionarioMayores = {}

for i in range(5):
    nombres = input("Enter a name: ")
    nombre.append(nombres)

    edades = int(input("Enter an age: "))
    edad.append(edades)

diccionario = dict(zip(nombre, edad))
print(diccionario, "\n")

for nombre, edad in diccionario.items():
    if edad < 18:
        diccionarioMenores[nombre] = edad
    else:
        diccionarioMayores[nombre] = edad

print("|| MINORS ||")
print(diccionarioMenores)

print("\n|| ADULTS ||")
print(diccionarioMayores)
