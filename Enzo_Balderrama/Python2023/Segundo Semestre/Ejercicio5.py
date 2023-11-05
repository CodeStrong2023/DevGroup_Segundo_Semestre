# Ejercicio 5: Factorial de un número positivo
# Hacer un programa para calcular el factorial de un número positivo

numero = int(input("Digite un número para calcular su factorial: "))
while(numero <0):
    if (numero < 0):
        print("ERROR. Debe ingresar un número mayor o igual a 0.")
        numero = int(input("Digite un número: "))

factorial = 1

if (numero == 0 | numero == 1):
    factorial = 1
else:
    for i in range(numero, 0, -1):
        factorial *= i

print(f'El factorial de {numero} es: {factorial}')