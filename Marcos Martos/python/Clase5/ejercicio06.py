# Ejercicio 6: Tabla de multiplicar
# Hacer un programa que pida un número por teclado y guarde
# en una lista su tabla de multiplicar hasta 10. Por ejemplo:
# Sí digita el 5 la lista tendrá: 5,10,15,20,25,30,35,40,45,50.


numero = int(input("Digite un número: "))
lista = []
for i in range(1, 11):
    lista.append(i * numero)

print(f"Tabla de multiplicar del {numero}: {lista}")

for indice, i in enumerate(lista):
    print(f"{numero} x {i} = {lista[indice]}")
