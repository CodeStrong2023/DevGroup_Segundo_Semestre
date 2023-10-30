
"""
#lista = Ariel, Lilinana, Natalia, Osvaldo
nombres = ['Naty', 'Osvaldo', 'Lily', 'Ariel']

print(nombres)
print(nombres[0])
print(nombres[1])

print(nombres[-1]) #De esta forma utilizando un numero negativo vas a compenzar a ver la lista de atras para adelante
print(nombres[-2]) 

"""
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