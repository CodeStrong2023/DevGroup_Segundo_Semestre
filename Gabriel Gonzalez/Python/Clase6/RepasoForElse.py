numbers = [1, 2, 3, 4, 5] # Aun con el la lista vacia se va ejecutar el else
for n in numbers:
    print(n)
    if n == 3:
        break # Esta es la unica manera para que no se ejecute el else
else:
    print("Esto se termino")
