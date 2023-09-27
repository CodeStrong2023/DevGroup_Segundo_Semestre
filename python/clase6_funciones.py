# FUNCIONES

def mi_funcion():
    print("¡Hello World!")


mi_funcion()

def show(name, lastName):
    print(name + " " + lastName)


person = ["Juan", "Quiles"]
show(person[0], person[1])
show(*person)
person2 = ("Michael", "Corleone")
show(*person2)
person3 = {"lastName": "Montana", "name": "Tony"}
show(**person3)

numbres = [1, 2, 3, 4, 5]
for n in numbres:
    print(n)
    if n == 3:
        break
else:
    print("End.")


names = ["Pedro", "Lucas", "Carlos", "Ricky"]
alongP = [p for p in names if p[0] == "P"]
print(alongP)

bottleC = [
    {"name": "Quilmes", "country": "Arg"},
    {"name": "Corona", "country": "México"},
    {"name": "Stella Artois", "country": "Germany"},
]

Arg = [b for b in bottleC if b["country"] == "Arg"]
print(Arg)
print(bottleC)


# Argumentos

def mi_funcion2(name, lastName):
    print("¡Hello World!")
    print(f"Nombre: {name}, Apellido: {lastName}")


mi_funcion2("Juan", "Quiles")
mi_funcion2("Michael", "Corleone")
mi_funcion2("Tony", "Montana")

# Return

def sumar(a, b):
    return a + b
resultado = sumar(5, 10)
print(f"El resultado de la suma es: {resultado}")
print(f"El resultado de la suma es: {sumar(5, 10)}")


def sumar2(a=0, b=0):
    return a + b


resultado = sumar2()
print(f"Resultado de la suma: {resultado}")
print(f"Resultado de la suma: {sumar2(22, 66)}")


def listarNombres(*nombres):
    for nombre in nombres:
        print(nombre)


listarNombres("Germán", "Pablo", "Daniel", "Jorge", "Luis", "Maria")
