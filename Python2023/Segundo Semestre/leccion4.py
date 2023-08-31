# lista = Mati, Marcos, Enzo, Ale

nombres = ["Mati", "Marcos", "Enzo", "Ale"]
print(nombres)
print(nombres[0:2])
print(nombres[ :3])
print(nombres[1: ])
# modificamos un valor
nombres[0] = "Matías"
print(nombres)
for nombre in nombres:
    print(nombre)
else:
    print("Se acabaron los elementos.")

# Preguntamos cuantos elementos tiene
print(f'la lista posee {len(nombres)} elementos')

# Agregamos un elemento
nombres.append("Ro")
print(nombres)
# Agregamos un elemento en un índice específico
nombres.insert(3, "Mari")
print(nombres)
# Eliminamos un elemento
nombres.remove("Mari")
print(nombres)
# Eliminar el último elemento
nombres.pop()
print(nombres)
# Eliminar un elemento de índice específico
del nombres[0]
print(nombres)
# Eliminar todos los elementos
nombres.clear()
print(nombres)

# Definimos una tupla (van entre paréntesis)
cocina = ("cuchara", "cuchillo", "tenedor")
print(len(cocina))

# Acceder a un elemento
print(cocina[0])
print(cocina[-1]) # manera inversa

# Acceder a un rango
print(cocina[0:1])
verduras = ("papa",)# Tupla de 1 elemento. Para que sea una tupla, aunque sea de 1 elemento debe poseer la coma.

#Recorremos los elementos de la tupla.
for cocinar in cocina:
    print(cocinar, end=" ") # utilizamos end= para modificar como finaliza la impresión de Print(/n por default)

cocinaLista = list(cocina)
cocinaLista[0] = "Plato"
cocina = tuple(cocinaLista)
print("\n", cocina)
# del cocina # para borrar la tupla

# Tipo set / conjunto
planetas = {"Marte", "Júpiter", "Venus"}
print(len(planetas)) # Largo del conjunto
# Comprobar si un elemento existe dentro del conjunto.
print("Marte" in planetas) 
# Agregar un elemento
planetas.add("Tierra")
print(planetas)
# Eliminar un elemento (puede arrojar un error si el elemento no existe)
planetas.remove("Júpiter")
print(planetas)
planetas.discard("tierra") # Si el elemento no existe no sucede nada
print(planetas)
# Limpiar conjunto / set
planetas.clear() # para eliminar usamos del.
print(planetas)
# Diccionario: compuesto por una llave y un valor, por ej.
# 'Messi' : 10
diccionario = {
    'IDE' : 'Integred Development Environment', 'POO' : 'Programación Orientada a Objetos',
    'SABD' : 'Sistema de Administración de Base de Datos'
}
print(len(diccionario)) # cantidad de elementos del diccionario
print(diccionario)
# Acceder a un diccionario con la llave (key)
print(diccionario["IDE"])
# Otra forma
print(diccionario.get('POO'))
# Modificamos elementos
diccionario['IDE'] = "Entorno de Desarrollo integrado"
print(diccionario)

# Recorrer elementos
for i in diccionario: # Recorremos mostrando solo las llaves
    print(i)

for i, v in diccionario.items(): # Llamamos a la funcion items para poder acceder a los valores de las llaves
    print(i, v)

for v in diccionario.values(): # Solo vemos los valores de las llaves
    print(v)
# Comprobar la existencia de un elemento
print('IDE' in diccionario) # Devuelve un booleano

# Agregar un elemento
diccionario["PK"] = "Primary Key"
print(diccionario)

# Eliminar un elemento
diccionario.pop("SABD")
print(diccionario)

# Vaciar el diccionario
diccionario.clear()
print(diccionario)

# Eliminar el diccionario
del diccionario # Se borra el diccionario

# Concatenamos listas
lista1 = [1, 2, 3, 1]
lista2 = [4, 5, 6, 1]
lista3 = lista1 + lista2
print(lista3)

lista3.extend([7, 8, 9, 1]) # Funcion para agregar varios elementos a la lista
print(lista3)

print(lista3.index(5)) # Funcion para ubicar en que indice está el valor indicado
# Como saber cuantos valores repetidos hay dentro de una lista.
print(lista3.count(1))
# Poner la lista al reves
lista3.reverse()
print(lista3)
# Para que una lista se multiplique repitiendo sus elementos
lista3 = lista3 * 2
print(lista3)

# Metodos de ordenamiento
lista3.sort() # Ordena ascendentemente
print(lista3)
lista3.sort(reverse=True) # Ordena descendentemente
print(lista3)
#######################
tupla = (4, 'Hola', 6.78, [1, 2, 78], 4, 'Hola') # Puede tener diferentes tipos de datos dentro
print(tupla)

print(4 in tupla) # Acción booleana, su respuesta es de tipo booleana
# Lo que podemos usar de tuplas son: index, count, len.
# En tuplas se puede convertir de tupla a lista y viceversa.
