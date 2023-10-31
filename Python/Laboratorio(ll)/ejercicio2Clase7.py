#Ejercicio 2: Función con * args para multiplicar. Crear una función para multiplicar los valores recibidos
#de tipo númerico, utilizando argumentos variables *args, como parámetro de la función y regresar como resultado
# la multiplicación de todos los valores pasados como argumento

def multiplicarValores(*args):
    resultado = 1
    for numero in args:
        resultado *= numero
    return resultado

print(multiplicarValores(3,5,15,20,60,45))
