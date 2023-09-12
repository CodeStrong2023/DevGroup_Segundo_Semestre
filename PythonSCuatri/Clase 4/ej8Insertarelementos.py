# --- Ejercicio: Insertar numeros y ordenarlos ----
 
# Pedir numeros y meterlos en una lista, cuando el usuario
# introduzca un numero 0, el programa dejaria de insertar..
# Por ultimo, mostrar los numeros ordenados de mayor a menor

lista = []
salir = False
while not salir: # mientras salir sea False, lo cambiamos a V
    numero = int(input("Escriba un numero: "))
    if numero  == 0: # cuando pone 0, salir pasa a ser True
        salir = True
    else: # mientras no sea 0.. se agrega ek num a la lista
        lista.append(numero)
# Funcion para ordenar:
lista.sort()
print(f" Lista ordenada: \n{lista}")