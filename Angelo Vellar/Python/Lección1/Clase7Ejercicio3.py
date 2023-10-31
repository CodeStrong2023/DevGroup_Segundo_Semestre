#Ejercicio 3: Calcular la estación del año
#Pedir al usuario que ingrese un mes del año, el valor debe ser entre 1 y 12, luego le decimos
#en que estación del año esta:
num = int (input(" Digite un número entre el 1 y 12 para saber en que estación del año está: "))
numMes = ""
if num == 1:
    numMes = "Está en Verano"
elif num == 2:
    numMes = "Está en Verano"
elif num == 3:
    numMes = "Está en verano"
elif num == 4:
    numMes = "Está en Otoño"
elif num == 5:
    numMes = "Está en Otoño"
elif num == 6:
    numMes = "Está en Otoño"
elif num == 7:
    numMes = "Está en Invierno"
elif num == 8:
    numMes = "Está en Invierno"
elif num == 9:
    numMes = "Está en Invierno"
elif num == 10:
    numMes = "Está en Primavera"
elif num == 11:
    numMes = "Está en Primavera"
elif num == 12:
    numMes = "Está en Primavera"
else:
    numMes = "El valor ingresado está fuera del rango estipulado"
print(f"El número {num} = {numMes}")
