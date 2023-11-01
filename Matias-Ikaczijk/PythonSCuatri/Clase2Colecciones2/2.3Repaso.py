# las listas son arreglos o vectores, dentro de las colecciones de Python
nombres = ["Matias" , "Carlos" , "Josefina" , "Ariel"]
print(nombres)

# Agregar elemento, puede tener distintos tipos de datos
nombres.append("Gustavo")
nombres.append([1,2,3]) # agregamos una lista de 3 elementos
nombres.append(True) # booleano
nombres.append(10.45) # float
nombres.append([3,7,0]) #listas
nombres.append("No soy un nombre, solo soy un dato mas")

print(nombres)

# concatenar listas

lista1 = [1 , 2 , 3]
lista2 = [5 , 6 , 7]
lista3 = lista1 + lista2
print(lista3)

# para agregar varios elementos a la lista

lista3.extend([9,1,11]) # agregamos otro 1 y ejecutamos la funcion count
print(lista3)

# para saber en que indice está un elemento
print(lista3.index(6))

# con esta funcion podemos ver si hay uno o mas numeros iguales
print(lista3.count(1)) # al imprimir nos dice que solo hay un 1

# para mostrar una lista en reversa
lista3.reverse()
print(lista3)

# para multiplicar una lista repitiendo sus elementos:
lista = [3,4,5] * 2
print(lista3)

# metodos de ordenamiento 
lista3.sort() # por default de manera ascendente los ordena
print(list)

lista3.sort(reverse=True)#para invertirla y mostrarlos de manera descendente 
print(lista3)

tupla = (4,"Hola mundi", 7.30, [2,3,9], "hola", 4)
print(tupla)

print(4 in  tupla)