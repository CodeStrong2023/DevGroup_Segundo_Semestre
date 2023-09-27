# Ejercicio 11: Agenda telefónica
# Hacer un programa que simule una agenda de contactos. Crear un
# diccionario donde la clave sea el nombre de usuario y el valor
# sea el teléfono, el programa tendrá el siguiente menú de opciones:
#           Menú
#   1 - Nuevo contacto
#   2 - Borrar contacto
#   3 - Ver contactos existentes
#   4 - Salir
contactos = {}
opcion = 0
while (opcion != 4):
    print('\t \t MENÚ \n 1 - Nuevo contacto. \n 2 - Borrar contacto. \n 3 - Ver contactos existentes. \n 4 - Salir.')
    opcion = int(input())
    if opcion == 1:
        nombre = input("Digite nombre del contacto: ")
        telefono = int(input('Número de teléfono: '))
        if nombre not in contactos:
            contactos[nombre] = telefono
            print("Contacto agregado exitosamente.")
        else:
            print("El contacto ya existe.")
    elif opcion == 2:
        nombre = input("Digite el nombre del contacto a eliminar: ")
        if nombre in contactos:
            del (contactos[nombre])
            print("Contacto eliminado correctamente.")
        else:
            print("Contacto inexistente.")
    elif opcion == 3:
        print("\tLista completa de contactos: \n")
        for i, j in contactos.items():
            print(f'Nombre: {i} | Teléfono: {j}')
    elif opcion == 4:
        print("Gracias por utilizar nuestra agenda. Hasta la próxima!")
    else:
        print("ERROR. Opción inexistente, por favor, intente nuevamente.")