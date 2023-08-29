# Crear una lista que solo incluya los num menores a 5 y los imprima

tupla = (13, 1, 8, 3, 2, 5, 8)
lista = []
for element in tupla:
    if element < 5:
        lista.append(element)
print(lista)

