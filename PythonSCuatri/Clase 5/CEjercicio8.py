# Ejercicio 8: Menú interactivo - Cajero Automatico
# Hacer un programa que simule un cajero, con un salddo inicial de 1000 pesos
# y tendrá las siguientes opciones:
#                                  - Ingresar dinero a cuenta:
#                                  - Retirar dinero de cuenta:
#                                  - Mostrar dinero disponible
#                                  - Salir

saldo = 1000
while True:
    print("\t. :Menú: ")
    print("1 - Ingresar dinero a cuenta: ")
    print("2 - Retirar dinero de la cuenta: ")
    print("3 - Mostrar dinero disponible: ")
    print(" 4 - Salir ")

    opcion = int(input("Ingrese una opcion de menu: "))
    print()

    if  opcion == 1:
        extra = float(input("¿Cuanto dinero deseea ingresar? : $ ")) # acá se guarda el dinero a ingresar
        saldo += extra
        print(F" Dinero en cuenta: $ {saldo}")
    elif opcion == 2:
        retirar = float(input("¿cuanto dinero necesita retirar? --> "))
        if retirar > saldo:
            print("No tiene suficiente fondos..")
        else:
            saldo-= retirar
            print(f"Dinero en cuenta: $ {saldo} --> ")
    elif opcion == 3:
        print(f"Dinero en cuenta hasta el momento: $ {saldo} ")
    elif opcion == 4:
        print("Gracias por usar nuestro servicio..")
        break
    else: 
        print("Ingrese una opcion válida..")
        print( )