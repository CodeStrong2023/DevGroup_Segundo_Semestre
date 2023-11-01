# COMENZAMOS CON FUNCIONES:
# mi_funcion() No se puede llamar antes de definirla

# Definimos una funcion: 
def mi_funcion(): # llamamos la funcion
    print(" Seguimos trabajando en Python.. ")

mi_funcion() # se puede llamar a una funcion N cantidad de veces

# Desempaquetado de listas o unpacking

def show(name, lastName): # dos parametros
    print(name + " " + lastName)
person = ["Matias", "Nicolas"]
show(person[0], person[1]) # pasamos los datos a la funcion
show(*person) # De esta manera, se pasa todo junto

person2 = ("Raul", "Olde") # desempaquetamos por medio de tuplas
show(*person2)

person3 = {"lastName" : "Marcelo" , "name" : "Luca"}
show(**person3) # en forma de diccionario..

numbers = [1,2,3,4,5] # creamos lista
for n in numbers: # recorremos..
    print(n)
else: # termina de recorrer y finaliza
    print("Esto termina")

# LIST COMPREHENSION, lista  de compresion. tomamos solo lo necessario y nada mas

names = ["Polo", "Luca", "Rosario", "Luz", "Nazarena"]
alongL = [l for l in names if l[0] == "L"] # compresion o toma de la lista, en otra nueva
#          recorre la lista .. condicion desde 0 en adelante, es = a P entonces, regresa nueva lista..
print(alongL)
bottleC = [{"name": "Quilmes", "country": "Arg"},
           {"name": "Corona", "country": "Mx"},
           {"name": "Stella Artois", "country": "Belgium"},
           ]
Arg = [b for b in bottleC if b["country"] == "Arg"]
print(Arg)
print(bottleC)

# Paso de argumentos: 
def mi_funcion2(name, lastName): #pasamos parametros(trabaja con una var dentro de la funcion)
    print("Hola, seguimos trabajando..")
    print(f"Nombre: {name}, Apellido: {lastName}")
mi_funcion2("Jorge", "Lucero") # argumentos: valor q enviamos a la funcion
mi_funcion2("Analia", "Jacin")

# Palabra RETURN
# Creamos funcion para sumar
def sumar(a,b):
    return a + b
resultado = sumar(78,22)
print(f"El resultado de la suma es: {resultado}")

# valor por default en los parametros de una funcion
def sumar2(a = 0, b = 0):
    return a + b
resultado = sumar2()
print(f"Resultado de la suma: {resultado}")
print(f"Resultado de la suma: {sumar2(89,11)}")

# Argumentos, variables en funciones..
def listaNombres(*nombres): # cuando se desconoce el total de argumentos
    for nombre in nombres: # se convierte en tupla
        print(nombre)
listaNombres("Lucas", "José", "Claudia", "Maria")
listaNombres("Juan", "Esteban", "Carlos")