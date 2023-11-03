# Repaso de set o conjunto
# Para definir un conjunto
conjunto2 = set()
conjunto1 = {"bye"}
conjunto2.add(7)
conjunto2.add("Hola")
print(conjunto2)
conjunto1.add("hola")
print(conjunto1)
print(3 not in conjunto1) #preguntamos si no está dentro del conjunto1

# Cómo hacer la igualdad de dos conjuntos 
print(conjunto1 == conjunto2) #Nos retorna un booleano

# Operaciones en conjuntos
conjunto3 = conjunto1 | conjunto2 #La linea une los dos conjuntos
print(conjunto3)

conjunto3 = conjunto1 & conjunto2 # Qué elemento tienen en comun
print(conjunto3)

conjunto3 = conjunto1 - conjunto2 # Asigna el valor que está en el conjunto1 y no en el conjunto2
print(conjunto3)
conjunto3 = conjunto2 - conjunto1 # Asigna el valor que está en el conjunto1 y no en el conjunto2
print(conjunto3)
conjunto3 = conjunto1 ^ conjunto2 # Elementos que están en los dos conjuntos y no están compratidos
print(conjunto3)

conjunto3 = conjunto1 | conjunto2
print(conjunto1.issubset(conjunto3)) # Preguntamos si un conjunto es un subconjunto dentro de otro
print(conjunto2.issubset(conjunto3))
print(conjunto3.issubset(conjunto1))
print(conjunto3.issubset(conjunto2))


print(conjunto3.issuperset(conjunto1)) #Preguntamos si los elementos del conjunto1 están dentro del 3
print(conjunto3.issuperset(conjunto2)) #Si es verdadero quiere decir que el conjunto3 es un superconjunto
print(conjunto2.issuperset(conjunto3))

# Cómo saber si dos conjuntos son disconexos, esto es si no comparten elementos en comun 
print(conjunto1.isdisjoint(conjunto2)) #No hay cosas en comun

# Convertir conjunto en inmutable
conjunto1 = frozenset #Esto hace que el conjunto sea inmutable
#No se puede agregar, modificat ni eliminar elementos del conjunto


# Repaso de diccionarios
diccionarioNuevo = {"Azul" : "Blue", "Rojo" : "Red", "Verde" : "Green", "Amarillo" : "Yellow"}

#Como eliminar
print(diccionarioNuevo)
del (diccionarioNuevo["Azul"])
print(diccionarioNuevo)

#Los diccionarios pueden almacenar distintos tipos de datos
diccionario2 = {"Ariel" : {"Edad" : 40, "Altura" : 1.83}, "Osvaldo" : [45, 1.85], "Natalia" : [35, 1.67]}
print(diccionario2)


seleccionArgentina = {
    10: {"Nombre" : "Lionel Messi", "Edad" : 35, "Altura" : 1.70, "Precio" : "50 Millones", "Posicion" : "Extremo derecho"},
    11: {"Nombre" : "Ángel Di María", "Edad" : 34, "Altura" : 1.80, "Precio" : "12 Millones", "Posicion" : "Extremo derecho"},
    24: {"Nombre" : "Paulo Dybala", "Edad" : 28, "Altura" : 1.77, "Precio" : "35 Millones", "Posicion" : "Media punta"},
    19: {"Nombre" : "Nicolás Otamendi", "Edad" : 34, "Altura" : 1.83, "Precio" : "3.5 Millones", "Posicion" : "Defensa central"},
    1: {"Nombre" : "Franco Armani", "Edad" : 35, "Altura" : 1.89, "Precio" : "3.5 Millones", "Posicion" : "Portero"},
    23: {"Nombre" : "Emiliano Martínez", "Edad" : 31, "Altura" : 1.95, "Precio" : "28 Millones", "Posicion" : "Portero"},
    20: {"Nombre" : "Alexis Mac Allister", "Edad" : 24, "Altura" : 1.74, "Precio" : "35 Millones", "Posicion" : "Mediocampista"},
    7: {"Nombre" : "Rodrigo de Paul", "Edad" : 29, "Altura" : 1.77, "Precio" : "37 Millones", "Posicion" : "Mediocampista"},
    6: {"Nombre" : "Lisandro Martínez", "Edad" : 25, "Altura" : 1.75, "Precio" : "57 Millones", "Posicion" : "Defensor"} 
}

for llave, valor in seleccionArgentina.items():
    print(llave, valor)


# Pilas usando listas
pila = [1, 2, 3]

# Agregar elementos a la pila
pila.append(4)
pila.append(5)
print(pila)

# Sacamos elementos del final
elementoBorrado = pila.pop() #Retorna el elemento borrado
print(f'Sacamos el elemento {elementoBorrado}')
print(f'La pila ahora se ve así: {pila}')

# Colas con listas
#Estructuras de datos de tipo fifo (first input / first output)
cola = ["Ariel", "Osvaldo", "Liliana", "Pilar"]

#Agregamos elementos al final de la cola
cola.append("Natalia")
cola.append("Marcos")
print(cola)

# Sacamos elementos de la cola
seRetira = cola.pop(0)
print(f'Atenido el cliente {seRetira}')
print(cola)

seRetira = cola.pop(0)
print(f'Atenido el cliente {seRetira}')
print(cola)























