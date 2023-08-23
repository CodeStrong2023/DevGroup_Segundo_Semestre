# Calcular la suma de n numeros.
suma = 0
n = int(input("Digite la cantidad de números a sumarse: "))
for i in range(1, n):
    suma += i
print(f"La suma de los números es: {suma}")