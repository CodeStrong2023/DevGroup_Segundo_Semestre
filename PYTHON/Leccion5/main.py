# Comenzamos con funciones
#mi_funcion() # No se puede llamar antes de definir a  una funcion
#Definimos una funcion
def mi_funcion(): #Para identificar a la funcion utilizamos parentesis
    print('Saludos a todos los alumnos de la Tecnicatura')

mi_funcion() # Estamos llamando a la funcion
mi_funcion() # Se puede llamar a una funcion N cantidad de veces

#Desempaquetado de listas o list Unpacking
def show(name, lastname):
    print(name+ " " + lastname)
person = ["Ariel", "Betancud "]
show(person[0],person[1]) #Pasamos uno por uno los datos de la lista a la funcion
show(*person) #Esto es lo mismo que lo anterior pero le pasamos todo junto

#Lo mismo para las tuplas
person2 = ("Osvaldo", "Giodanini")
show(*person2)

#Tambien sirve para los diccionarios
person3 = {"lastname": "Lucero", "name": "Natalia"}
show(**person3)

numbers = [1, 2, 3, 4, 5] # Aun con la lista vacia se va a ejectura el else, salvo que utilicemos un break antes
for n in numbers:
    print(n)
    if n == 3:
        break # Esta es la unica manera para que no se ejecute el else
else:
    print("Esto se termino ")

#List comprension , lista de comprension
names = ["Paolo", "Rodrigo", "Lupe", "Pepe"]
alongP = [p for p in names if p[0] =='P'] #Esto regresa una nueva lista con las palabras que empiecen con P
print(alongP)

bottleC = [{"name": "Quilmes", "country": "Arg"},
           {"name": "Corona", "country": "Mx"},
           {"name": "Stella Artois", "country": "Belgium"},
           ]
Arg =[b for b in bottleC if b["country"] == "Arg"]
print(Arg)
print(bottleC)

# Paso de Argumentos (funciones)
def mi_funcion2(name, lastName):
    print("Saludos a todos los que ven a traves del canal de Youtube")
    print(f'Nombre: {name}, Apellido: {lastName}')
mi_funcion2('Jorge','Lucero')
mi_funcion2('Ariel','Betancud')
mi_funcion2('Natalia','Pedrosa')

#La palabra return en funciones
#Creamos una funcion para sumar
def sumar(a, b):
    return a + b
# resultado = sumar(78, 22)
# print(f'El resultado de la suma es: {resultado}')
print(f'El resultado de la suma es: {sumar(55, 45)}')

def sumar2(a = 0, b= 0): # le damos un valor por default
    return a+b
resultado = sumar2()
print(f'El resultado de la suma es: {resultado}')
print(f'El resultado de la suma es: {sumar(22, 66)}')

#Argumentos, variables en funciones
def listarNombres(*nombres): #Normalmente se utiliza: *args
    for nombre in nombres: #Se va a convertir en una tupla
        print(nombre)
listarNombres("Lucas", "Jose", "Claudia", "Rosa", "Maria")
listarNombres("Marcos", "Daniel", "Romina", "Pepe", "Marcela", "Carlos")

def listaTerminos(**terminos): ## cuando necesitamos traer llaves y valores lo mas utilizados es **kwargs
    for llave, valor in terminos.items(): #kwargs significa: key word argument
        print(f'{llave} : {valor}')

listaTerminos(IDE ='Integrated Develoment Enviroment', PK ='Primary key')
listaTerminos(Nombre='Leonel Messi')

def desplegarNombres(nombres):
    for nombre in nombres:
        print(nombre)
nombres2 = ["Tito","Pedro","Carlos"]
desplegarNombres(nombres2)
desplegarNombres('Carla')
#desplegarNombres(10, 11) #No es un objeto iterable
desplegarNombres((10, 11)) # La convertimos en tupla, siempre termina en una coma si es un solo elemento
desplegarNombres([22, 55]) #Lo convertimos en una lista

#Funciones Recursivas
numero =int(input("Digite el numero que desea obtener el factorial: ")) ##Resolucion de la tarea
def factorial(numero):
    if numero ==1: # CASO BASE
        return 1
    else:
        return numero * factorial(numero-1) # CASO RECURSIVO
resultado = factorial(numero) #Lo hacemos en codigo duro
print(f'El factorial del numero {numero} es: {resultado}')
"""
Tarea que el usuario ingrese el numero para calcular el factorial
"""