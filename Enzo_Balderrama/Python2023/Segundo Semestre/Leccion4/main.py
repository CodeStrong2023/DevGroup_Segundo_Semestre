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

# Repaso set o conjunto.
# Para definir un conjunto.
conjunto2 = set()
conjunto1 = {"Bye", }
conjunto2.add(7)
conjunto2.add("Hola")
print(conjunto2)
conjunto1.add("hola")
print(conjunto1)
print(3 not in conjunto1)

# Como hacer la igualdad de dos conjuntos
print(conjunto1 == conjunto2)

# Operaciones con conjuntos
conjunto3 = conjunto1 | conjunto2 # La línea | une los 2 conjuntos.
print(conjunto3)
conjunto3 = conjunto1 & conjunto2 # Intercección.
print(conjunto3)
conjunto3 = conjunto2 - conjunto1
print(conjunto3)
conjunto3 = conjunto1 ^ conjunto2 # Elementos que no comparten
print(conjunto3)

conjunto3 = conjunto1 | conjunto2
print(conjunto2.issubset(conjunto3)) # Preguntamos si el conjunto2 es un subconjunto del conjunto3
print(conjunto1.issubset(conjunto3))
print(conjunto3.issubset(conjunto1))

print(conjunto3.issuperset(conjunto1))
print(conjunto3.issuperset(conjunto2))
print(conjunto2.issuperset(conjunto3))

# Como saber si dos conjuntos no se intersecan.

print(conjunto1.isdisjoint(conjunto2))

# Como convertir un conjunto en inmutable.
conjunto1 = frozenset # No se puede agregar, modificar u eliminar elementos del conjunto.

# Repaso Diccionarios

diccionarioNuevo = {"Azul" : "Blue", "Rojo" : "Red", "Verde" : "Green", "Amarillo" : "Yellow"}
print(diccionarioNuevo)
# Como eliminar
del (diccionarioNuevo["Azul"])
print(diccionarioNuevo)
#Los diccionarios pueden almacenar distintos tipos de datos.
diccionario2 = {"Ariel": {"edad" : 40, "Altura" : 1.83}, "Enzo" : [25, 1.85], "Rocío" : [20, 1.66]}
print(diccionario2)

seleccionArgentina = {
    10 : {"Nombre" : "Lionel Messi", "Edad" : 36, "Altura" : 1.70, "Precio" : "50 millones", "Posición" : "Extremo Derecho"},
    11 : {"Nombre" : "Angel Di María", "Edad" : 35, "Altura" : 1.80, "Precio" : "12 millones", "Posición" : "Extremo Derecho"},
    21 : {"Nombre" : "Pablo Dybala", "Edad" : 29, "Altura" : 1.77, "Precio" : "35 millones", "Posición" : "Media Punta"},
    19 : {"Nombre" : "Nicolas Otamendi", "Edad" : 35, "Altura" : 1.83, "Precio" : "3.5 millones", "Posición" : "Defensa Central"},
    1 : {"Nombre" : "Franco Armani", "Edad" : 36, "Altura" : 1.89, "Precio" : "3.5 millones", "Posición" : "Portero"},  
}
print(seleccionArgentina)
print("Tenemos cargado en nuestro diccionario la cantidad de: ", len(seleccionArgentina), " jugadores.")
seleccionArgentina[24] = {"Nombre" : "Enzo Fernandez", "Edad" : 22, "Altura" : 1.78, "Precio" : "121 millones", "Posición" : "Centrocampista"}
print(seleccionArgentina)
print("Tenemos cargado en nuestro diccionario la cantidad de: ", len(seleccionArgentina), " jugadores.")
seleccionArgentina[27] = {"Nombre" : "Julián Álvarez", "Edad" : 23, "Altura" : 1.70, "Precio" : "60 millones", "Posición" : "Delantero"}
print(seleccionArgentina)
print("Tenemos cargado en nuestro diccionario la cantidad de: ", len(seleccionArgentina), " jugadores.")
seleccionArgentina[4] = {"Nombre" : "Gonzalo Montiel", "Edad" : 26, "Altura" : 1.75, "Precio" : "14 millones", "Posición" : "Defensa"}

for llave, valor in seleccionArgentina.items():
    print(llave, valor)
print("Tenemos cargado en nuestro diccionario la cantidad de: ", len(seleccionArgentina), " jugadores.")

# Lista tipo pila
pila = [1, 2, 3]

# Agregar elementos a la pila
pila.append(4)
pila.append(5)
print(pila)

# Sacamos elementos de la pila (por el final)
elemento_borrado = pila.pop()
print(f'Elemento borrado: {elemento_borrado}')
print(f'La pila ahora queda así: {pila}')

# Lista tipo cola
cola = ["Rocio", "Jazmin", "Enzo", "Ariel"]

# Agregamos elementos al final de la cola
cola.append("Marianela")
cola.append("Emanuel")
print(cola)

# Sacamos elementos de la cola
seRetira = cola.pop(0)
print(f"Atendido el cliente: {seRetira}")
print(cola)
seRetira = cola.pop(0)
print(f"Atendido el cliente: {seRetira}")
print(cola)
seRetira = cola.pop(0)
print(f"Atendido el cliente: {seRetira}")
print(cola)
seRetira = cola.pop(0)
print(f"Atendido el cliente: {seRetira}")
print(cola)