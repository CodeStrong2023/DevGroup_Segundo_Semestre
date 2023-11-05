"""Leer 10 numeros e imprimir cuantos son positivos,
cuantos negativos y cuantos neutros."""

contadorPos = 0
contadorNeg = 0
contadorNeutro = 0
for i in range(0,10):
    num = float(input("Ingrese un numero: "))
    if num > 0:
        contadorPos += 1
    elif num < 0:
        contadorNeg += 1
    elif num == 0:
        contadorNeutro += 1
else:
    print(f'Hay {contadorPos} números positivos.')
    print(f'Hay {contadorNeg} números negativos.')
    print(f'Hay {contadorNeutro} números neutros.')