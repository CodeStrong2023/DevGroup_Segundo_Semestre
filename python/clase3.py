# Ingresar elementos al diccionario llamado seleccionArgentina, 
# lo elementos a ingresar deben ser como mínimo 4, 
# estos elementos son los jugadores con sus respestivas descripciones.

SeleccionArg = {
    10 : {"Nombre": "Lionel Messi", "Edad" : 36, "Alto" : 1.7, "Precio" : "280.8 M de euros", "Posicion" : "Delantero"},
    9 : {"Nombre" : "Julian Alvarez", "Edad" : 23, "Alto" : 1.7, "Precio" : "21.48 M de euros", "Posicion" : "Delantero"},
    24 : {"Nombre" : "Leandro Paredes" , "Edad" : 29, "Alto" : 1.83, "Precio" : "27.8 M de euros", "Posicion" : "Centrocampista"},
    1 : {"Nombre" : "Franco Armani" , "Edad" : 36, "Alto" : 1.88, "Precio" : "3 M de euros", "Posicion" : "Arquero"},
    23 : {"Nombre" : "Emiliano Martinez" , "Edad" : 31, "Alto" : 1.95, "Precio" : "28 M de euros", "Posicion" : "Arquero"},
    3 : {"Nombre" : "Nicolas Tagliafico" , "Edad" : 31, "Alto" : 1.72, "Precio" : "15 M de euros", "Posicion" : "Defensa"}
}
print(SeleccionArg)


print(SeleccionArg[1])

print(SeleccionArg.values())


for llave in SeleccionArg:
    print(llave) 

for llave, valor in SeleccionArg.items():
    print(llave, valor)

print(len(SeleccionArg))



# metodo cola

cola = ["Carlos", "Javier" , "Alberto" , "Ricky"]
cola.append("Juan")
cola.append("Luca")
print(cola)

Retira = cola.pop(0)
print(f"Atendido {Retira}")
print(cola)

Retira = cola.pop(0)
print(f"Atendido {Retira}")
print(cola)

Retira = cola.pop(0)
print(f"Atendido {Retira}")
print(cola)

Retira = cola.pop(0)
print(f"Atendido {Retira}")
print(cola)

Retira = cola.pop(0)
print(f"Atendido {Retira}")
print(cola)

Retira = cola.pop(0)
print(f"Atendido {Retira}")
print(cola)



# metodo pila

pila = [1,2,3]
print(pila)

pila.append(4)
pila.append(5)
print(pila)

elementoBorrado = pila.pop()
print(f"Elemento borrado = {elementoBorrado}") 

print(f"Pila: {pila}")


