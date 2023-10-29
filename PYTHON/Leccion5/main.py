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