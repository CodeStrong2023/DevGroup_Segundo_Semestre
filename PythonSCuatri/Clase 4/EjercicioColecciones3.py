# Ejercicio 3:
# Agregar personajes de la saga "El señor de los anillos" a una lista 

personajes = [] # creamos lista vacia

# creamos diccionario
P1 = {"Nombre" :"Aragon", "Clase" : "Guerrero", "Raza" : "Dúnadan del norte"}

# agregamos al personaje a nuestra lista
personajes.append(P1)

P2 = {"Nombre" :"Gandalf", "Clase" : "Mago", "Raza" : "Istar"}
personajes.append(P2)

P3 = {"Nombre" :"Legolas", "Clase" : "Arquero", "Raza" : "Elfo Sindar"}
personajes.append(P3)

P4 = {"Nombre" :"Sauron", "Clase" : "maiar", "Raza" : "ainur"}
personajes.append(P4)

P5 = {"Nombre" :"Gollum", "Clase" : "-", "Raza" : "seres antropomorfos"}
personajes.append(P5)


print(f"Mostramos la lista con los personajes:  {personajes}")
