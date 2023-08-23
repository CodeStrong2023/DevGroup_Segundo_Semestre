'''
Ejercicio 4: Área y longitud de un circulo
Hacer un programa para ingresar el radio de un circulo y se reporte su área y la longitud 
de la circunferencia.

Área = Pi * r2
Longitud = 2 * Pi * r
En este ejercicio vamos a necesitar importar el modulo math porque tiene el valor de Pi
Se escribe:   import math
'''
import math
PI = math.pi
radio = float(input('Ingrese el radio del círculo: '))
area = PI * (radio**2)
long = 2*PI*radio
print(f'El area del círculo es: {area}')
print(f'La longitud de la circunferencia es: {long}')
