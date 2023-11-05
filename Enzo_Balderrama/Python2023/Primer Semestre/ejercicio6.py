# Ingresar "N" números enteros, visualizar la suma de los pares, cuantos pares existen
# y el promedio de los impares.

canPar = 0
sumaPar = 0
sumaImpar = 0
canImpar = 0
n = int(input("Digite la cantidad de numeros a ingresar: "))
for i in range(0, n):
    num = int(input("Digite un n° entero: "))
    if num % 2 == 0:
        canPar += 1
        sumaPar += num
    else:
        sumaImpar += num
        canImpar += 1
promImpar = sumaImpar / canImpar

print(f'La suma de los números pares es: {sumaPar}')
print(f'La cantidad de números pares es: {canPar}')
print(f'El promedio de los números impares es: {promImpar}')