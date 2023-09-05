#Ej 1: Iterar un rango de 0 a 10 e imprimir num divisible entre 3

print("Rango de 0 a 10 con numeros divisibles entre 3")
for i in range(11):
    if i % 3 == 0:
        print(i)

# Ej 2: Crear un rango de numeros de 2 a 6 e imprimirlos
print(" Rango con valores de inicio 2 y fin 6")
rango = range(2,7)
for i in rango:
    print(i)

# Ej 3: Crear un rango de 3 a 10 pero con incremento 2 en 2
print(" Num que se encuentran entre 3 y 10 pero con icremento 2")
#1rro el rango (3 a 11), luego el incremento
for i in range(3,11,2):
    print(i)

# 1.3 ejercicios de tuplas y listas
tupla = (13, 1, 8, 3, 2, 5, 8) # definimos la tupla
# creamos una lista que solo incluya los numeros menores a 5 e imprima por consola [1,3,2]
lista = [ ]
# filtramos los elementos menores de cinco 
for elemento in tupla:
    if elemento < 5:
        lista.append(elemento)
print(lista)
