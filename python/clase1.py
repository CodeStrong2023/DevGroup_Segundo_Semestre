# Ejercicio 1: Iterar un rango de 0 a 10 e imprimir numeros divisibles entre 3

print("Rango de 0 a 10 con números divisibles entre 3: ")
for i in range(11):
    if i % 3 == 0:
        print(i)

# Ejercicio 2: Crear un rango de numeros de 2 a 6 e imprimirlos

print("Rango con valores de inicio = 2 y fin = 6")
rango = range(2, 7)
for i in rango:
    print(i)

# Ejercicio 3: Crear un rango de 3 a 10 pero con incremento de 2 en 2, en lugar de 1 en 1

print("Rango de valores de inicio = 3 y fin = 10 con incremento = 2")
for i in range(3, 11, 2):
    print(i)

