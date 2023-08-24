#Ejercicio 1: iterar rango de 0 a 10, imprimir numeros divisibles entre 3 

print("Rango de 0 a 10 con numeros divisibles entre 3:")
for i in range(11):
    if i % 3 == 0:
        print(i)

#Ejercicio 2: crear de 2 a 6, imprimir

print("Rango de 2 a 6:")
rango = range(2,7)
for i in rango:
    print(i)

#Ejercicio 3: rango de 3 a 10 con incremento de 2 en 2 

print("Rango 3-10 de 2 en 2:")
for i in range(3, 11, 2):
    print(i)