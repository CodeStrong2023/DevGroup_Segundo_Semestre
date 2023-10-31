#Ejercicio 01: Crear una funcion para sumar los valores recibidos de tipo
#numéricos,utilizando argumentos variblaes *args como parametro de la funcion
#y agregar como resultado la suma de todos los valores pasados cómo argumentos

def sumar(*args): #Recibimos una cantidad de parámetros indefinidos
    resultado = 0
    #Iteramos elemento
    for valor in args:
        resultado += valor
    return resultado
#Llamamos a la función
print(sumar(3,5,9,3,5,6,7,312,3,5))
