#Dada la siguiente tupla
tupla = (13, 1, 8, 3, 2, 5, 8)
#crear lista que incluya numeros menores a 5

lista = []
#Filtramos los elementos menores a 5 de la tupla
for elemento in tupla:
    if elemento < 5:
        lista.append(elemento)

print(lista)