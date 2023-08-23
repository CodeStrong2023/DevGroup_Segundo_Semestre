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