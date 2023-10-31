#Calcular el factorial de un numero mayor o igual a 0

num = int(input("Ingrese un numero entero mayor 0 = 0 :"))
factorial = 1

if num < 0:
    print("El numero debe ser mayor o = 0")
elif num == 0:
    print("El factorial de 0 es 1")
else:
    for i in range(1, num + 1):
        factorial *= i
        print("El factorial de ", num, "es: ", factorial)
        