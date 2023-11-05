# Ciclo While
"""contador = 0
while contador < 78:
    print("Ejecutando el ciclo while", contador)
    contador += 1
else:
    print("Fin del ciclo while")
maximo = 5
contador = 0
while contador <= maximo:
    print(contador)
    contador += 1

minimo = 1
contador = 5
while contador >= minimo:
    print(contador)
    contador -=1
#Ciclo for
cadena = "Hello"
for letra in cadena:
    print(letra)
else:
    print("Fin del ciclo for.")
#Palabra reservada break
for letra in "Alemania":
    if letra == 'm':
        print(f'Letra encontrada: {letra}')
        break
else:
    print("Fin del ciclo for")
# Palabra reservada continue
for i in range(6):
    if i%2 != 0:
        continue
    print(f'valor: {i}')"""
# Diseñar un programa que ingresado un año, nos devuelva
# si es biciesto o no, repetir la accion hasta que el usuario lo decida.
print("Comprobamo qué año es biciesto.")
opc = "S"
while opc == "S" or opc == "s":
    num = int(input("Ingrese año: "))
    if (num % 4 == 0) and (num % 100 != 0) or num % 400 == 0:
        print("El año es biciesto.")
    else:
        print("El año no es biciesto")
    opc = input("¿Desea ingresar un nuevo valor?")
