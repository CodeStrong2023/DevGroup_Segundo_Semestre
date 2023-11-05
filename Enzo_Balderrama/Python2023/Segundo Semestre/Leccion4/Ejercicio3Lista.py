# Ejercicio 3: Insertar números y ordenarlos.
#
# Pedir números y meterlos en una lista, cuando el usuario introduzca un 0,
# nuestro programa dejaría de insertar. Por último, mostrar los números
# ordenados de menor a mayor.

lista = []
numero = 1
while (numero != 0):
    numero = int(input("Por favor ingrese un número: "))
    lista.append(numero)
if (numero == 0):
    print("Se ha ingresado un 0. Programa terminado.")
lista.sort()
print(lista)