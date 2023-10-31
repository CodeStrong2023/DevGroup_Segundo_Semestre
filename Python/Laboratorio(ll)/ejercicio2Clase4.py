#Ejercicio 2: Operaciones de conjunto con listas
#Escriba un programa que tenga 2 listas y que a continuación cree las sgtes 
#listas (en la sque no deben haber repetición)
# 1 Lista de palabras que aparecen en las listas 
# 2 Lista de palabras que aparecen en la primera lista, pero no en la segunda
# 3 lista de palabras que aparecen en la segunda lista, pero no en la primera
# 4 lista de palabras que aparecen en ambas listas

lista1 = [1,2,3,4,5,4,3,2,2,1,5]
lista2 = [4,5,6,7,8,4,5,6,7,7,8]

lista1 = (set(lista1))
lista2 = (set(lista2))


lista1 = (set(lista1))
lista2 = (set(lista2))


union = (lista1 |  lista2) # Unimos los dos conjuntos
solo1 = list(lista1 - lista2) # Solo muestra el conjunto1
solo2 = list(lista2 - lista1) #Solo muestra el conjunto 2
interseccion = list(lista1 & lista2) #Mostramos elementos que cooinciden en ambas listas

print(f"Lista de palabras que aparecen en las listas{union} ")
print(f"Lista de palabras que aparecen en la primera lista, pero no en la segunda{solo1}")
print(f"lista de palabras que aparecen en la segunda lista, pero no en la primera{solo2}")
print(f"lista de palabras que aparecen en ambas listas{interseccion}")