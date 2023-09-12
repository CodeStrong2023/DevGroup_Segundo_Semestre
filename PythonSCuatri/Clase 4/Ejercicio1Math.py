import  math

# dada la sgte tupla:
tupla = (13,1,8,3,2,5,8)
# crear una lista que solo incluya num menores a 5

lista = []
#filtramos los elementos menores a 5 de la tupla
for elemento in tupla:
    if elemento < 5:
        lista.append(elemento)
print(lista)

# 4.4 Ejercicio 1 con Matemáticas y la clase math

# Sacar la raíz cuadrada de un número positivo

numero = int(input("Escriba un numero positivo: "))
while numero < 0:
    print("Error, debe ingresar un numero positivo..")
    numero = int(input("Ingrese un numero POSITIVO: "))
print(f"\nSu raiz cuadrada es: {math.sqrt(numero): .2f}") # sqrt, funcion raiz cuadraada.. 2f nos muestra solo 2 num, desp de la coma
