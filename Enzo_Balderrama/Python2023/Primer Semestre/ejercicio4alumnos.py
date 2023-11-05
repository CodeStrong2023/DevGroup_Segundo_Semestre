'''Suponga que tiene un conjunto de calificaciones de un grupo de 10 alumnos.
Realizar un algoritmo para calcular la calificacion promedio y la calificacion mas baja
del grupo.
'''
notaMenor = 10
sumaNotas = 0
for i in range(0,10):
    nota = float(input("Ingrese nota del alumno: "))
    sumaNotas += nota
    if notaMenor > nota:
        notaMenor = nota
promedio = sumaNotas / 10
print(f"La nota promedio del grupo es: {promedio}")
print(f"La nota más baja del grupo es: {notaMenor}")