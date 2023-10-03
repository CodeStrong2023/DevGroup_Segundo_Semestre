def ListaTerminos(**terminos): # kwards -->llaves, paramentros y argumentos
    for llave, valor in terminos.items(): # --> items para recorrer diccionario
        print(f"{llave} : {valor}")
ListaTerminos(IDE = "Integrated Develoment Enviroment", PK = "Primary Key")  # pasamos terminos
ListaTerminos(Nombre = "Leo Messi")

# Funcionamiento:
#                 1: Recibe arg
#                 2: Convierte en paramentros
#                 3: Hace la operacion y muestra el diccionario


# Distintos tipos de datos, como argumento:
# funcion que recibe lista con elementos:

def MostrarNombres(nombres):
    for nombre in nombres:
        print(nombre)
nombres2 = ["Juan", "Coscu", "Oscar"] # entra, asigna nombre = Juan, vuelve a entrar nombre = Coscu...
MostrarNombres(nombres2)
MostrarNombres("Jaz")

# MostrarNombres(10,11) No es iterable... pero si ponemos:
# MostrarNombres((10,11)) se convierte en tupla, es decir iterable y puede recorrerlo
# MostrarNombres ([10,11]) lo convertimos a lista