#1. Elaborar un programa en Python que imprima el costo de un pedido de un artículo del cual se tiene la descripción,
# la cantidad pedida y el precio unitario. Si la cantidad pedida es mayor a 50 unidades, se hace un descuento de 15%.
articulo =  input("Cual es el articulo que desea comprar?: ")
precioUnitario = float(input("El precio del articulo " + articulo + " es de: "))
unidades = int(input("Cuantas unidades de " + articulo + " quiere añadir a la compra?: "))
#Opcion 1 (else)
'''
if unidades <= 50:
    preciotot = precioUnitario * unidades
    print(f"El precio total a pagar seria de: {preciotot:,.2f}")
else:
    subtotal = precioUnitario * unidades
    descuento = subtotal * 0.15
    preciotot = subtotal - descuento 
    print(f"Subtotal: {subtotal:,.2f}")
    print(f"Descuento: {descuento:,.2f}")
    print(f"El precio total a pagar seria de: {preciotot:,.2f}")
'''
#Opcion 2 (else if)
'''
if unidades <= 50:
    preciotot = precioUnitario * unidades
    print(f"El precio total a pagar seria de: {preciotot:,.2f}")
elif unidades > 50:
    subtotal = precioUnitario * unidades
    descuento = subtotal * 0.15
    preciotot = subtotal - descuento
    print(f"Subtotal: {subtotal:,.2f}")
    print(f"Descuento: {descuento:,.2f}")
    print(f"El precio total a pagar seria de: {preciotot:,.2f}")
'''