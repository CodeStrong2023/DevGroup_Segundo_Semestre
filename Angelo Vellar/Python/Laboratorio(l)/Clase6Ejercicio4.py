#Ejercicio 4: Área y longitud de un circulo
#Hacer un programa para ingresar el radio de un circulo y se reporte su área y la
#Longitud de la circunferencia.
#Área = Pi * r2
#Longitud = 2 * Pi * r
import math
radio = float(input ("Digite el radio de la circunferencia: "))
area = math.pi * radio ** 2
longitud = 2 * math.pi * radio
print(f"El area de la circunferencia es: {area} y la longitud es: {longitud}")
