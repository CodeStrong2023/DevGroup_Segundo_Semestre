# Ejercicio 1: Crear una funcion para sumar los valores recibidos de tipo num
# utilizando argumentos variables *args como parametro de la funcion
# y agregar como resultado la suma de todos los valores pasados como argumentos

# DEFINIMOS LA FUNCION

def sumar_valor(*args): # recibimos cant de parametros indefinidos
    resultado = 0 # pass # no dejar vacia la funcion, desp los agrega
    #Iteramos cada elemento:
    for valor in args:
        resultado += valor
    return resultado

# Llamamos la funcion
print(sumar_valor(3,5,9, 2, 11, 1))

