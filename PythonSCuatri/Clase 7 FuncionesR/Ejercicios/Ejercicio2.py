# Ejercicio2: Funcion con *args para multiplicar

# Crear una funcion para multiplicar los valores recibidos de tipo num,
# utilizando argumentos variables * args como parametro de la funcion y
# regresar como result la multiplicacion de todos los valores  pasados como argumento

# DEFINIMOS LA FUNCION PARA MULTIPLICAR

def mult_valores(*numeros):
    resultado = 1 # ponemos 1 para q nos sirva a la hora de multip
    for numero in numeros:
        resultado *= numero
    return resultado

# Llamamos la funcion 
print(mult_valores(3,5,15)) #le pasamos argumentos