'''
Ejercicio 2:
Determinar la solución lógica de la siguiente operación.

((3 + 5 x 8 ) < 3 and ((- 6/3 x 4 ) + 2 < 2)) or ( a > b)

'''
a = float(input('Digite el valor de a: '))
b = float(input("Digite el valor de b: "))
resultado =  bool(((3 + 5 * 8 ) < 3 and ((- 6/3 * 4 ) + 2 < 2)) or ( a > b))
print(f'El resultado es: {resultado}')