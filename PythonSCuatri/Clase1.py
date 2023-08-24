# Colecciones Parte 1
nombres = ["Matias" , "Carlos" , "Josefina" , "Ariel"]
print(nombres)

print(nombres[1])
print(nombres[3])

# en caso que la lista sea larga:
print(nombres[-1])
print(nombres[-2])

# recuerar un rango de la lista
print(nombres[0:2]) # muestra las primeras pos del indice 

# ir del inicio de la lista al indice 
print(nombres[ :3]) #muestra el 0,1,2

# para que ejecute desde el num indicado hasta el final
print(nombres[1: ])

# para modificar un valor
nombres[3] = "Liliana"
print(nombres)

# iterar la lista
for nombre in nombres:
    print(nombre)
else:
    print("Se acabaron los nombres de la lista") 

# listas, parte 3. Preguntamos cuantos elementos tiene una lista
print(len(nombres)) #funcion que regresa la cant de elementos que contiene
nombres.append("Marcela") #ingresa un elemento a la lista, wn ultimo lugar
print(nombres)

#incertamos un elemento en la posicion q queremos
#1ro va el indice(entero), donde queremos agregar el nombre
nombres.insert(1, "Albert")
print(nombres)
nombres.insert(3,"Debora")
print(nombres)

# ¿cómo eliminamos un elemento?
nombres.remove("Albert")
print(nombres)

# para eliminar el ultimo elemento 
nombres.pop()
print(nombres)

#eliminar un indice especifico 
del nombres[2]
print(nombres)

#eliminar o borrar elementos
nombres.clear()
print(nombres)

#eliminar lista
del nombres
# print(nombres) - nos da error en el ej de abajo, x eso comentamos

# TUPLAS, sigue el orden de las listas pero estas no se pueden modificar, INMUTABLES
cocina = ("cuchara", "cuchillo", "tenedor")
print(cocina)
print(len(cocina))

# acceder a un elemento de la tupla

print(cocina[2])
print(cocina[-2])

# como acceder a un rango
print(cocina[0:1])

# TUPLAS ´P2

# recorrer los elementos de la tupla
for cocinar in cocina:
    print(cocinar, end= " ") # (\n) cada vez que muestra un elemento hace un salto de linea
# con el end = " ", hacemos que se muestre en un mismo renglon

CocinaLista = list(cocina) # tupla a lista
CocinaLista[0] = "Plato" #mod de la lista
cocina = tuple(CocinaLista) #volvemos a convertirla en tuple
print("\n", cocina)