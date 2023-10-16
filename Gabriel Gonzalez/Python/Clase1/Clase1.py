# Clase 1: Listas, Tuplas
# Las listas en otros lenguajes se la conoce como arreglos o vectores
# Listas = Ariel, Natalia, Liliana, Osvaldo
nombres = ['Naty', 'Ariel', 'Lyly', 'Osvaldo']
print(nombres)
print(nombres[0])
print(nombres [0:2]) #Solo muestra el indice 0,1 pero no el indice 2
# Ir del inicio de la lista hasta el indice (Sin incluirlo)
print(nombres [ :3])
#Desde el indice indicado hasta el final
print(nombres [1: ])
# Modificar un valor
nombres[2] = 'Liliana'
nombres[0] = 'Natalia'
print(nombres)
#Iterar una lista
for nombre in nombres: #nombre es singular, lista es plural
    print(nombre)
else:
    print('Se acabaron los elementos en la lista') 

# Preguntamos cuantos elementos tiene la Lista
print(len(nombres))#Le pasamos como parametro lista
# Agregar un elemento
nombres.append('Sergio')
nombres.append([1,2,3])
nombres.append(10.45)
nombres.append([4,5])
nombres.append(7)
print(nombres)
# Insertar un elemento en un indice especifico
nombres.insert(1, 'Alberto')
print(nombres)
nombres.insert(3,'Luciano')
print(nombres)
# Eliminar un elemento
nombres.remove('Alberto')
print(nombres)
# Eliminar el ultimo elemento
nombres.pop()
print(nombres)
#Eliminar un indice especificado 
del nombres[2] #del significa delete (eliminar)
print(nombres)
# Eliminar, borrar o limpiar todos los elementos
nombres.clear()
print(nombres)
# Para eliminar la lista
del nombres
# print(nombres) #aqui nos va a mostrar un error


# Definimos una tulpa 
cocina = ('cuchara', 'cuchillo', 'tenedor')
print(len(cocina))
#Acceder a un elemento, para esto utilizamos corchetes en vez de parentesis
print(cocina[0])
#Mostrar de manera inversa
print(cocina[-1])
#Acceder a un rango
print(cocina[0:1])
#Ejemplo
verduras = ('papa',) #la tulpa necesita aunque sea de un elemento la coma, sin coma es de un tipo string
# Recorremos los ementos de la tupla
for cocinar in cocina:#print esta usando \n para saltos de linea
    print(cocinar, end=' ') #Usamos end para eliminar saltos de linea


