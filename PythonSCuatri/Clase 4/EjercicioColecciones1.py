#  Ejercicio 1: Eliminar duplicados de una lista
# Escribir un programa donde tenga una lista y que luego elimine
# los elementos repetidos, por ultimo, mostrar la lista

#.. Creamos la lista ..
lista = [1,2,3,"Mati", "Buenas Tardes", 3.3, 1, "Mati", 2, 1, 1, "Hola"] 
print(lista)

# para eliminar elementos repetidos, debemos crear un conjunto o set..
conjunto = set(lista) # de esta manera, convertimos la lista en conjunto
print(conjunto)

lista = list(conjunto) # conv conjunto a lista
print(lista)

# ahora, hacemos lo mismo pero en una sola linea
lista = list(set(lista))
print(lista)