# Ejercicio 6: Tabla de multiplicar
# Hacer un programa que pida un número por teclado y guarde
# en una lista su tabla de multiplicar hasta el 10. Por ejemplo:
# Si digita el 5 tendra: 5, 10, 15, 20, 25, 30, 35, 40, 45, 50.

lista = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

numero = int(input("Por favor ingrese un número para saber su tabla de multiplicar: "))

for i in range(0, len(lista)):
    lista[i] *= numero

print(f'La tabla del {numero} es:')
for i in range(0, len(lista)):
    print("x ", (i+1), " = ", lista[i])