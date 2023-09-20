import math

numero = int(input("Ingrese un valor positivo: "))
while numero < 0:
    print("El número no es positivo.")
    numero = int(input("Ingrese un valor positivo: "))
print(f"Raiz cuadrada: {math.sqrt(numero):.2f}")
