#Ejercicio 1: Calcular la suma de N primeros numeros
N = int(input("Ingrese la cantidad de numeros a sumar : "))
suma = 0
for i in range(N):
    numero = int(input(f"Ingrese el numero {i+1} : "))
    suma += numero
print("La suma de N num es: " , suma)



