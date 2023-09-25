# Ejercicio 5: Factorial de  número positivo 
# Hacer un programa para calcular el factorial de un numero positivo

numero = int(input("Ingrese un numero positivo: "))
while numero < 0: # mientras sea negativo:
    print("Error, el número es negativo")
    numero = int(input("Ingrese un numero POSITIVO: "))
factorial = 1 # var para calcular el factorial
for i in range(1, numero + 1):
    factorial *= i
print(f"\n El factorial del numero {numero} ingresado es: {factorial}")
