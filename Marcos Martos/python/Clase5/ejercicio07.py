# Ejercicio 7: Juego adivina el número
# Realizar un juego para adivinar un número. Para ello se debe
# generar un número aleatorio entre 1 - 100, y luego ir pidiendo
# números indicando "es mayor" o "es menor" según sea mayor o menor
# con respecto a N. El proceso termina cuando el usuario acierta
# y allí se debe mostrar el número de aciertos.

import random

print("Juego adivina el número")
aleatorio = random.randint(0, 100)
contador = 0
while True:
    numero = int(input("Digite un número: "))
    contador += 1
    if numero > aleatorio:
        print("No es el número, digite un número menor")
    elif numero < aleatorio:
        print("No es el número, digite un número mayor")
    else:
        print(f"FELICIDADES, acabas de adivinar el número {aleatorio}")
        break

print(f"Número de intentos: {contador}")
