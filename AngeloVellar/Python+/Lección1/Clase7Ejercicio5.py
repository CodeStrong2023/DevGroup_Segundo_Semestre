#Ejercicio 5: Sistema de calificaciones
#El objetivo del programa será crear un sistema de calificaciones
#de la siguiente manera: Le pedimos al usuario que ingrese un valor del 0 al 10
#Luego si ingresó 9 o 10 Imprimimos A
#Entre 8 y menor a 9 imprimimos B
#Entre 7 y menor a 8 imprimimos C
#Entre 6 y menor a 7 imprimimos D
#Entre 0 y menor a 6 imprimimos F
#De lo contrario el valor ingresado es incrorecto
valor = int(input("Ingrese un valor entre 0 y 10: "))
nota = None
if 9 <= valor <= 10:
    nota = "A"
elif 8 <= valor < 9: 
    nota = "B"
elif 7 <= valor < 8:
    nota = "C"
elif 6 <= valor < 7:
    nota = "D"
elif 0 <= valor < 6:
    nota = "F"
else:
   nota = (input("El valor ingresado es incorrecto" ))
print(f"Usted a obtenido en el examen una {nota}")