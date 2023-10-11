#Dada la siguiente tupla 
tupla = (13, 1, 8, 3, 2, 5, 8) #Definimos la tupla
#Crear una lista que solo incluya los numeros menores a 5 
# e imprima por consola [1, 3, 2]
for numero in tupla:
    if numero <5:
        print(numero)

#Ejemplo de profesor 
lista = [] #Definimos lista
#Filtramos los elementos menores a 5 de la tupla
for elemento in tupla:
    if elemento <5:
        lista.append(elemento)
print(lista)