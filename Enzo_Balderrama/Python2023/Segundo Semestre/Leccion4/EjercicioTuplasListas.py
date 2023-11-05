# Dada la siguiente tupla
import math


tupla = (13, 1, 8, 3, 2, 5, 8)
# Crear una lista que solo incluya los números menores a 5
lista = []
for elemento in tupla:
    if (elemento < 5):
        lista.append(elemento)
lista.sort
print(lista)

# Ejercicio de matemáticas
# Para sacar la raíz cuadrada de un número positivo
numero = int(input("Digite un número positivo."))
while numero < 0:
    print("ERROR. Escriba un número positivo.")
    numero = int(input("Digite un número positivo."))
print(f'\n Su raíz cuadrada es: {math.sqrt(numero):.2f}')