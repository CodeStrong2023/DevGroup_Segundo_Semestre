# Ejercicio 3: Insertar elementos y ordenarlos
# Pedir numeros y meterlos en una lista, cuando el usuario
# indtroduzca un numero 0, nuestro programa dejaria de insertar
# Por último, mostrar los numeros ordenados de menor a mayor

lista = []
salir = False
while not salir:
    numero = int(input("Digite un numero: "))
    if numero == 0:
        salir = True
    else:
        lista.append(numero)

lista.sort()  # Ordena la lista
print(f"Lista ordenada: {lista}")
