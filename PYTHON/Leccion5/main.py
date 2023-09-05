# Todas estas pertenecen a las colecciones en Python (listas, tuplas, diccionarios)
# las listas son lo que se conocen en otro lenguajes como arreglos o arrays, o vectores


#lista = Ariel, Lilinana, Natalia, Osvaldo
nombres = ['Naty', 'Osvaldo', 'Lily', 'Ariel']

print(nombres)
print(nombres[0])
print(nombres[1])

print(nombres[-1]) #De esta forma utilizando un numero negativo vas a compenzar a ver la lista de atras para adelante
print(nombres[-2]) 


nombres = ['Naty', 'Osvaldo', 'Lily', 'Ariel']
print(nombres)
print(nombres[0:2]) # Solo nos muestra el indice 0,1 pero no el indice 2

#Para ir del inicio de la lista al indice (sin incluirlo)
print(nombres[:3]) # si dejamos vacio siginifica que es desde el inicio 
print(nombres[1:])

# Modificamos un valor
nombres[2] = 'Liliana'
nombres[0] = 'Natalia'
print(nombres)

#iterar una lista

for nombre in nombres : #nombre es singular, la lista es plural
    print(nombre)
else:
    print('Se acabaron los nombres de la lista')


    #Definimos un tupla
cocina = ('cuchara', 'cuchillo', 'tenedor')
print(len(cocina)) #funcion "len" sirve para saber cuantos elementos tenemos dentro de una tupla

#Agregamos elementos

nombres.append('Marcelo')
nombres.append([1, 2, 3])
nombres.append(True)
nombres.append(10.45)
nombres.append([4, 5])
nombres.append(7)

print(nombres)

#Acceder a un elemento, para esto si usamos corchetes y no parentesis
print(cocina[0])
#Mostrar de manera inversa 
print(cocina[-1])

#Acceder a un rango 
print(cocina[0:2])

#ejemplo para que sea si o si una tupla necesita llevar la "," despues del primer elemento, sino es un tipo string
verduras = ('papa') #esto no es una tupla

# Tipo set  
# (el orde es aleatorio ,por lo tanto los elemento no tienen indice y por lo tanto sin orden)

planetas ={'Marte', 'Jupiter', 'Venus'}
print(planetas)
print(len(planetas)) #usamos la funcion len para saber el largo de nuestra coleccion      

#revisar si un elemento existe o no  dentro de set (coleccion)
print('Marte' in planetas)

#Agregamos un elemento 
planetas.add('Tierra') #add es una funcion para agregar
planetas.add('Tierra') # Si queremos volver a agregar un elemento el cual sea repetido no nos va a mostrar, ya que no lo permite tener elementos repetidos

print(planetas)

# Eliminar elementos, puede arrojar error si el elemento no existe
planetas.remove('Jupiter')
print(planetas)

planetas.discard('Tierra') #sirve para eliminar un elemento tambien, si no ponemos bien el nombre del elemento no lo elimina, pero no nos va a dar error como cuando usamos "remove"
print(planetas) 

#limpiar set
planetas.clear()
print(planetas)

#eliminar set o conjunto
del planetas
#print(planetas) #al eliminar nos muestra un error porque ya no existe

# 'Maradona' : 10 un diccionario esta compuesto por dos elementos, "una llave" y un "valor"
#dict(key, value)
diccionario = {
    'IDE': 'Integrated Development environment', #siempre al final lleva , 
    'POO': 'Programacion orientada a objetos',
    'SABD': 'Sistema de administracion de base de datos' #menos el ultimo elemento

}
#Verificamos la cantidad de elementos de un diccionario
print(len(diccionario))
print(diccionario)

#Acceder a un diccionario con la llave key
print(diccionario['IDE'])

#otra forma de recuperar un elemento
print(diccionario.get('POO'))
print(diccionario.get('SABD'))

#MODIFICAR LOS ELEMENTOS
diccionario['IDE'] = 'Entorno de desarrollo integrado' # LOS DICCIONARIOS SI SE PUEDEN CAMBIAR LOS ELEMENTOS

print(diccionario)

#como recorrer los elementos 
for termino in diccionario: #recorremos unicamente las llaves
    print(termino)

#Necesitamos una funccion para recorrer un diccionario "esta es ITEMS()"
for termino, valor in diccionario.items():
    print(termino,valor)

#otras maneras de accerder a un diccionario
for termino in diccionario.keys(): #estamos usando una funcion
         print(termino) #muestra solo las llaves 
 
 
#usamos una funcion para acceder al valor 
for valor in diccionario.values():
     print(valor)

#comprobamos la existencia de algun elemento
print('IDE' in diccionario) # devuevle un booleano 

#agregamos un elemento al diccionario
diccionario['PK'] = 'Primary Key'
print(diccionario)

#eliminar un elemento
diccionario.pop('SABD')
print(diccionario)

#vaciar un diccionario
diccionario.clear()
print(diccionario)

#eliminar diccionario   
del diccionario

#concatenamos listas 
lista1 =[1, 2, 3, 1]
lista2 = [4, 5 ,6, 1 ]
lista3= lista1+ lista2 # asi concatenamos 

print(lista3)

lista3.extend([7, 8 , 9, 1 ]) # funcion para agregar varios elementos a una lista 
print(lista3)

print(lista3.index(5)) # funcion para ubicar en que indice se encuentra el valor que buscamos ,( si lo colocamos mal va a dar un error al igual que si no esta)

#como saber cuantos valores repetidos hay en una lista
print(lista3.count(1))

#para poner una lista al reves o darla vuelta 
lista3.reverse()
print(lista3)

# Para que una lista se multiplique repitiendo sus elementos 
lista3 = lista3 * 2
print(lista3)

# Metodos de ordenamiento 
lista3.sort() # ordena todos los elementos ascendentemente
lista3.sort(reverse=True) # ordena todos los elementos descendentemente
print(lista3)


# las tuplas son listas INMUTABLES, ( no se pueden modificar ) y pueden tener diferentes tipos de datos dentro

tupla = (3, 'hola', 6.78, [1, 2, 78,], 4, 'Hola') # puede tener diferentes tipos de datos dentro
print(tupla)

print( 4 in tupla) # Accion booleana para buscar un elemento dentro ,y nos reponde de forma booleana

#LO QUE PODEMOS USAR DENTRO DE TUPLAS: index, count, len
# En tuplas se puede vconverti de tupla a lista y lista a tupla


#Repaso de set o conjunto
#para definir un conjunto

conjunto= set() # de esta forma le podremos agregar con la funcion .add, por mas que lo inicializamos vacio
conjunto1 = {'Bye'} # una vez inicializado asi el conjunto con las {} estando vacio no se le pueden agregar mas elementos, si o si tiene que tener al menos uno


conjunto.add(7)
conjunto.add('Hola')
print(conjunto)

conjunto1.add('Hola')
print(conjunto1)
print(3 not in conjunto1) # preguntamos si el numero 3 no esta en el conjunto1

#como hacer la igualdad de dos conjuntos
print(conjunto == conjunto1) # nos devuelve como respuesta un booleano

#operaciones en conjuntos
conjunto3 = conjunto1| conjunto # la linea | une los dos conjuntos
print(conjunto3) # si se repitiera un elemento , el mismo quedaria borrado

conjunto3= conjunto & conjunto1 #que elemento tienen en comun
print(conjunto3)

conjunto3 = conjunto - conjunto1 #Asigna el valor dque esta en el conjunto y no en el conjunto2
print(conjunto3)
conjunto3= conjunto1 - conjunto
print(conjunto3)

conjunto3= conjunto ^ conjunto1 # Elementos que no comparten o son diferentes entre ambos 
print(conjunto3)

conjunto3 = conjunto | conjunto1
print(conjunto.issubset(conjunto3)) # aqui preguntamos si un conjunto es un subonjunto dentro de otro
print(conjunto1.issubset(conjunto3))
print(conjunto3.issubset(conjunto))
print(conjunto3.issubset(conjunto1))

print(conjunto3.issuperset(conjunto)) #preguntamos si los elementos del conjunto1 estan dentro del 3
print(conjunto3.issuperset(conjunto1)) # Si es verdadero quiere decir que el conjunto3 es superconjunto
print(conjunto1.issuperset(conjunto3))

#como saber si ambos conjuntos son disconexos, esto es si no comparten ningun elemento en comun
print(conjunto.isdisjoint(conjunto1)) # no hay cosas en comun

#convertir un conjunto totalmente en inmutable
conjunto = frozenset #esto hace que el conjunto sea totalmente inmutable
#no se puede agregar, modificar, ni eliminar elementos del conjunto 


#Repaso diccionarios 
diccionarioNuevo = {'azul': 'blue', 'rojo' : 'red', 'verde' :'green', 'amarillo' : 'yellow'}
print(diccionarioNuevo)

#como eliminar un elemento
del (diccionarioNuevo['azul'])
print(diccionarioNuevo)

#los diccionarios pueden almacenar diferentes tipos de datos
diccionario2 = {'Ariel' : {'Edad': 40, 'Altura' :1.83}, 'Osvaldo':[45, 1.85], 'Natalia': [35, 1.67]}
print(diccionario2)


# ingresar elementos al diccionario llamado seleccionArgentina, lo elementos a ingresar deben ser como mínimo 4
# estos elementos son los jugadores con su número de camiseta, nombre, apellido, edad, altura, precio y posición de juego.

seleccionArgentina ={
    10:{'Nombre':'Lionel Messi', 'Edad': 35,'Altura': 1.70, 'Precio' : '50 Millones' , 'Posicion': 'Extremo Derecho'} ,
    11:{'Nombre':'Angel Di Maria', 'Edad': 34,'Altura': 1.80, 'Precio' : '12 Millones' , 'Posicion': 'Extremo Derecho' },
    24:{'Nombre':'Paulo Dybala', 'Edad': 28,'Altura': 1.77, 'Precio' : '35 Millones' , 'Posicion': 'Media Punta' },
    19:{'Nombre':'Nicolas Otamendi', 'Edad': 34,'Altura': 1.83, 'Precio' : '3.5 Millones' , 'Posicion': 'Defensa Central' },
    1:{'Nombre':'Franco Armani', 'Edad': 35,'Altura': 1.89, 'Precio' : '3.5 Millones' , 'Posicion': 'Portero' },
}
for llave, valor in seleccionArgentina.items():
    print(llave, valor)

#como tarea agregar por lo menos 4 jugadores mas al diccionario: seleccionArgentina
print ('Tenemos cargados en el diccionario la cantidad de jugadores: ', end= ' ')
print(len(seleccionArgentina))

#Pilas usando Listas
pila =[1, 2 , 3]

#Agregamos elementos a la pila por el final
pila.append(4)
pila.append(5)
print(pila)

#Sacamos elementos desde el final 
pila.pop()
print(pila)

elementoBorrado =pila.pop() # quita el ultimo elemento ylo guarda en la variable
print(f'Sacamos el elemento: {elementoBorrado}')
print(f'La pila ahora quedo asi : {pila} ')

#colas con listas 
#Estructura de datos de tipo fifo (first input /first output)

cola = ['Ariel', 'Osvaldo', 'Liliana', 'Pilar']
#Agregamos elementos al final de la cola
cola.append('Natalia')
cola.append('Jose')
print(cola)

#Sacamos elementos de la cola 
seRetira= cola.pop(0)
print(f'Atendido el cliente: {seRetira}')
print(cola)

seRetira= cola.pop(0)
print(f'Atendido el cliente: {seRetira}')
print(cola)

seRetira= cola.pop(0)
print(f'Atendido el cliente: {seRetira}')
print(cola)

seRetira= cola.pop(0)
print(f'Atendido el cliente: {seRetira}')
print(cola)

seRetira= cola.pop(0)
print(f'Atendido el cliente: {seRetira}')
print(cola)