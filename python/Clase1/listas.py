#Listas (Array)

nombres = ["Marcos", "Brisa", "Pablo", "Donato",  "Guillermina", "Sofía", "Axel"]
# print(nombres)
# print(nombres[0:3])
# print(nombres[ :3])
# print(nombres[1: ])
#Modificamos un valor
nombres[3]= "Jose"
print(nombres)
#Iterar lista
for nombre in nombres:
    print(nombre)
else:
    print("Se acabaron los nombres de la lista")

#cuanto elementos tiene
print(len(nombres))

#agregamos elemento
nombres.append("Marcelo")
print(nombres)

#Agregar elemento en indice especifico
nombres.insert(1, "Alberto")
print(nombres)

#eliminar elemento
nombres.remove("Alberto")
print(nombres)

#eliminar ultimo elemento
nombres.pop()
print(nombres)

#eliminar indice especifico
del nombres[2]
print(nombres)

#eliminar todo
nombres.clear()
print(nombres)