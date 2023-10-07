# Ejercicio 3: Funcion recursiva
# Imprimir numeros de 5 a 1 de manera descendente usando funciones recursivas

def imprimirNumerosRecursivos(numero):
    if numero == 0:
        return 1
    else:
        print(numero)
        return numero * imprimirNumerosRecursivos(numero - 1)

numeroFactorial = int(input("Ingrese el número para calcular el factorial: "))

if numeroFactorial < 0:
    print("ERROR. Debe ser un número no negativo.")
else:
    resultado = imprimirNumerosRecursivos(numeroFactorial)
    print(f"El factorial del número {numeroFactorial} es: {resultado}")
