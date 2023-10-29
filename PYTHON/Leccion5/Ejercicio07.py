#Ejercicio 7: Juego adivina el numero
#Realizar un juego adivinar un numero.Para ello se debe generar un numero aleatorio entre 1 - 100,
#y luego ir pidiendo numeros indicando "es mayor" o "es menor" segun sea mayor o menor con respecto a N.
# El proceso termina cuando sel usuario acierta y alli se debe mostrar el numero de intenros.

import random
print("\t JUEGO ADIVINA EL NUMERO")
aleatorio = random.randint(0,100) # toma de 0 a 100 literal, generamos un numero aleatorio
contador = 0
while True:
    numero = int(input("Digite un numero: "))
    contador += 1
    if numero > aleatorio:
        print("\tNo es el numero, digite un numero menor")
    elif numero < aleatorio:
        print(f'\t No es el numero, digite un numero mayor')
    else:
        print(f'FELICIDADES, acabas de adivinar el numero era:  {aleatorio}')
        break # Rompe el ciclo y el bucle
print(f"\nNumero de intentos {contador} ")