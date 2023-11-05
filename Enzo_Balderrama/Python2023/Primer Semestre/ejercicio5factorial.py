# Calcular el factorial de un numero mayor o igual a 0.
factorial = 1
num = -1
while num < 0: 
    num = int(input("Digite un número: "))
    if num <0:
        print("Numero ingresado no válido, ingrese un numero entero positivo.")
        
if num == 0 or num == 1:
    factorial = 1
else:
    for i in range(1, num+1):
        factorial *= i
    
print(f'El factorial de {num} es igual a: {factorial}')