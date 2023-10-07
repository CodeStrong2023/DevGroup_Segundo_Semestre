# Ejercicio 2: Funcion con * args para multiplicar
# Crear una funcion para multiplicar los valores recibidos
# de tipo númerico, utilizando argumentos variables *args
# como parametro de la funcion y regresar como resultado
# la multiplicacion de todos los valores pasados como argumentos

def multiplyValue(*nums):
    resultado = 1
    for num in nums:
        resultado *= num
    return resultado


print(multiplyValue(5, 8, 20))

