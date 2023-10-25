#Ejercicio 6: Juego adivina el número
#Realizar un juego para adivinar un número. Para ello se debe generar un número aleatorio entre 1 - 100
# y luego ir pidiendo números indicando "es mayor" o "es menor" según sea mayor o menor con respecto a N
#El proceso termina cuando el usuario acierta y alli se debe mostrar el números de intentos.
from random import *
aleatorio = randint(0, 100)
numero = int(input("Digite un número: "))
i = 0
while aleatorio != numero:
    if aleatorio > numero:
        print("Es mayor")
        i += 1
        numero = int(input("Digite un número: "))
    elif numero > aleatorio:
        print("Es menor")
        i += 1
        numero = int(input("Digite un número: "))
print("¡¡¡¡FELICIDADES ADIVINÓ EL NÚMERO!!!!")
print(f"Le costó {i} intentos")

