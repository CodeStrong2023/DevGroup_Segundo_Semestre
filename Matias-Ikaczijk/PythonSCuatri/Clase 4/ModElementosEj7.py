# Modificar los elementos de una lista
# Llenar una lista con numeros del 1 al 10, luego modificar los elementos
# de la lista multiplicandolos por un valor ingresado por el usuario

lista = (range(1,11))
print("Lista original")

for i in lista:
    print(i, end="-")

valor = int(input("\nEscriba un valor para multiplicarlo: "))

# Para multiplicar los elementos de la lista:
for indice, i in enumerate(lista): # funcion para modificar indices de la lista
    lista[indice] *= valor # el iterador solo recorre indices..

print(f"Lista con los elementos multiplicados por {valor}..:")
for i in lista:
    print(i, end="-")
