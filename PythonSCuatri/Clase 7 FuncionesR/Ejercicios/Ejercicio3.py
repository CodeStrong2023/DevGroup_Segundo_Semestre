# Ejercicio Funcion Recursiva:

# Imprimir numeros de 5 a 1 de manera descentente usando funciones recursivas
# Puede ser cualquier valor positivo..

# EJEMPLO: Si ponemos 5, deberia salir esto..
# 5, 4, 3, 2 , 1 

def imprimirNumerosRecursivos(numero): #llega el parametro
    if numero >= 1: # entra el numero, revisa si es mayor o =
        print(numero) # entra y muestra
        imprimirNumerosRecursivos(numero - 1) # lo llama y entra un numero menos, asi va entrando y mostrando..
    elif numero == 0:
        return
    elif numero <= 0:
        print("Valor incorrecto..")
NumRecursivo = int(input("Ingrese un numero para ver su recursividad.. "))
imprimirNumerosRecursivos(NumRecursivo)