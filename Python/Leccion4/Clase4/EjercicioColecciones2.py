# Ejercicio 2: Operaciones de conjuntos con listas 
# Escriba un programa que tenga 2 listas y que a continuación cree
# las siguientes listas (en las que no debe haber repetición)
# 1 lista de palabras que aparecen las listas
# 2 lista de palabras que aparecen en la primer lista, pero no en la segunda 
# 3 lista de palabras que aparecen en la segunda lista, pero no en la primera
# 4 lista de palabras que aparecen en ambas listas 

lista1 = [1,2,"Ariel",3, 9, 1, "Osvaldo"]
lista2 = [6, 9 , 2 , "Osvaldo" , "Natalia"]

conjunto1 = set(lista1)
conjunto2 = set(lista2)

union = list(conjunto1 | conjunto2) # Unimos los dos conjuntos
solo1 = list(conjunto1 - conjunto2) # Muestra el conjunto1
solo2 = list (conjunto2 - conjunto1) # Muestra el conjunto2
interseccion = list(conjunto1 & conjunto2) # Mostramos ambas listas 

print(f'Lista de palabras que aparecen las listas: {union}')
print(f'Lista de palabras que aparecen en la primer lista, pero no en la segunda: {solo1}')
print(f'Lista de palabras que aparecen en la segunda lista, pero no en la primera: {solo2}')
print(f'Lista de palabras que aparecen en ambas listas: {interseccion}')
