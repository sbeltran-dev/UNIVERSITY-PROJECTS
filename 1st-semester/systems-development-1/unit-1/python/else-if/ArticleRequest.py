#1. Create a Python program that prints the cost of an order for an item for which you have the description,
# the quantity ordered, and the unit price. If the quantity ordered is greater than 50 units,
# a 15% discount is applied.

item = input("What is the item you want to buy?: ")
unitPrice = float(input("The price of the item " + item + " is: "))
units = int(input("How many units of " + item + " do you want to add to the purchase?: "))

# Option 1 (else)
'''
if units <= 50:
    totalPrice = unitPrice * units
    print(f"The total price to pay would be: {totalPrice:,.2f}")
else:
    subtotal = unitPrice * units
    discount = subtotal * 0.15
    totalPrice = subtotal - discount
    print(f"Subtotal: {subtotal:,.2f}")
    print(f"Discount: {discount:,.2f}")
    print(f"The total price to pay would be: {totalPrice:,.2f}")
'''

# Option 2 (else if)
'''
if units <= 50:
    totalPrice = unitPrice * units
    print(f"The total price to pay would be: {totalPrice:,.2f}")
elif units > 50:
    subtotal = unitPrice * units
    discount = subtotal * 0.15
    totalPrice = subtotal - discount
    print(f"Subtotal: {subtotal:,.2f}")
    print(f"Discount: {discount:,.2f}")
    print(f"The total price to pay would be: {totalPrice:,.2f}")
'''
