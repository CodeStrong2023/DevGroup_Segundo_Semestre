import math  # Importamos la clase math

# Ejercicio de matematicas
# Para sacar la raiz cuadrada de un numero positivo

numero = int(input("Digite un numero positivos: "))
while numero < 0:
    print("Error: debería ser un numero positivo.")
    numero = int(input("Digite un numero positivos: "))
print(f"Su raiz cuadrada es: {math.sqrt(numero):.2f}")
