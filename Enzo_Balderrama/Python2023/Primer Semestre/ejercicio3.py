'''
Ejercicio 3: 
Intercambiar el valor de dos variables.
Por ejemplo: 
a = 10    -->   a = 5
b = 5     -->    b = 10
'''
a = input('Digite el valor de a: ')
b = input('Digite el valor de b: ')
aux = a
a = b
b = aux
print(f'El nuevo valor de a es: {a}')
print(f'El nuevo valor de b es: {b}')
