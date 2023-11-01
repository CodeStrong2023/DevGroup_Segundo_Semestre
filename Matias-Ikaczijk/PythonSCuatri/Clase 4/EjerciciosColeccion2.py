#.. Ejercicio 2: Operaciones de conjuntos con listas ..

# Escriba un programa que tenga dos listas y que a continuacion
# cree las siguientes listas (no debe haber repeticiones):

# -- 1 lista de palabras que aparecen en las listas 
# -- 2 lista de palabras que aparecen en la primera lista, pero no en la segunda (-)
# -- 3 listas de palabras que aparecen en la segunda, pero no en la primera
# -- 4 lista de palabras que aparecen en ambas listas 

lista1 = ["Hola","Buenas tardes", "apio", "remolacha", "Hola mundo", "apio","camotin", "Hola mundo"]
lista2 = ["Buenas tardes", "soy Mati", "tengo 22 años", "soy estudiante", "soy Mati", "Buenas tardes"]
print(lista1)
print(lista2)

# Eliminar elementos repetidos: 
print(" Después de eliminar elementos repetidos: ")
conjunto1 = set(lista1)
conjunto2 = set(lista2)
print(conjunto1)
print(conjunto2)


print("Palabras que aparecen en ambas listas:")
union = list(conjunto1 | conjunto2) # 1 .. unimos conjuntos
print(union)

# 2 . palabras que aparecen en el conjunto 2 pero no en 1
print("Mostramos solo elementos que aparecen en el conjunto 2")
solo2 = list(conjunto2 - conjunto1)
print(solo2)

# 3. palabras que aparece en la 1 pero no en la dos
print("Mostramos solo elementos que aparecen en el conjunto 1")
solo1 = list(conjunto1 - conjunto2)
print(solo1)

# 4. Palabras de ambas listas(en  comun)
interseccion = list(conjunto1 & conjunto2)
print(interseccion)


