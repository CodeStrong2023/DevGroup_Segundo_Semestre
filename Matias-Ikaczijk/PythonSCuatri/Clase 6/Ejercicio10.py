# Ejercicio 10: No repetir caracteres

# Hacer un programa que pida una cadena por teclado, 
# luego meter los caracteres en una lista sin rep caracteres

cadena = input("Escriba una cadena: ")
lista = []
for i in cadena:
    if i not in lista: # si el caracter no esta en lista
        lista.append(i)
print(f"\n Lista sin repetir ninguno.. \n {lista}")