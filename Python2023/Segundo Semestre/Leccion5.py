# Comenzamos con funciones.
# mi_funcion() # No se puede llamar antes de definir a una funcion.
# Definimos una función.
def mi_funcion(): # Para identificar a la función utilizamos paréntesis.
    print("Saludos a todos los alumnos de la tecnicatura.")
mi_funcion() # Estamos llamando a la función.
mi_funcion() # Podemos llamar a la función N veces.

# Desempaquetado de listas o list unpacking.
def show(name, lastName):
    print(name + " " + lastName)
person = ["Enzo", "Balderrama"]
show(person[0], person[1]) # Pasamos uno a uno los datos de la lista a la función.
show(*person) # Esto es similar a lo anterior solo que pasamos todo a la vez.
person2 = ("Rocío", "Barros") # Desempaquetamos a través de una tupla.
show(*person2)
person3 = {"name" : "Ariel", "lastName" : "Balderrama"}
show(**person3)

numbers = [1, 2, 3, 4, 5]
for n in numbers:
    print(n)
else:
    print("Lista terminada.")
# List comprehension, lista de comprensión
names = ["Paolo", "Rodrigo", "José", "Guadalupe"]
alongP = [p for p in names if p[0] == "P"]
print(alongP)

bottleC = [{"name" : "Quilmes", "country" : "Arg"},
           {"name" : "Corona", "country" : "Mx"},
           {"name" : "Stella Artois", "country" : "Belgium"},
           ]
Arg = [b for b in bottleC if b["country"] == "Arg"]
print(Arg)

# Paso de argumentos (funciones)
def mi_funcion2(name, lastName):
    print("Saludos a todos.")
    print(f'Nombre: {name} | Apellido: {lastName}')
mi_funcion2("Enzo", "Balderrama")
mi_funcion2("Rocío", "Barros")

# palabra return en funciones
def sumar(a, b):
    return a + b
resultado = sumar(78, 22)
# print(f'El resultado de la suma es: {resultado}')
print(f'El resultado de la suma es: {sumar(55, 45)}')
def sumar2(a = 0, b = 0):
    return a + b
resultado = sumar2()
print(f'Resultado de la suma: {resultado}')
print(f'Resultado de la suma: {sumar2(22,66)}')

# Argumentos, variables en funciones
def listarNombres(*nombres):
    for nombre in nombres:
        print(nombre)
listarNombres("Lucas", "José", "Claudia", "Rosa", "María")
listarNombres("Enzo", "Matías", "Marcos", "Rocío")
