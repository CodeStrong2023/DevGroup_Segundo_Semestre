'''
Ejercicio 3: Calcular estacion del año
Pedir al usuario que ingrese un mes del año, el valor debe ser entre 1 y 12, luego le decimos
en que estación del año está:
Verano: 1,2,3
Otoño: 4,5,6
Invierno: 7,8,9
Primavera: 10,11,12
'''
mes = int(input("Ingrese un mes del año: "))
estacion = None
if mes >= 1 and mes <= 3:
    estacion = 'Verano'
elif mes >=4 and mes <= 6:
    estacion = 'Otoño'
elif mes >=7 and mes <= 9:
    estacion = 'Invierno'
elif mes >= 10 and mes <= 12:
    estacion = 'Primavera'
else:
    estacion = 'Valor ingresado no valido'

if mes > 12 or mes < 1:
    print(estacion)
else:
    print(f'La estación es: {estacion}')