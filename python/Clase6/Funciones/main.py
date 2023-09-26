# Comenzamos con Funciones

# Definimos una función


def mi_funcion():
    print("Saludos a todos los alumnos de la tecnicatura!")


# Llamamos la función
mi_funcion()

# Desempaquetado de listas o list Unpacking


def show(name, lastName):
    print(name + " " + lastName)


person = ["Marcos", "Martos"]
show(person[0], person[1])  # Pasamos los datos de la lista a la funcion
show(*person)
person2 = ("Pablo", "Bogado")
show(*person2)
person3 = {"lastName": "Arrieta", "name": "Axel"}
show(**person3)

numbres = [1, 2, 3, 4, 5]  # Aún con la lista vacía se va a ejecutar el else
for n in numbres:
    print(n)
    if n == 3:
        break  # Esto es la única manera para que no se ejecute el else
else:
    print("Esto se termino")


# list comprehension, lsita de comprención
names = ["Paolo", "Rodrigo", "Lupe", "Pepe"]
alongP = [p for p in names if p[0] == "P"]  # Esto regresa una nueva lista
print(alongP)

bottleC = [
    {"name": "Quilmes", "country": "Arg"},
    {"name": "Corona", "country": "Mx"},
    {"name": "Stella Artois", "country": "Belgium"},
]

Arg = [b for b in bottleC if b["country"] == "Arg"]
print(Arg)
print(bottleC)


# Paso de argumentos (Funciones)
def mi_funcion2(name, lastName):
    print("Saludos a todos los hinchas de Belgrano")
    print(f"Nombre: {name}, Apellido: {lastName}")


mi_funcion2("Marcos", "Martos")
mi_funcion2("Pablo", "Bogado")
mi_funcion2("Axel", "Arrieta")


# La palabra return en funciones
# Creamos una funcion para sumar
def sumar(a, b):
    return a + b


# resultado = sumar(5, 10)
# print(f"El resultado de la suma es: {resultado}")
print(f"El resultado de la suma es: {sumar(5, 10)}")


def sumar2(a=0, b=0):  # Le damos un valor por default
    return a + b


resultado = sumar2()
print(f"Resultado de la suma: {resultado}")
print(f"Resultado de la suma: {sumar2(22, 66)}")


# Argumentos, variables en funciones
def listarNombres(*nombres):
    for nombre in nombres:
        print(nombre)


listarNombres("Lucas", "José", "Claudia", "Darío", "Rubén", "Clara")
listarNombres("Marcos", "Matías", "Julian", "Iñaki")
