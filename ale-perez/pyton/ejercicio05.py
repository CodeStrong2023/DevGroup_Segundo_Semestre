numero = int(input('Digite un número positivo: '))

while numero < 0:
    print('Error -> El número debe ser positivo.')
    numero = int(input('Digite un número: '))

factorial = 1

for i in range(1, numero + 1):
    factorial *= i

print(f'El factorial del número {numero} es: {factorial}')
