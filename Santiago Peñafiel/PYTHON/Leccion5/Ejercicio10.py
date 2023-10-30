"""
Ejercico 10: No repetir caracteres
Hacer un programa que pida un acadena por teclado, luego meter los caracteres en una lista sin repetir caracteres.
"""
cadena = input("digite una cadena: ")
lista = []
for i in cadena:
    if i not in lista: # Si el caractere aun no esta en la lista
        lista.append(i) #Lo agregamos a la lista
print(f'\n Lista de caracteres sin repetir ninguno: \n{lista}')