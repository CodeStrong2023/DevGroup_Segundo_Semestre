#Ejercicio 2: Operaciones de conjuntos con listas
#Escriba un programa que tenga 2 listas y que a continuacion 
#cree las siguientes listas (en las que no deben haber repeticion)
# 1 Lista de palabras que aperecen en las listas
# 2 Lista de palabras que aperecen en la primera lista, pero no en la segunda
# 3 Lista de palabras que aprecen en la segunda lista, pero no en la primera
# 4 Lista de palabras que aprecen en ambas listas

lista1 = [1, 2, 3, 4, 5, 4, 3, 2, 2, 1, 5]
lista2 = [4, 5, 6, 7, 8, 4, 5, 6, 7, 7, 8]

# Eliminamos los elementos repetidos de ambas listas de conjuntos

conjunto1 = set(lista1)
conjunto2 = set(lista2)


union = list(conjunto1 | conjunto2) # unimos los dos conjuntos
solo1 = list (conjunto1 - conjunto2) #solo muesta el conjunto1
solo2 = list(conjunto2 - conjunto1) #solo muestra el conjunto2
interseccion =list(conjunto1 & conjunto2) #mostramos ambas listas

print(f"Lista de palabras que aperecen en las listas: {union}")
print(f"Lista de palabras que aperecen en la primera lista, pero no en la segunda: {solo1}")
print(f"Lista de palabras que aprecen en la segunda lista, pero no en la primera: {solo2}")
print(f"Lista de palabras que aprecen en ambas listas: {interseccion}")