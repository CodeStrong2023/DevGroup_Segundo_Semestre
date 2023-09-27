# Ejercicio 8: Menú interactivo - Cajero automático
#
# Hacer un programa que simule un cajero automático con saldo
# incial $1000 y tendrá el siguiente menú de opciones:
#               1 - Ingresar dinero en la cuenta.
#               2 - Retirar dinero de la cuenta.
#               3 - Mostrar dinero disponible.
#               4 - Salir.
opcion = 0
dinero_en_cuenta = 1000
dinero_a_retirar = 0
while (opcion != 4):
    print("\t \t Menú \n \n")
    print("1 - Ingresar dinero en la cuenta.\n")
    print("2 - Retirar dinero de la cuenta.\n")
    print("3 - Mostrar dinero disponible.\n")
    print("4 - Salir.\n")
    opcion = int(input())
    if (opcion == 1):
        dinero_en_cuenta += int(input("Cuanto dinero desea agregar: "))
        print(f"Dinero agregado con éxito. \n Nuevo saldo: {dinero_en_cuenta}")
    elif (opcion == 2):
        dinero_a_retirar = int(input("¿Cuánto dinero desea retirar? "))
        if (dinero_a_retirar > dinero_en_cuenta):
            print("No posee tanto dinero para retirar.")
        else:
            dinero_en_cuenta -= dinero_a_retirar
            print(f'Dinero retirado con éxito. \n Nuevo saldo: {dinero_en_cuenta}')
    elif(opcion == 3):
        print(f'Su saldo es: {dinero_en_cuenta}')
    elif(opcion == 4):
        print("Gracias por su visita! Vuelva pronto.")
    else:
        print("Opción ingresada no válida. Intente nuevamente.")