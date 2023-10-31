#Ejercicio 7: Modificar elementos de una lista
#Llenar una lista con los números del 1 al 10, luego modificar los 
#Elementos de la lista multiplicandolos por un valor ingresado por el usuario
print("Lista Original")
lista = list(range(1,11))

for i in lista:
    print(i,end="-")

multi = int(input("\nDigite un número a multiplicar: "))
for indice, i in enumerate(lista):
    lista[indice] *= multi
print(f"Lista final con los elementos multiplicados por {multi}")

for i in lista:
    print(i, end="-")