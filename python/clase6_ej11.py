# Ejercicio 11: Agenda telefónica
# Hacer un programa que simule una agenda de contactos. Crear un
# diccionario donde la clave sea el nombre del usuario y el valor
# sea el telefono, el programa tendrá eun menú de opciones.

agenda = {}
while True:
    print("MENÚ")
    print("1. Nuevo contacto")
    print("2. Borrar contacto")
    print("3. Ver contactos existentes")
    print("4. Salir")
    opcion = int(input("Ingrese una opción de menú: "))
    if opcion == 1:
        nombre = input("Ingrese el nombre del contacto: ")
        telefono = input("Ingrese el numero de telefono: ")
        if nombre not in agenda:
            agenda[nombre] = telefono
            print("Contacto agregado!!")
        else:
            print("Contacto existente.")
    elif opcion == 2:
        nombre = input("Nombre del contacto: ")
        if nombre in agenda:
            del agenda[nombre]
            print("El contacto ha sido eliminado.")
        else:
            print("Contacto no existente.")
    elif opcion == 3:
        print("Agenda de contactos")
        for clave, valor in agenda.items():
            print(f"Nombre: {clave}, Telefono: {valor}")
    elif opcion == 4:
        print("Saliendo...")
        break
    else:
        print("Error. Opción inválida!")

