# ejercicio2: modificar los elementos de una lista
#llenar una lista con los numero del 1 al 10, luego modificar los 
# elementos de la lista multiplicandolos por un valor ingresado por el usuario 
lista = list(range(1, 11))
print('lista original')
for i in lista:   
    print(i, end='-')

valor = int(input('\ndigite un valor a multiplicar'))
#multiplicamos todos los elementos de la lista 
for indice, i in enumerate(lista): 
 lista[indice] *= valor
 print(f'lista final con los elementos multiplicados por {valor}')
 for i in lista:
    print(i, end='-')
