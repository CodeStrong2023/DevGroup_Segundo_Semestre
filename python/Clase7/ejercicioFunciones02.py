# Ejercicio 2: Funcion con * args para multiplicar
# Crear una funcion para multiplicar los valores recibidos
# de tipo númerico, utilizando argumentos variables *args
# como parametro de la funcion y regresar como resultado
# la multiplicacion de todos los valores pasados como argumentos

# Definimos la funcion para multiplicar


def multiplicar_valores(*numeros):
    resultado = 1
    for numero in numeros:
        resultado *= numero
    return resultado


# Llamamos a la función

print(multiplicar_valores(3, 5, 15))
