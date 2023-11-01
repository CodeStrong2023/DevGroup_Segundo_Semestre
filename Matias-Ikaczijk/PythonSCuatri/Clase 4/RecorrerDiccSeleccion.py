# Otra forma de recorrer el diccionario
SeleccionArg = {
    10 : {"Nombre": "Lionel Messi", "Edad" : 36, "Alto" : 1.7, "Precio" : "280.8 M de euros", "Posicion" : "Delantero"},
    9 : {"Nombre" : "Julian Alvarez", "Edad" : 23, "Alto" : 1.7, "Precio" : "21.48 M de euros", "Posicion" : "Delantero"},
    24 : {"Nombre" : "Leandro Paredes" , "Edad" : 29, "Alto" : 1.83, "Precio" : "27.8 M de euros", "Posicion" : "Centrocampista"},
    1 : {"Nombre" : "Franco Armani" , "Edad" : 36, "Alto" : 1.88, "Precio" : "3 M de euros", "Posicion" : "Arquero"},
    23 : {"Nombre" : "Emiliano Martinez" , "Edad" : 31, "Alto" : 1.95, "Precio" : "28 M de euros", "Posicion" : "Arquero"},
    3 : {"Nombre" : "Nicolas Tagliafico" , "Edad" : 31, "Alto" : 1.72, "Precio" : "15 M de euros", "Posicion" : "Defensa"}
}
print(SeleccionArg)

# Nos muestra el numero --> luego  la info

for i in SeleccionArg:
    print(f"{i} --> {SeleccionArg[i]}")