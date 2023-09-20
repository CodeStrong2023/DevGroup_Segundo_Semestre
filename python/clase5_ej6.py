# Ejercicio 6: Tabla de multiplicar

numero = int(input("Ingrese un valor: "))
lista = []
for i in range(1, 11):
    lista.append(i * numero)

print(f"Tabla de multiplicar del {numero}: {lista}")

for indice, i in enumerate(lista):
    print(f"{numero} x {i} = {lista[indice]}")

