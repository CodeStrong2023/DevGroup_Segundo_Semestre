#Ejercicio 7: Ingresar N enteros y calc la suma de los numeros pares de la lista, cuantos numeros pares existen
#y cual es el promedio de los num impares
N = int(input("Ingrese la cantidad de numeros requeridos: "))
numeros = []
sumaPares = 0
sumaImpares = 0
cantidadPares = 0
cantidadImpares = 0

for i in range(N):
    numero = int(input(f"Ingre el número {i+1}: "))
    numeros.append(numero)

    if numero % 2 == 0: #PAR
        sumaPares += numero
        cantidadPares += 1
    else: #Impar
        sumaImpares += numero
        cantidadImpares += 1
promedioImpares = sumaImpares / cantidadImpares if cantidadImpares > 0 else 0 

print("Suma de los números pares:", sumaPares)
print("Cantidad de númers pares: ", cantidadPares)
print("Promedio de los números impares:", promedioImpares)