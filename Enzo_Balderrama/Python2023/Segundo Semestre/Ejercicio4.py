# Ejercicio 4: Sumar pares dentro de un rango
# 
# Hacer un programa para sumar números pares dentro de un rango
# por ejemplo: 
#             suma de números pares del 2 al 30
#             suma = 240
lista = []
suma = 0
for i in range(1, 31):
    lista.append(i)

for i in range(0, len(lista)):
    if(lista[i] % 2 == 0):
        suma += lista[i]
print(lista)
print(f'La suma de los numeros pares de la lista es: {suma}')