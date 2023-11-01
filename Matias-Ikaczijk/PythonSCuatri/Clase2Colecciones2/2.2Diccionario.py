# ¿Qué es un diccionario? coleccion de datos ordenados de manera particular

# "Maradona" : 10 --> el conjunto de datos es un diccionario

# UNA LLAVE Y UN VALOR
# dict(key,value)

diccionario = { 
    "IDE" : "Integrated Development Environment",
    "POO" : "Programacion Orientada a Objetos",
    "SABD" : "Sistema de Administracion de Base de Base de Datos"
}
# mostramos el diccionario con tres elementos
print(diccionario)

#verificar cant de elementos
print(len(diccionario))

# como acceder al diccionario con la llave (key)
print(diccionario["IDE"])

# otra forma de recuperar un elemento 
print(diccionario.get("POO"))
print(diccionario.get("SABD"))

# modificar un elemento 
diccionario["IDE"] = " Entorno de Desarrollo Integrado"
print(diccionario)

# ¿cómo recorrer los elementos?
for termino in diccionario:
    print(termino)
# necesitamos una funcionpara recorrer un diccionario
for termino, valor in diccionario.items():
    print(termino, valor)

# otra manera de acceder al diccionario.
for termino in diccionario.keys():
    print(termino) # muestra solo las llaves

for valor in diccionario.values(): # muestra los valores sin las llaves
    print(valor)

# comprobar si una llave está o no está en el diccionario 
print("IDE" in diccionario) #devuelve un booleano (v o f)

# agregar un elemento 
diccionario["PK"] = "Primary key"
print(diccionario)

# eliminar elementos
diccionario.pop("SABD")
print(diccionario)

# vaciar un diccionario 
diccionario.clear()
print(diccionario)

# eliminar diccionario 
del diccionario
print(diccionario)