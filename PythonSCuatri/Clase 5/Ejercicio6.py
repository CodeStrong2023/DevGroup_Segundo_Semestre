# Ejercicio 6: Tabla de multiplicaar

# Hacer un programa que pida un numero por teclado, guarde
# en una lista su tabla de multiplicar hasta el 10.
 # Por ejemplo: si se digita el 5, la lista tendrá 5,10,15,20,25,30..

numero = int(input("Ingrese un número para realizar su tabla de multiplicacion.. "))
lista = []
for i in range(0,10):
    lista.append(i * numero)
print(f"\n La tabla de multiplicar del número ingresado es: \n {lista}")

# para mostrarlo en forma de tabla:

for indice, i in enumerate(lista):
    # deberia agregar una variable que vaya recorriendo 1 en 1
    print(f"{numero} x {i} = {lista[indice]}")