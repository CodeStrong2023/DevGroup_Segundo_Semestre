'''
# En esta clase vemos la sentencia if/else
condicion = False
if condicion == True:
    print('Condición verdadera.')
elif condicion == False:
    print('Condición falsa.')
else:
    print('Condición no especificada.')
'''
'''
num = int(input('Digite un número en el rango del 1 al 3\n'))
numTexto = ""
if num == 1:
    numTexto = 'Número uno'
elif num == 2:
    numTexto = 'Número dos'
elif num == 3:
    numTexto = 'Número tres'
else:
    numTexto = 'Has ingresado un número fuera de rango'
print(f'El número ingresado es: {num} - {numTexto}')
'''
condicion = False

print('Condicion verdadera') if condicion else print('Condicion Falsa')