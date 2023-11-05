# Ejercicio 7: Juego adivina el número.
#
# Realizar un juego para adivinar un número. Para ello se debe generar un número aleatorio
# entre 1-100, y luego ir pidiendo números indicando "es mayor" o "es menor" según sea
# mayor o menor con respecto a N. El proceso termina cuando el usuario acierta y allí
# se debe mostrar el número de intentos.


import random

print("BIENVENIDO! \n Intente adivinar el número en la menor cantidad de intentos! \n \n")
# guardará el numero de intentos.
N = int(random.uniform(1, 100))
numero = int(input("Digite un número: "))
i = 1
while(numero != N):
    i+= 1
    if (numero < N):
        print("El número ingresado es menor!!")
    if (numero > N):
        print("El número ingresado es mayor!!")
    numero = int(input("Digite otro número: "))
if (numero == N):
    print(f'FELICIDADES! Has acertado. El número era {N}. \n Cantidad de intentos: {i}')