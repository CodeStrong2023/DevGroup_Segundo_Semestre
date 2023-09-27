# Ejercicio 1: Crear una función para sumar los valores recibidos de tipo
# numéricos, utilizando argumentos variables *args como parámetro de la
# Función y agregar como resultado la suma de todos los valores pasados
# como argumentos.
def suma(*args): # Recibimos una cantidad de parámetros indefinidos.
    resultado = 0
    # Iteramos cada elemento.
    for i in args:
        resultado += i
    return resultado
# LLamamos a la función
print(suma(3,5,7, 13, 25, 33, 102))
