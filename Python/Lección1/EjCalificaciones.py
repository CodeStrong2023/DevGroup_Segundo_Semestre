#Ejercicio 4: Suponga que se tiene un conjunto de calificaciones de un grupo de 10 alumnos
#Realizar algortimo para calcular la calificacion promedio y la calificacion mas baja de todo el 
#grupo
AlumnosTotal = 10
calificaciones = []

for i in range(10):
    calificacion = float(input(f"Ingrese la calificacion {i+1}: "))
    calificaciones.append(calificacion)
    promedio = sum(calificaciones) / AlumnosTotal
    notaMinima = min(calificaciones)
print("Promedio de calificaciones: ", promedio)
print("La nota mas baja es: " , notaMinima)
