# Ejercicio Agenda telefónica

#Hacer un programa que simule la agenda de contactos. Crear un diccionario
# donde la clave sea el nombre de usuario y el valor sea el teléfono
# el programa dará estas opciones:
#                                  1 Nuevo contacto
#                                  2 Borrar contacto 
#                                  3 Ver contactos existentes
#                                  4 Salir

agenda = {}
while True:
    print("\t MENÚ: ")
    print(" 1. Nuevo contacto")
    print(" 2. Borrar contacto")
    print(" 3. Ver contactos existentes")
    print(" 4. Salir")

    opcion = int(input("Escriba una opcion: "))

    if opcion == 1:
        nombre = input("Escriba el nombre del contacto: ")
        telefono = input("Escriba el numero de teléfono: ")
        if nombre not in agenda:
            agenda[nombre] = telefono
            print("El contacto ha sido agregado..")
        else:
            print("El contacto ya existe..")
    elif opcion == 2:
        nombre = input("Escriba el nombre del contacto a borrar: ")
        if nombre in agenda:
            del (agenda[nombre]) # borra la llave y el valor
            print("Se ha eliminado el contacto..")
        else:
            print("El contacto a eliminar no existe. Ingrese otro: ")
    elif opcion == 3:
        print(" Agenda de contactos: ")
        for clave, valor in agenda.items():
            print(f"Nombre: {clave}, Telefono: {valor} ") # muestra agenda
    elif opcion == 4:
        print("Ha salido de la agenda..")
        break
    else:
        print(" La opcion no es valida: ")
    print(" ")
