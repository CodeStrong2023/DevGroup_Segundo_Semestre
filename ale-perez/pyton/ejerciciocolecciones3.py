# Escriba un programa donde cree una lista con los siguientes personajes del señor de los anillos
# Nombres: Aragon
#clase: Gerrero
#Raza: duñadan del norte
 
#nombres: gandalf
#clase: mago
# raza istar

#nombre: legolas
#clase: arquero
#Raza: elfo sindar

personajes = [] #creamos una lista vacia
# creamos diccionarios
p = {'Nombre': 'aragon', 'clase': 'gerrero', 'raza': 'dunadan del norte'}
personajes.append(p) #agregramos a la lista un personaje
p = {'Nombre': 'gandalf', 'clase': 'mago', 'raza': 'istar'}
personajes.append(p)
p = {'nombre': 'legolas', 'clase': 'arquero', 'raza': 'elfo sindar'}
personajes.append(p)
#los personajes que agregare son de dragon ball
p = {'nombre': 'goku', 'clase': 'guerrero de clase baja', 'raza': 'sayayin'}
personajes.append(p)
p = {'nombre': 'veggeta', 'clase': 'guerrero de clase alta', 'raza': 'sayayin'}
personajes.append(p)
p = {'nombre': 'picoro', 'clase': 'gerrero/dios', 'raza': 'namekiano'}
personajes.append(p)

print(personajes) 