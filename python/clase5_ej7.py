# Ejercicio 7: Juego adivina el número

import random

print("GUESS THE NUMBER!!")
aleatorio = random.randint(0, 100)
contador = 0
while True:
    numero = int(input("Ingrese un valor: "))
    contador += 1
    if numero > aleatorio:
        print("Ingrese un número menor")
    elif numero < aleatorio:
        print("Ingrese un número mayor")
    else:
        print(f"WIN!!, The number was: {aleatorio}")
        break

print(f"Try: {contador} times")
