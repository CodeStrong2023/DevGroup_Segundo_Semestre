#Ejercicio 7: Menú interactivo - Cajero automatico 
#Hacer un programa que simule un cajero automatico con un saldo inicial de $1000 y tendrá
#el sgte menú de opciones:
    # 1. Ingresar dinero en la cuenta
    # 2. Retirar dinero de la cuenta
    # 3. Mostrar dinero disponible
    # 4. Salir

dineroDisponible = 1000
while True:
    print("\n""\t.:MENÚ:.")
    print("1. Ingresar dinero en la cuenta")
    print("2. Retirar dinero de la cuenta")
    print("3. Mostrar dinero disponible")
    print("4. Salir")
    #Opciones
    opc = int(input("Digite una opción:"))
    print()
    if opc == 1:
        dineroDisponible += int(input("Digite el monto de dinero a ingresar: "))
        print("\nLa operación se realizó correctamente")
    elif opc == 2:
        retiro = int(input("Ingrese el monto que desea retirar:"))
        dineroDisponible -= retiro
        if retiro > dineroDisponible:
             print("No posee fondos suficientes")  
        else:  
            print("\nLa operación se realizó correctamente")
    elif opc == 3:
        print(f"Tiene ${dineroDisponible} disponible ")
    elif opc == 4:
        break
print("\t.:Gracias por utilizar nuestro servicio:.")