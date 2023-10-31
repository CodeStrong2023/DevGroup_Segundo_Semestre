"""La tarea consiste en ingresar elementos al diccionario llamado seleccionArgentina, 
lo elementos a ingresar deben ser como mínimo 4,
estos elementos son los jugadores con su número de camiseta, nombre, apellido, edad, altura,
precio y posición de juego, por supuesto ver el video anterior."""

seleccionArgentina = {
    10: {"Nombre": "Lionel Messi","Edad": 35, "Altura": 1.70, "Precio": "50 millones"},
    11: {"Nombre": "Angel Di Maria","Edad": 35,"Altura": 1.78, "Precio": "75 millones"},
    9: {"Nombre":"Julian Alvarez","Edad": 23, "Altura": 1.70, "Precio": "60 millones"},
    24:{"Nombre":"Enzo Fernandez","Edad": 22, "Altura": 1.78, "Precio": "121 millones"},
    7: {"Nombre": "Rodrigo de Paul","Edad": 29,"Altura": 1.80, "Precio": "40 millones" },
    19: {"Nombre": "Nicolas Otamendi","Edad": 35,"Altura": 1.83, "Precio": "11.9 millones" },
    23: {"Nombre": "Emiliano Martinez","Edad": 31,"Altura": 1.95, "Precio": "28 millones" },
    26: {"Nombre": "Nahuel Molina","Edad": 25,"Altura": 1.75, "Precio": "32 millones" },
    13: {"Nombre": "Cristian Romero", "Edad":25,"Altura": 1.85, "Precio": "50 millones" },
}
for valor in seleccionArgentina.values():
    print(valor)

for keys in seleccionArgentina.keys():
    print(keys)

for valor in seleccionArgentina.items():
    print(valor)

print(len(seleccionArgentina))