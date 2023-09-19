# Ejercicio 5: Factorial de un número positivo
# Hacer un programa para calcular el factorial de un número positivo

numero = int(input("Digite un número: "))
while numero < 0:
    print("ERROR -> El número debe ser positivo")
    numero = int(input("Digite un número: "))

factorial = 1

for i in range(1, numero + 1):
    factorial *= i

print(f"El factorial del numero {numero} positivo ingresado es: {factorial}")
