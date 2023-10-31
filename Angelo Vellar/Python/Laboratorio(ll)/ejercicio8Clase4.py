#Ejercicio 8: Insertar elementos y ordenarlos
#Pedir números y meterlos en una lista, cuando el usuario introduzca un numero 0
#nuestro programa dejaria de insertar.
#Por último, mostrar los números ordenados de menor a mayor

lista = []
num = int(input("Digite un número: "))
while num != 0:
    num = int(input("Digite un número: "))
    lista.append(num)
lista.sort() #La lista está ordenada con esta función
print(f"\nLista ordenada: {lista}")


#METODO PROFESOR
lista = []
salir = False
while not salir:
    numero = int(input("Digite un número: "))
    if numero == 0:
        salir = True
    else:
        lista.append(numero)
lista.sort()
print(f"\nLista ordenada: {lista}")
