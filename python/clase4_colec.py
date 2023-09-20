# Ejercicio 1:
# Escriba un programa donde tenga una lista y que a continuacion
# elimine los elementos repetidos, por ultimo mostrar la lista

lista = ["Juan", 1, 2, 3, "Pablo", 7, 7, 5, "Quiles"]
conjunto = set(lista)
lista = list(set(lista))
print(lista)


# Ejercicio 2: Operaciones de conjuntos con listas

lista1 = [1, 2, 3, 4, 5, 4, 3, 2, 2, 1, 5]
lista2 = [4, 5, 6, 7, 8, 4, 5, 6, 7, 7, 8]

conjunto1 = set(lista1)
conjunto2 = set(lista2)

union = list(conjunto1 | conjunto2)
solo1 = list(conjunto1 - conjunto2)
solo2 = list(conjunto2 - conjunto1)
interseccion = list(conjunto1 & conjunto2)
print(f"Aparecen en las listas: {union}")
print(
    f"Aparecen en la primera lista, pero no en la segunda: {solo1}"
)
print(
    f"Aparecen en la segunda lista, pero no en la primera: {solo2}"
)
print(f"Aparecen en ambas listas: {interseccion}")


# Ejercicio 3: Agregar personajes a una lista
# Escriba un programa donde cree una lista con los sgtes personajes del señor de los anillos
# Nombre: Aragon
# Clase: Guerrero
# Raza: Dúnadan del norte

# Nombre: Gandalf
# Clase: Mago
# Raza: Istar

# Nombre: Legolas
# Clase: Arquero
# Raza: Elfo Sindar

personajes = []
P1 = {"Nombre": "Aragon", "Clase": "Guerrero", "Raza": "Dúnadan del norte"}
personajes.append(P1)
P2 = {"Nombre": "Gandalf", "Clase": "Mago", "Raza": "Istar"}
personajes.append(P1)
P3 = {"Nombre": "Legolas", "Clase": "Arquero", "Raza": "Elfo Sindar"}
personajes.append(P1)

print(personajes)
