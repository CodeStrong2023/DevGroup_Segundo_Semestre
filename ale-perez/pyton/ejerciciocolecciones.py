
#Ejercicio 1: Eliminar duplicados de una lista
#Escriba un programa donde tenga una lista y que a continuacion
#elimine los elementos repetidos, por ultimo mostrar la lista 

#creamos una lista 
lista = [1, 2, 3, 'Ariel', 7, 7, 3, 'Alberto', 1, 'Ariel', 2, 'Alberto']
# conjunto = set(lista) # convertimos la lista a un conjunto de tipos set
# lista = list(conjunto)
lista = list(set(lista)) # La convercion hecha en una sola linea de codigo (eficiente)
print(lista)





