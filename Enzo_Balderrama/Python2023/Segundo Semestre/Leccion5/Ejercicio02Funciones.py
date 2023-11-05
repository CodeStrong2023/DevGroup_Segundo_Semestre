# Ejercicio 2: Funcion con * args para multiplicar
# Crear una funcion para multiplicar los valores recibidos
# de tipo numérico, utilizando argumentos variables *args
# como parámetro de la función y regresar como resultado la
# multiplicación de todos los valores como argumento.
def multiplicar(*args):
    total = 1
    for numero in args:
        total *= numero
    return total
# Llamamos a la función
print(multiplicar(2, 3, 4, 5))