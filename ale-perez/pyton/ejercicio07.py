#ejercicio 7: juego adivina el numero 
# #realiza un juego para adivinar un numero. para ello se debe 
# generar un numero aleatorio entre 1 - 100, y luego ir pidiendo 
# numeros indicando 'es mayor' o 'menor' segun sea mayor o menor 
# con respecto a N. el proceso termina cuando el usuario acierta 
# y alli se debe ,ostrar el numero de intentos.
import random

print('\t.: Juego Adivina el Número :.')
aleatorio = random.randint(1, 100)  # Genera un número aleatorio entre 1 y 100
contador = 0

while True:
    numero = int(input('Digite un número: '))
    contador += 1

    if numero > aleatorio:
        print('\tNo es el número, digite un número menor.')
    elif numero < aleatorio:
        print('\tNo es el número, digite un número mayor.')
    else:
        print(f'\t¡Felicidades! Has adivinado el número {aleatorio}.')
        break

print(f'\nNúmero de intentos: {contador}')
