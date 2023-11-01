# Ejercicio sumar pares dentro de un rango
#  Hacer un programa para sumar numeros pares dentro de un rango:
#  suma de pares en el rango 2 - 30
#  suma = 240

a = int(input("¿Desde qué numero empezará a sumar?: "))
b = int(input("¿En qué numero para la suma?: "))

suma = 0
for i in range(a, b +1):
    if i%2 == 0: # para saber si es par
        suma += i
print(f"\n La suma dentro de rango es: {suma}")