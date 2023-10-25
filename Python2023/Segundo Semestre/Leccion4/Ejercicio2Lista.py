# Ejercicio 2: Modificar los elementos de una lista.
# 
# Llenar una lista con los números del 1 al 10, luego modificar los elementos
# de la lista multiplicándolos por un valor ingresado por el usuario.

lista = []
for i in range(1,11):
    lista.append(i)
print(f'Lista = {lista}')
multiplo = int(input("¿Por qué valor desea multiplicar la lista anterior?  "))
for i in range(0, len(lista)):
    lista[i] *= multiplo
print(f'Nueva lista = {lista}')