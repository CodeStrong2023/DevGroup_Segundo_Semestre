# ingresar elementos al diccionario llamado seleccionArgentina, lo elementos a ingresar deben ser como mínimo 4
# estos elementos son los jugadores con su número de camiseta, nombre, apellido, edad, altura, precio y posición de juego.

seleccionArgentina ={
    10:{'Nombre':'Lionel Messi', 'Edad': 35,'Altura': 1.70, 'Precio' : '50 Millones' , 'Posicion': 'Extremo Derecho'} ,
    11:{'Nombre':'Angel Di Maria', 'Edad': 34,'Altura': 1.80, 'Precio' : '12 Millones' , 'Posicion': 'Extremo Derecho' },
    24:{'Nombre':'Paulo Dybala', 'Edad': 28,'Altura': 1.77, 'Precio' : '35 Millones' , 'Posicion': 'Media Punta' },
    19:{'Nombre':'Nicolas Otamendi', 'Edad': 34,'Altura': 1.83, 'Precio' : '3.5 Millones' , 'Posicion': 'Defensa Central' },
    1:{'Nombre':'Franco Armani', 'Edad': 35,'Altura': 1.89, 'Precio' : '3.5 Millones' , 'Posicion': 'Portero' },
    3:{'Nombre':'Nicolas Tagliafico', 'Edad': 31,'Altura': 1.72, 'Precio' : '25 Millones' , 'Posicion': 'Lateral Izquierdo' },
    27:{'Nombre':'Julian Alvarez', 'Edad': 23,'Altura': 1.70, 'Precio' : '40 Millones' , 'Posicion': 'Delantero Central' },
    7:{'Nombre':'Rodrigo De Paul', 'Edad': 29,'Altura': 1.80, 'Precio' : '33 Millones' , 'Posicion': 'Centrocampista' },
    5:{'Nombre':'Leandro Paredes', 'Edad': 29,'Altura': 1.82, 'Precio' : '23 Millones' , 'Posicion': 'Centrocampista' },
}
for llave, valor in seleccionArgentina.items():
    print(llave, valor)

print ('Tenemos cargados en el diccionario la cantidad de jugadores: ', end= ' ')
print(len(seleccionArgentina))