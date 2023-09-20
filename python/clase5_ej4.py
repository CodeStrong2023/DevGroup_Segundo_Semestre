# Ejercicio 4: Sumar números pares dentro de un rango

a = int(input("Ingrese el valor en el cual desea iniciar la sumatoria: "))
b = int(input("Ingrese el valor en el cual desea finalizar la sumatoria: "))
suma = 0

for i in range(a, b + 1):
    if i % 2 == 0:
        suma += i

print(f"La suma de números pares dentro del rango es: {suma}")
