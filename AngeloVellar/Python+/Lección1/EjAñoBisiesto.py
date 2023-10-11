#Diseñar un programa que ingresado un año, nos devuelva
#Por consola si es un año bisiesto o no, repetir la
#accion hasta que el usuario lo desida.
anio = int(input("Ingrese un año para ver si es bisiesto o no: "))

if (anio % 4 == 0) and (anio % 100 != 0) and anio % 400 != 0:
    print("El año es bisiesto")
else:
    print("El año no es bisiesto")

