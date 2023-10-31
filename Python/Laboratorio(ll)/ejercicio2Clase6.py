                        #Ejercicio 2: Agenda telefonica
#Hacer un programa que simule una agenda de contactos. Crear un diccionario donde la clave sea el nombre
#del usuario y el valor sea el telefono, el programa tendrá el siguiente menú de opciones:
#   1. Nuevo contacto
#   2. Borrar Contacto
#   3. Ver contactos existentes
#   4. Salir
agenda = {
}
while True: 
    print("\n""\t.:MENÚ:.")
    print("1. Nuevo Contacto")
    print("2. Borrar Contacto")
    print("3. Ver contactos existentes")
    print("4. Salir")

    opcion = int(input("Digite una opcion:"))

    if opcion == 1:
        contacto = str(input("Digite el nombre del nuevo contacto:"))
        numero = int(input("Digite el número de teléfono: "))
        if contacto not in agenda:
            agenda[contacto] = numero
            print("Contacto agregado")
        else:
            print("Este nombre de contacto ya existe")
    elif opcion == 2:
        contacto = input("Que contacto desea eliminar?")
        if contacto in agenda:
            del (agenda[contacto])
            print("Se ha eliminado el contacto elegido")
        else:
            print("El contacto no existe en la agenda")
    elif opcion == 3:
        print("Agenda de contactos:")
        for clave, valor in agenda.items():
            print(f"Nombre: {clave}, Teléfono: {valor}")
    elif opcion == 4:
        print("Gracias por utilizar esta agenda de contactos:")
        break