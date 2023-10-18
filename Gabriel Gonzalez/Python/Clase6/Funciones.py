# Desempaquetado de listas o list Unpacking
def show(name, lastname):
    print(name + '' + lastname)
person = ["Gabriel", " Gonzalez"]
show(person[0], person[1]) # Pasamos uno por uno los datos de la lista a la función
show(*person)
person2 = ("Ariel", " Betancud") # Desempaquetamos atravez de una Tupla
show(*person2)
person3 = {"name" : "Natalia" , "lastname" : " Lucero"}
show(**person3)

# List comprehension, lista comprensión
names = ["Paolo", "Rodrigo", "Lupe", "Pepe"]
alongp = [p for p in names if p [0] == "P"] # Esto regresa una nueva lista
print(alongp)

bottleC = [{"name" : "Quilmes", "country" : "Arg"},
           {"name" : "Corona" , "country" : "Mx"},
           {"name" : "Stella Artois" , "country" : "Belgium"},
           ]
Arg = [b for b in bottleC if b["country"] == "Arg"]
print(Arg)
print(bottleC)

Mx = [c for c in bottleC if c["country"] == "Mx"]
print(Mx)

# Paso de argumentos (funciones)
def mi_Funcion2(name, lastname):
    print("Saludo a los tutores")
    print(f'Nombre: {name} Apellido: {lastname}')
mi_Funcion2('Jorge', 'Lucero')
mi_Funcion2('Ariel', 'Betancud')
mi_Funcion2('Gabriel', 'Gonzalez')

# La palabra return en funciones
# Creamos una función para sumar
def sumar(a,b):
    return a + b
# resultado = sumar(78 , 22)
# print(f'El resultado de la suma es: {resultado}')
print(f'El resultado de la suma es: {sumar(55, 45)}')

def sumar2(a = 0 , b = 0): # Le damos un valor por default
    return a + b
resultado = sumar2()
print(f'El resultado de la suma es: {resultado}')
print(f'El resultado de la suma es: {sumar2(20,70)}')

# Argumentos, variables en funciones
def listarNombres(*nombres): # Normalmente se utiliza: *args
    for nombre in nombres: # Se va a convertir en una Tupla
        print(nombre)
listarNombres('Sergio', 'Luis', 'Nicolas', 'Marcos', 'Frank')
listarNombres('Ezequiel', 'Cristian', 'Pol', 'Valentin', 'Miguel', 'Edinson')

