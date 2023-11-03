# Ejercicio 8: Menú interactivo - Cajero automático
# Hacer un programa que simule un cajero automático con un saldo
# incial de $1000 y tendrá el siguiente menú de opciones:
#                              1. Ingresar dinero ne la cuenta
#                              2. Retirar dinero de la cuenta
#                              3. Mostrar dinero disponible
#                              4. Salir

saldo = 1000
while True:
    print("MENÚ")
    print("1. Ingresar dinero en la cuenta")
    print("2. Retirar dinero de la cuenta")
    print("3. Mostrar dinero disponible")
    print("4. Salir")
    opcion = int(input("Digite una opción de menú: "))
    if opcion == 1:
        extra = float(input("Cuánto dinero desea ingresar: "))
        saldo += extra
        print(f"Dinero de la cuenta en este momento: ${saldo}")
    elif opcion == 2:
        retirar = float(input("Cuánto dinero desea retirar: "))
        if retirar > saldo:
            print("No tiene esa cantidad de dinero")
        else:
            saldo -= retirar
            print(f"Dinero de la cuenta en este momento: ${saldo}")
    elif opcion == 3:
        print(f"Dinero de la cuenta en este momento: ${saldo}")
    elif opcion == 4:
        print("Gracias por utilizar su cajero automático, hasta pronto!")
        break
    else:
        print("ERROR, se equivocó de opción de menú")
