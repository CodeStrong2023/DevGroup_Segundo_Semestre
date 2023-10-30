#Ejercicio 1: Eliminar duplicados de una lista  
#Escriba un programa donde tenga una lista y que a continuacion
#elimine los elementos repetidos, por ultimo mostrar la lista

#Creamos una lista

lista =[1, 2, 3, "Ariel", 7, 7, 3, "santiago", 5, "Franco", "santiago"]
conjunto = set(lista) #Convertimos la lista a un conjunto de tipo set   
lista = list(conjunto) #Convertimos el conjunto a una lista
print(lista)

#otra forma de hacerlo y acortar el codigo es 

#lista = list(set(lista))
#print(lista)
