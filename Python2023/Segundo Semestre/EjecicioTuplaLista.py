"""Dada la siguiene tupla:
tupla = (13, 1, 8, 3, 2, 5, 8) # definimos la tupla
Crear una lista que solo incluya los números menores a 5
e imprimirla por consola [1, 3, 2]
"""
tupla = (13, 1, 8, 3, 2, 5, 8)
lista = []
for i in range(len(tupla)):
    if tupla[i] < 5:    
            lista.append(tupla[i])

print(tupla)
print(lista)