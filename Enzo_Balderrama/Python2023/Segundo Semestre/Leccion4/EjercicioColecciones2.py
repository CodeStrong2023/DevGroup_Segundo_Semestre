# Ejercicio 2: Operaciones de conjuntos con listas.
# Escriba un programa que tenga 2 listas y que a continuación
# cree las siguientes listas (en las que no debe haber repetición)
# 1 Lista de palabras que aparecen en las listas.
# 2 Lista de palabras que aparecen en la primera lista pero no en la segunda.
# 3 Lista de palabras que aparecen en la segunda lista pero no en la primera.
# 4 Lista de palabras que aparecen en ambas listas.

lista1 = [1, 2, 3, 4, 5]
lista2 = [4, 5, 6, 7, 8]
# Lista con los elementos de las dos listas
conjunto = set(lista1 + lista2)
lista3 = list(conjunto)
print(lista3)

# 2
conjunto = set(lista1)
conjunto2 = set(lista2)
lista3 = list(conjunto - conjunto2)
print(lista3)

# 3
lista3 = list(conjunto2 - conjunto)
lista3.sort()
print(lista3)

# 4
lista3 = list(conjunto & conjunto2)
print(lista3)
