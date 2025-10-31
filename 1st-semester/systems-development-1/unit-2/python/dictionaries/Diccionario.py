'''
2. Crear un programa en Python que pida nombres y la edad, y cree un diccionario con dichos datos. Debe imprimir el diccionario y clasificar a las personas en
dos grupos, 1 grupo los menores a 18 años y el otro los mayores, imprima ambos diccionarios.
'''
nombre = []
edad = []
diccionario = {}
diccionarioMenores = {}
diccionarioMayores = {}
for i in range(5):
    nombres = input("Introduzca un nombre: ")
    nombre.append(nombres)
    edades = int(input("Introduzca una edad: "))
    edad.append(edades)
diccionario = dict(zip(nombre, edad))
print(diccionario, "\n")
for nombre, edad in diccionario.items():
    if edad < 18:
        diccionarioMenores[nombre] = edad
    else:
        diccionarioMayores[nombre] = edad
print("|| MENORES DE EDAD ||")
print(diccionarioMenores)
print("\n|| MAYORES DE EDAD ||")
print(diccionarioMayores)