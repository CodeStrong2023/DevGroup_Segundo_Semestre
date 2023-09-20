# Ejercicio 5: Factorial de un número positivo

numero = int(input("Digite un número: "))
while numero < 0:
    print("El valor no es positivo!")
    numero = int(input("Digite un número: "))

factorial = 1

for i in range(1, numero + 1):
    factorial *= i

print(f"El factorial del numero {numero} positivo ingresado es: {factorial}")
