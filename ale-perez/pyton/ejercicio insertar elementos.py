lista = []
salir = False
while not salir:
 numero =int(input('digite un numero'))
 if numero == 0:
  salir = True
 else:
  lista.append(numero)
lista.sort() # la lista esta ordenada con esta funcion
print(f'\nlista ordenada: \n{lista}')
