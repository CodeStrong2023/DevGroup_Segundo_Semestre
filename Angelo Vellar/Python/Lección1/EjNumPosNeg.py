#Ejercicio 3: Leer 10 numeros e imprimir cantidad de positivos, negativos y neutros
NumPositivo = 0
NumNegativo = 0
NumNeutro = 0

for i in range(10):
    numero = float(input(f"Ingrese un número: {i + 1} : "))
    if numero > 0:
        NumPositivo += 1
    elif numero < 0:
        NumNegativo += 1
    else:
        NumNeutro += 1
print("La cantidad de numeros positivos es: ", NumPositivo)
print("La cantidad de numeros neutros es: ", NumNeutro)
print("La cantidad de numeros negativos es: ", NumNegativo)
