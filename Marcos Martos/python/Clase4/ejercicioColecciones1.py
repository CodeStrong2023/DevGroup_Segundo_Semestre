# Ejercicio 1: Eliminar duplicados de un lista
# Escriba un programa donde tenga una lista y que a continuacion
# elimine los elementos repetidos, por ultimo mostrar la lista

# Creamos una lista
lista = ["Marcos", 1, 2, 3, "Carla", 7, 7, 5, "Marcos"]
conjunto = set(lista)
# print(conjunto)  # convertimos lista a conjunto tipo set
# lista = list(conjunto)  # convertimos conjunto tipo set a lista
lista = list(set(lista))  # La conversion hecha en una sola linea de codigo
print(lista)
