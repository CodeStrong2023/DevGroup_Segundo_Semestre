#Ejercicio 1: Eliminar duplicados de una lista 
# Escriba un programa donde tenga una lista y que a continuación elimine
#los elementos repetidos, por último mostrar la lista.

#De esta manera eliminamos los duplicados al pasar la lista a set
lista = [1, 2, 3 ,"Ariel", 7,7,3,"Alberto",5,"Ariel"]
conjunto = set(lista)
#Volvemos a convertir el set a lista
lista = list(conjunto)
print(lista)

# Podemos hacer lo mismo reduciendo el código 

lista = list(set(lista)) #Lo que hacemos el convertir la lista a set para luego volverla a lista
print(lista)