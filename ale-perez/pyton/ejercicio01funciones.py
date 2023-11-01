# ejercicio 01: crear una funcion para sumar los valores recibidos de tipo
#numerico, utilizando argumentos variables *args como parametro de la 
#funcion y agragar como resultado la suma de todos los valores pasados
#definimos una funcion
def sumar_valor(*args):
    resultado = 0
    for valor in args:
        resultado += valor
    return resultado

# Llamamos a la función y mostramos el resultado
print(sumar_valor(3, 5, 9, 2, 1))

