'''
Ejercicio 1:
Escribir la siguiente expresión en forma de expresión algorítmica.
(a3 x (b2 - 2ac))/2b
1. Pedimos al usuario los valores de a, b y c.
2. Mostramos el resultado final.
'''

a = float(input('Digite el valor de a: '))
b = float(input('Digite el valor de b: '))
c = float(input('Digite el valor de c: '))

resultado = (a ** 3 * (b ** 2 - 2*a*c))/ (2*b)

print(f'El resultado de la expresión es: {resultado}')

