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
