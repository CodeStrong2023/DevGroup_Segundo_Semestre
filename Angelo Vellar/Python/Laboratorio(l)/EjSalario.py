#Ejercicio 8: Dadas las horas trabajadas de 5 personas y la tarifa de pago, calcular el salario
#y la sumatoria de todos los salarios.
totalPersonas = 5
salarioTotal = 0

for i in range(totalPersonas):
    horasTrabajadas = float(input(f"Ingrese las horas trabajadas de la persona {i+1}:"))
    tarifadPago = float(input(f"Ingrese la tarifa de pago por hora {i+1}: "))

    salario = horasTrabajadas * tarifadPago
    salarioTotal += salario

    print(f"El salario de la persona {i+1} es: {salario}")

print("El total de todos los salarios es: ", salarioTotal)