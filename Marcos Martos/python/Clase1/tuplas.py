#Una tupla es una lista inmutable

#definimos tupla
cocina = ("cuchara","cuchillo","tenedor")
print(cocina)
print(len(cocina))

#Acceder a un elemento
print(cocina[0])
print(cocina[-1])

#recorrer elementos de una tupla
for cocinar in cocina:
    print(cocinar, end=" ") #para eliminar salto de linea del ciclo for

#como agregar elementos a una tupla pasandola a lista y luego a tupla
cocinaLista = list(cocina)
cocinaLista[0]= "Plato"
cocina = tuple(cocinaLista)
print(cocina)