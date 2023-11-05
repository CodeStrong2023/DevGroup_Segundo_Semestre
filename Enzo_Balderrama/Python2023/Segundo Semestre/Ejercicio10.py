# Ejercicio 10: No repetir caracteres.
# Hacer un programa que pida una cadena por teclado.
# Colocar los caracteres dentro de una lista sin repetir caracteres.

lista = input("Digite una cadena: ")
lista2 = []
for i in lista:
    if i not in lista2:
        lista2.append(i)
print(lista2)