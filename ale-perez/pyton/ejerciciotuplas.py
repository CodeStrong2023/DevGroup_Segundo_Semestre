import math # importamos la clase math para hacer uso de la funcion sqrt (raiz cuadrada)
# Dada la siguiente tupla
tupla = (13, 1, 8, 3, 2, 5, 8)  #definir la tupla
#crear una lista que solo incluya los numeros menos a 5
# e imprimir por consola [1, 3, 2]

lista = [] # definirmos fla lista
for elemento in tupla:
    if elemento < 5:
        lista.append(elemento)
        print(lista)

#ejercicio de matematicas
# para sacar ña raiz cuadrada de un numero positivo
numero = int(input('digite un numero positivo'))
while numero < 0:
    print ('error -> deberia ser un numero positivo')
numero = int (input('digite un numero positivo'))
print (f'\nsu raiz cuadrada es: {math.sqrt(numero):.2f}')
