# Argumentos, variables en funciones
def listarTerminos(**terminos): # Lo mas utilizado es **Kwargs para recibir los argumentos
    for llave, valor in terminos.items(): # Kwargs significa: Key word argument (argumento de palabra clave)
        print(f'{llave} : {valor}') 
listarTerminos() # No recibe nada, nada se va a mostrar
listarTerminos(IDE = 'Integrated Develoment Enviroment', PK = 'Primaruy Key')
listarTerminos(Nombre = 'Sergio Aguero')

def desplegarNombres(nombres):
    for nombre in nombres:
        print(nombre)
nombres2 = ['Lionel', 'Sergio', 'Angel']
desplegarNombres(nombres2)
desplegarNombres('Carla')
# desplegarNombres(10, 11) # No es un objeto iterable
desplegarNombres((10, 11)) # La convertimos a una tupla, en un solo elemento no olvidar la coma
desplegarNombres({22, 55}) # La convertimos a una lista

# Funciones Recursivas

def factorial(numero):
    if numero == 1: # Caso base
        return 1
    else:
        return numero * factorial(numero-1) # Caso recursivo
numeroFactorial = int(input('Digite el numero para calcular el factorial: '))
resultado = factorial(numeroFactorial)
print(f'El factorial del numero {numeroFactorial} es: {resultado}')                                          