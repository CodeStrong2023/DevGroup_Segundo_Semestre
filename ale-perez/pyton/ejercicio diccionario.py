from xml.dom.minidom import Element


seleccionArgentina = {
    10: {'Nombre': 'Lionel messi', 'Edad': 35, 'Altura': 1.70, 'precio': '50 Millones', 'Posicion': 'Extremo derecho'},
    11: {'Nombre': 'Angelo Di Maria', 'Edad': 34, 'Altura': 1.80, 'precio': '17 Millones', 'Posicion': 'Extremo derecho'},
    24: {'Nombre': 'Paulo Dybala', 'Edad': 28, 'Altura': 1.77, 'precio': '35 Millones', 'Posicion': 'media punta'},
    19: {'Nombre': 'Nicolas otamendi', 'Edad': 34, 'Altura': 1.83, 'precio': '3.5 Millones', 'Posicion': 'defensa central'},
     1: {'Nombre': 'Franco Armani', 'Edad': 35, 'Altura': 1.89, 'precio': '3.5 Millones', 'Posicion': 'portero'}, 
}
for llave, valor in seleccionArgentina():
    print(llave, valor)

    #Como tarea agragar  por lo menos 4 jugadores mas al diccionario seleccionArgentina
    print('Tenemos cargados en el diccionario la cantidad de jugadores', end=' ')
    print(len(seleccionArgentina))

# Pilas usando listas
pila = [1, 2, 3]

# Argentina elementos a la pila por el final
pila.append(4)
pila.append(5)
print(pila)

#Sacamos elementos desde el final
ElementoBorrado = pila.pop() #quita el ultimo elemnto y lo guarda en la variable
print('sacamos el elemento {elementoBorrado}')
print('La pila ahora quedo asi: {pila}')

#colas con listas
#Estructura de datos de tipo fifo(first input / first output)
cola = ['Ariel', 'Osvaldo', 'liliana', 'pilar']

#Agregamos elementos al final de la cola
cola.append('Natalia')
cola.append('jose')
print(cola)

#sacamos elementos de la cola 
seRetira = cola.pop(0)
print(f'Atendido el cliente: {seRetira}')
print(cola)

seRetira = cola.pop(0)
print(f'Atendido el cliente: {seRetira}')
print(cola)

seRetira = cola.pop(0)
print(f'Atendido el cliente: {seRetira}')
print(cola)

seRetira = cola.pop(0)
print(f'Atendido el cliente: {seRetira}')
print(cola)

seRetira = cola.pop(0)
print(f'Atendido el cliente: {seRetira}')
print(cola)

for i in seleccionArgentina:
    print(f'{i}-> ')
