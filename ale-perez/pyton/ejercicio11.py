#ejercicio 11: agenda telefonica
#hacer un programa que simule una agenda de contacto. crear un 
#diccionario donde la clave sea el nombre del usuario y el valor
#sea el telefono, el programa tendra el siguiente menu de opciones:
#       1. nuevo contacto
#       2. borrar contacto
#       3. ver contactos existentes 
#       4. salir
agenda = {}

while True:
    print('\t.: Menú :.')
    print('1. Nuevo contacto')
    print('2. Borrar contacto')
    print('3. Ver contactos existentes')
    print('4. Salir')
    opcion = int(input('Digite una opción del menú: '))

    if opcion == 1:
        nombre = input('Digite el nombre del contacto: ')
        telefono = input('Digite el número de teléfono: ')
        if nombre not in agenda:
            agenda[nombre] = telefono
            print(f'Se ha añadido {nombre} a la agenda exitosamente.')
        else:
            print(f'El contacto {nombre} ya existe en la agenda.')

    elif opcion == 2:
        nombre = input('Digite el nombre del contacto que desea eliminar: ')
        if nombre in agenda:
            del agenda[nombre]
            print(f'Se ha eliminado el contacto {nombre} de la agenda.')
        else:
            print(f'El contacto {nombre} no existe en la agenda.')

    elif opcion == 3:
        print('\nAgenda de contactos:')
        for clave, valor in agenda.items():
            print(f'Nombre: {clave}, Teléfono: {valor}')

    elif opcion == 4:
        print('Gracias por utilizar su agenda de contactos.')
        break

    else:
        print('Opción de menú incorrecta. Por favor, elija una opción válida.')

    print()
