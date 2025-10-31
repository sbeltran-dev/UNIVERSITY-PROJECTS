'''
2. Escriba un programa en python que permita crear una lista de palabras y que, a continuación de cuatro opciones:
Contar: Pide una cadena, y debe decir cuantas veces aparece en la lista.
Modificar: Pide una cadena, y otra cadena a modificar, y modifica todas las apariciones de la primera cadena por la segunda en la lista creada.
Eliminar: Pide una cadena, y la elimina de la lista.
Mostrar: Muestra la lista de cadenas.
Terminar: Termina el programa.
'''
Lista = []
for i in range(10):
    palabra = input("Escriba una palabra: ")
    Lista.append(palabra)
Lista.sort() # > Para ordenar en orden alfabetico de A-Z.
print("\nLista: ")
for i in Lista:
    print(i, end=" ")
Seleccionar = ""
while str.upper(Seleccionar) != "5":
    print("\n\n1. Contar")
    print("2. Modificar")
    print("3. Eliminar")
    print("4. Mostrar")
    print("5. Terminar")
    Seleccionar = input("Seleccione una de las opciones: ")
    if Seleccionar == "1":
        palabra = input("Escriba la cadena que desee contar: ")
        contador = Lista.count(palabra)
        print("La palabra", palabra, "aparece", contador, "veces")
    elif Seleccionar == "2":
        palabra1 = input("Escriba una cadena: ")
        palabra2 = input("Escriba otra cadena a modificar: ")
        for i in range(len(Lista)): # > Recorremos la lista.
            if Lista[i] == palabra1:
                Lista[i] = palabra2
    elif Seleccionar == "3":
        palabra = input("Escriba la cadena que desee eliminar de la lista: ")
        Lista.remove(palabra)
    elif Seleccionar == "4":
        print("Lista: ")
        for i in Lista:
            print(i, end=" ")