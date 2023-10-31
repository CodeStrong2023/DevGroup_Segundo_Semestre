"""
                                Listas en Python
Las listas en Python son un tipo de dato que permite almacenar datos de cualquier tipo.
Son mutables y dinámicas, lo cual es la principal diferencia con los sets y las tuplas.

Las listas en Python son uno de los tipos o estructuras de datos más versátiles del lenguaje, 
ya que permiten almacenar un conjunto arbitrario de datos. Es decir, podemos guardar en ellas prácticamente lo que sea. 
Si vienes de otros lenguajes de programación, se podría decir que son similares a los arrays.

Ej: lista = [1, 2, 3, 4]

*También se puede crear usando "list" y pasando un objeto iterable.

Ej: lista = list("1234")

*Una lista sea crea con [] separando sus elementos con comas , .Una gran ventaja es que pueden almacenar tipos de datos distintos.

Ej: lista = [1, "Hola", 3.67, [1, 2, 3]]

*Para acceder a una lista debemos hacer lo siguiente:

Lista = ["Angelo",3.49,"H","Milei",4]
print(Lista)

*Si queremos acceder a un dato de la lista en especifico ponemos:

print(Lista[3])
Y nos mostrará en consola "Milei"

*Para recorrer una lista y que nos muestre los datos que queremos ver:

print(Lista[0:3]) #Nos va mostrar los datos 0,1,2 (Angelo,3.49,H)

*También podemos indicarle que nos muestre desde un indice en especifico hasta adelante:

print(Lista[2: ]) #Arrancaría mostrando 2,3,4 (H,Milei,4)

*Para modificar una lista debemos:

Lista[3] = Moreno
print(Lista[3]) #Nos mostrará el cambio en el indice 3 (Milei lo reemplazamos por Moreno)

*Para iterar en una lista hacemos lo siguiente:

for i in Lista:
    print(i)
else:
    print("Se acabaron los elementos de la lista")

    #Preguntamos cuantos elementos tiene
print(len(nombres))_
#Agregamos un elemento
Lista.append("Marcelo")
#Insertar un elemento en un indice especifico
Lista.inset(1,"Alberto")
#Eliminamos un elemento
Lista.remove("Alberto")
#Eliminar el último elemento
nombre.pop()
#Elimina un indice especifico
del Lista[2]_

#Eliminar todos los elementos de una lista
nombres.clear()

#Eliminar una lista
del Lista

#Concatenamos listas
lista1 = [1,2,3]
lista2 = [4,5,6]
lista3 = lista1 + lista2 # Concatenamos

#Para agregar vvarios elementos a una lista
lista3.extend([7,8,9])

#Para que una lista se multiplique reptiendo sus elementos
lista3 = lista3 * 2

#Metodos de ordenamiento
lista3.sort() #Ordena los elementos ascendentemente
lista3.sort(reverse=True) #Ordena los elementos descendentemente
"""
                                        #T.U.P.L.A.S
                                        #T.U.P.L.A.S
                                        #T.U.P.L.A.S

"""
#Definimos Tupla
cocina = ("Cuchara","cuchillo", "tenedor")
print(len(cocina))
#Acceder a un elemento, prara esto utilizamos corchetes no parentesis
print(cocina[0])
#Mostrar de manera inversa
print(cocina[-1])
#Acceder a un rango
print(cocina[0:2])
#Ejemplo
verduras = ("papa",) #Una tupla necesita aun que sea un elemento: la coma, de lo contrario
#Solo seria un tipo str
#Recorremos los elementos de la tupla
for cocinar in cocina: #Print está usando /n para saltos de linea
    print(cocinar, end= " ") #Usamos end= para eliminar los saltos de lineas
"""



                                #DICCIONARIO
                            #D.I.C.C.I.O.N.A.R.I.O

#Un diccionario está compuesto por dos elementos..
#           Ej: "Maradona":10
#Una llave y un valor 

dococumento = {
    "Nombre": "Belen",
    "Edad": "22",
    "Número": "2625669404"
}
#Para ver en pantalla la cantidad de elementos del diccionario:
print(dococumento)
print(len(dococumento)) #Este nos muestra el número la cantidad de elementos. EJ: 3
#Para acceder a un diccionario con la llave(key)
print(dococumento["Nombre"])
#Para modificar elementos de un diccionario
dococumento["Nombre"] = "Angelo"
print(dococumento)
#Para iterar o recorrer los elementos:
for i in dococumento:
    print(i)        #Es para reccorrer las keys nomas

#Para ver el valor y las keys
for i, valor in dococumento.items():
    print(i, valor)
#Otras maneras de acceder a un diccionario
for i in dococumento.keys(): #Estamos usando una funcion
    print(i) #Muestra las llaves

for i in dococumento.values():
    print(i) #Muestra los valores

#Vaciar un diccionario 
dococumento.clear()
#Eliminar diccionario
del dococumento 

                             #SET O CONJUNTO
                          #S.E.T O C.O.N.J.U.N.T.O
#Son grupos de elementos desordenados, donde en cada conjunto hay valores UNICOS ya que 
#no pueden ser duplicados
conjunto = set()
conjunto1 = {"bye",}
conjunto.add(7)
conjunto.add("Hola")
print(conjunto)
conjunto1.add("hola")
print(conjunto1)
print(3 not in conjunto1) # Preguntamos si el número 3 está en el conjunto1