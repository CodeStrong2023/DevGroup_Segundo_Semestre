# Ejercicio 1: Crear una función para sumar los valores recibidos de tipo
# numericos, utilizando argumentos variables *args como parametro de la funcion
# y agregar como resultado la suma de todos los valores pasados
# como argumentos.


def sumar_valor(*args):
    resultado = 0
    for valor in args:
        resultado += valor
    return resultado


print(sumar_valor(2, 6, 8))
