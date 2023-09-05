# ingresar elementos al diccionario llamado seleccionArgentina, 
# lo elementos a ingresar deben ser como mínimo 4, 
# estos elementos son los jugadores con su número de camiseta,
# nombre, apellido, edad, altura, precio y 
# posición de juego, por supuesto ver el video anterior

SeleccionArg = {
    10 : {"Nombre": "Lionel Messi", "Edad" : 36, "Alto" : 1.7, "Precio" : "280.8 M de euros", "Posicion" : "Delantero"},
    9 : {"Nombre" : "Julian Alvarez", "Edad" : 23, "Alto" : 1.7, "Precio" : "21.48 M de euros", "Posicion" : "Delantero"},
    24 : {"Nombre" : "Leandro Paredes" , "Edad" : 29, "Alto" : 1.83, "Precio" : "27.8 M de euros", "Posicion" : "Centrocampista"},
    1 : {"Nombre" : "Franco Armani" , "Edad" : 36, "Alto" : 1.88, "Precio" : "3 M de euros", "Posicion" : "Arquero"},
    23 : {"Nombre" : "Emiliano Martinez" , "Edad" : 31, "Alto" : 1.95, "Precio" : "28 M de euros", "Posicion" : "Arquero"},
    3 : {"Nombre" : "Nicolas Tagliafico" , "Edad" : 31, "Alto" : 1.72, "Precio" : "15 M de euros", "Posicion" : "Defensa"}
}
print(SeleccionArg)

# para ver uno en particular:
print(SeleccionArg[1])

# para ver solo valores:
print(SeleccionArg.values())

# para recorrer el arreglo, hacemos lo siguiente:
## para ver SOLO num de jugadores:
for llave in SeleccionArg:
    print(llave) 

# para ver todos los datos
for llave, valor in SeleccionArg.items():
    print(llave, valor)

# para ver tamaño y cant de elementos
print(len(SeleccionArg))
