# Ejercicio 3: Funcion recursiva
# Imprimir numeros de 5 a 1 de manera descendente usando funciones recursivas
# Puede ser cualquier valor positivo, por ejemplo, si pasamos el
# valor de 3, debe imprimir:
# 3
# 2
# 1
# Si se ingresan negativos no imprime nada


def imprimirNumerosRecursivos(numero):
    if numero == 0:
        return 1
    else:
        print(numero)
        return numero * imprimirNumerosRecursivos(numero - 1)


numeroFactorial = int(input("Digite el número para calcular el factorial: "))


if numeroFactorial < 0:
    print("Valor ingresado incorrecto. Debe ser un número no negativo.")
else:
    resultado = imprimirNumerosRecursivos(numeroFactorial)
    print(f"El factorial del número {numeroFactorial} es: {resultado}")
