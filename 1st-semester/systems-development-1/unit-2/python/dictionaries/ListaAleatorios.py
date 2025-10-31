'''
1. Crear un programa en Python que permita crear una lista de 10 números aleatorios, que imprima la lista y obtenga cuántos son mayores a 10.
'''
import random
Lista = []
contador = 0
for i in range(10):
    numeros = random.randint(1, 20)
    Lista.append(numeros)
    if numeros > 10:
        contador += 1
print("\nLista: ")
for i in Lista:
    print(i, end=" ")
print("\n\nNumeros mayores a 10: ")
print("Hay", contador, "numeros que son mayores a 10")