
tupla = (4,"Hola mundi", 7.30, [2,3,9], "hola", 4)
print(tupla)

print(4 in  tupla) # Accion booleana, su resp es de tipo booleana
# Lo que podemos usar dentro de tuplas es: index, count, len

# En tuplas, podemos convertir de tupla a lista y viseversa 

# --------

# Lunes 4 sep, repaso 

# Definimos un conjunto: (dentro de ello, hay valores unicos)
conjunto = set()
conjunto1 = {"Hola" ,} # Si lo inicializamos con llaves, debemos agregar un elemento inicialmente, sino dará error

conjunto.add("Hola")
conjunto.add("9")

conjunto1.add("Buenas noches")

print(conjunto1)
print(conjunto)

# para consultar por un elemento:
print(9 not in conjunto1)
print(7 in conjunto)

# Como igualar dos conjuntos
print(conjunto1 == conjunto) 

# Para operar entre conjuntos
# Unir conjuntos
conjunto3 = conjunto | conjunto1
print(conjunto3)

# para ver si tienen algun elemento en comun
conjunto3 = conjunto1 & conjunto 
print(conjunto3)

# visualizar los elementos de un conjunto que no esta el otro
conjunto3 = conjunto1 - conjunto
print(conjunto3)
conjunto3 = conjunto - conjunto1
print(conjunto3)

# mostrar elementos que estan en los dos conjuntos pero no compartidos
conjunto3 = conjunto1 ^ conjunto 
print(conjunto3)

# como determinar si un conjunto está dentro de otro
conjunto3 = conjunto1 | conjunto
print(conjunto1.issubset(conjunto3)) #dentro del conj 3 se guardan dos conjuntos
print(conjunto.issubset(conjunto3))
print(conjunto3.issubset(conjunto1))

# para saber si estos conjuntos no comparten ni un elemento (disconexos)
print(conjunto3.issuperset(conjunto1)) # consultamos si los elementos del conjunto1 estan dentro del conjunto3
print(conjunto3.issuperset(conjunto)) # si es v nos dice q el conjunto3 es un superconjunto
print(conjunto1.issuperset(conjunto3)) # caso inverso, consultamos si el conjunto3 está dentro del 1

# como saber si ambos conjuntos son disconexos
print(conjunto.isdisjoint(conjunto1))

# LOS CONJUNTOS NO SON TOTALMENTE MUTABLES NI INMUTABLES.. no se pueden modificar

# para volverlos totalmente inmutables, hacemos esto:
conjunto1 = frozenset # no se puede ni eliminar, ni agregar, ni modificar
