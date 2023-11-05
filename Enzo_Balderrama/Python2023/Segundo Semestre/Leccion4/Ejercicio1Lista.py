# Ejercicio 1: Llenar lista.
#
# Llenar una lista con los números del 1 al 50, luego mostrar
# la lista con el bucle for, los elementos deben mostrarse de la siguiente forma
# 1-2-3-4-5...-50.

lista = []
for i in range(1,51):
    lista.append(i)
    
for i in lista:
    if (i<50):
        print(i, end=" - ")
    if (i==50):
        print(i, end=". \n")