#Ejercicio 4:Sacar la raíz cuadrada de un número positivo 
import math

numero = int(input("Digite un número positivo:"))
while numero < 0 :
    print("Error, el número ingresado no es valido")
    numero = int(input("Digite un número positivo:"))
print(f"\nSu raiz cuadrada es: {math.sqrt(numero):.2f}")