'''
1. Desarrolle un programa en Python que cree una lista e inicialice con 5 cadenas de caracteres leídas por teclado.
Copia los elementos de la lista en otra lista pero en orden inverso, y muestra sus elementos por la pantalla.
'''
Lista1 = []
for i in range(5):
    valores = input("Introduzca valores para la lista 1: ")
    Lista1.append(valores)
print("Lista 1: ")
for Item in Lista1:
    print(Item, end=" ")
Lista2 = Lista1.copy()
Lista2.reverse()
print("\nLista 2: ")
for Item in Lista2:
    print(Item, end=" ")