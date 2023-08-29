# COLECCIONES EN PYTHON

# Tipo set o conjunto
planetas = {"marte", "jupiter", "venus"}
print(planetas)

# Verificar si un elemento existe dentro de planetas
print("marte" in planetas)

# Agregar un elemento
planetas.add("tierra")
print(planetas)

# Eliminar elemento
planetas.remove("marte")
print(planetas)

# discard elimina pero si no se encuentra el elemento no da error
planetas.discard("Tierra")

# Limpiar set
planetas.clear()
print(planetas)

# Eliminar set
# del planetas
# print(planetas)  # al eliminar el set nos muestra error

# DICCIONARIOS
# Un diccionario está compuesto por dos elementos (llave: valor)
diccionario = {
    "IDE": "Integred Development Enviroment",
    "POO": "Programación orientada a objetos",
    "SABD": "Sistema de Administración de Base de Datos",
}


print(len(diccionario))
print(diccionario)

# Acceder a un diccionario con la llave (key)

print(diccionario["IDE"])

# Otra forma de acceder a un elemento
print(diccionario.get("POO"))
print(diccionario.get("SABD"))

# Modificamos los elementos

diccionario["IDE"] = "Entorno de desarrollo integrado"
print(diccionario)

# Como recorrer un diccionario
for termino in diccionario:  # recorremos mostrando solo las llaves
    print(termino)

# Necesitamos una función para recorrer un diccionario
for termino, valor in diccionario.items():
    print(termino, valor)

# Otras maneras de acceder a un diccionario
for termino in diccionario.keys():
    print(termino)  # muestra solo las llaves

for valor in diccionario.values():
    print(valor)

# Comprobar la existencia de algun elemento
print("IDE" in diccionario)  # devuelve un booleano

# Agregar un elemento
diccionario["PK"] = "Primary Key"
print(diccionario)

# Eliminar un elemento
diccionario.pop("SABD")
print(diccionario)

# Vaciar un diccionario
diccionario.clear()
print(diccionario)

# # Eliminar diccionario
# del diccionario
# print(diccionario)

# Concatenamos listas
lista1 = [1, 2, 3, 1]
lista2 = [4, 5, 6, 1]
lista3 = lista1 + lista2
print(lista3)

lista3.extend([7, 8, 9, 1])  # funcion para agregar elementos a una lista
print(lista3)

print(lista3.index(5))  # funcion para mostrar elemento de dicha posicion

# Como saber cuantos elementos hay repetidos en una lista
print(lista3.count(1))

# Para poner al reves una lista
lista3.reverse()
print(lista3)

# Para que una lista se multiplique repitiendo sus elementos
lista = [1, 2, 3] * 2
print(lista)

# Métodos de ordenamiento
lista3.sort()  # Ordena la lista de forma ascendente
print(lista3)
lista3.sort(reverse=True)  # Ordena la lista de forma descendente
print(lista3)

# Repaso de tuplas
tupla = (4, "hola", 6.78, [1, 2, 78], 4, "hola")
print(tupla)
print(4 in tupla)  # accion booleana, su respuesta es de tipo booleana

# Lo que podemos usar dentro de tupla son: index, count, len
# En tuplas se puede convertir tuplas en listas y viceversa
