                                        #FUNCIONES#
#Definimos una función
def mi_funcion(): #Para identificar a la funcion utilizamos paréntesis
    print("Saludos a todos")

mi_funcion() #Estamos llamando a la funcion 
mi_funcion() # Se puede llamar a una funcion N cantidad de veces sin problemas
#No se puede llamar a una funcion antes de definirla

#Desempaquetando de listas o list Unpacking
def show(name,lastName):
    print(name+ " "+ lastName )
person = ["Ariel","Betancud"]
show(person[0], person[1]) #Pasamos uno por uno los datos de la lista a la función
show(*person) #Esto es lo mismo que lo anterior pero le pasamos todo junto
person1 = ("Osvaldo", "Giordanini") #Desempaquetamos a través de una tupla
show(*person1)
person2 = {"lastName": "Lucero", "name": "Natalia"}
show(**person2)

                            #Repaso de ciclo for
numbers = [1,2,3,4,5,6,7,8]
for n in numbers:
    print(n)
else:
    print("Esto se terminó")

                            #List comprehension, lista de compresión

names = ["Paolo","Rodrigo","Lupe","Pepe"]
alongP = [p for p in names if p[0] == "P"] #Esto regresa una nueva lista
print(alongP)

bottleC = [{"name": "Quilmes", "country": "Arg"},
           {"name": "Corona", "country": "Mx"},
           {"name": "Stella Artois", "country": "Belgium"},
           ]
Arg = [b for b in bottleC if b["country"] == "Arg"]
print(Arg)
print(bottleC)

# Paso de Argumentos (funciones)
def mi_funcion2(name,lastName):
    print("Saludos a todos")
    print(f"Nombres: {name},Apellido: {lastName}")
mi_funcion2("Jorge", "Lucero")
mi_funcion2("Ariel", "Betancud")
mi_funcion2("Analia", "Pedrosa")

#Palabra return en funciones
#Creamos una función para sumar
def sumar(a,b): 
    return a + b
resultado = sumar(78,22)
#print(f"El resultado de la suma es:  {resultado}")
print(f"El resultado de la suma es:  {sumar(55,45)}")

def sumar2(a =0 , b = 0): #Le damos un valor por default
    return a + b
resultado = sumar2()
print(f"resultado de la suma: {resultado}")
print(f"resultado de la suma: {sumar2(22,66)}")

#Argumentos,variables en funciones
def listarNombres(*nombres): #Normalmente se utiliza: *args
    for nombre in nombres: #Se va a convertir en una tupla
        print(nombre)
listarNombres("Lucas","Jorge","Claudia", "Rosa","Maria")
listarNombres("Marcos","Daniel","Roxana","Romina","Carlos")

def listarTerminos(**terminos): #Lo mas utlizado es **kwargs para recibir los argumentos
    for llave, valor in terminos.items(): #kwargs sigifica: key word argument
        print(f"{llave} : {valor} ")

listarTerminos()#No recibe nada no se va a mostrar nada
listarTerminos(IDE = "Integrated Develoment Enviroment", PK="Primaruy Key")
listarTerminos(Nombre ="Leonel Messi")

def desplegarNombres(nombres):
    for nombre in nombres:
        print(nombre)
nombres2 = ["Tito","Pedro","Carlos"]
desplegarNombres(nombres2)
desplegarNombres("Carla")
#desplegarNombres(10) No es un objeto iterable
desplegarNombres((10,11)) #La convertimos a una tupla
desplegarNombres([22,55]) #La convertimos en una lista


                            #Funciones Recursivas 

def factorial(numero):
    if numero == 1: #Caso Base
        return 1
    else: 
        return numero * factorial(numero - 1) #Caso Recursivo 

resultado = factorial(5) #Lo hacemos en código duro
print(f"El factorial del número 5 es: {resultado} ")

