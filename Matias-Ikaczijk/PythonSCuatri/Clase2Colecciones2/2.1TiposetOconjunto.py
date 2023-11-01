# set no tiene orden y no deja almacenar elementos duplicados. 
# cuando mandamos a imprimir, el orden es aleatorio

# TIPO SET o conjunto
planetas = {"Marte", "Jupiter", "Venus"}
print(planetas)

# funcion len: largo o cantidad de elementos
print(len(planetas))

# Revisar si existe un elemento dentro del set. Se debe escribir identico
print("Marte" in planetas)
print("saturno" in planetas)

# agregar un elemento
planetas.add("Tierra")
planetas.add("Saturno")
print(planetas)

# eliminar elementos
planetas.remove("Saturno") #si esta bien escrito, no da error al print
print(planetas)

#si introducimos mal el nombre de la palabra a remover, esta palabra la pasa por alto
planetas.discard("marte")
print(planetas)

# Limpiar el set
planetas.clear()
print(planetas)

# Eliminar set o conjunto
del planetas
print(planetas)