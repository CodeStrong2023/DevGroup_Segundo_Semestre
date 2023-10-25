class Persona:  # Creamos una clase
    # ASIGNACIÓN DE VALORES EN CÓDIGO DURO
    #     def __init__(self):  # Se lo llama método init Dunder
    #         self.nombre = "Juan"
    #         self.apellido = "Quiles"
    #         self.edad = 22

    # persona1 = Persona()
    # print(persona1.nombre)
    # print(persona1.apellido)
    # print(persona1.edad)

    # ASIGNACIÓN DE VALORES POR PARÁMETRO

    def __init__(
        self, nombre, apellido, dni, edad, *args, **kwargs
    ):  # Se lo llama método init Dunder
        self.nombre = nombre
        self.apellido = apellido
        self._dni = dni  # Este atributo está encapsulado de una manera sugerida
        self.edad = edad
        self.args = args
        self.kwargs = kwargs

    def mostrar_detalle(self):  # self es igual a this
        print(
            f"La clase Persona tiene los siguientes datos: {self.nombre} {self.apellido} {self._dni} {self.edad}, la dirección es: {self.args}, los datos importantes son: {self.kwargs}"
        )


persona1 = Persona("Juan", "Quiles", 32443654, 20)  # Necesitamos enviar argumentos
print(
    f"El objeto 1 de la clase persona: {persona1.nombre} {persona1.apellido}, Su edad es:  {persona1.edad}"
)

persona2 = Persona("Pablo", "Corleone", 41865991, 23)
print(
    f"El objeto 2 de la clase persona: {persona2.nombre} {persona2.apellido}, Su edad es:  {persona2.edad}"
)

persona1.nombre = "José"
persona1.apellido = "Montana"
persona1.edad = 45

print(
    f"El objeto 1 modificado de la clase persona: {persona1.nombre} {persona1.apellido}, Su edad es:  {persona1.edad}"
)

# Los atributos son: Características
# Los métodos son: el comportamiento que van a tener los objetos (las acciones)
persona1.mostrar_detalle()  # La referencia en este caso se pasa de manera automatica
persona2.mostrar_detalle()

# Persona.mostrar_detalle(persona1) # Debemos pasarle una referencia para el self o dará error
persona1.telefono = "2625095463"
print(f"Este es el telefono de {persona1.nombre} : {persona1.telefono}")

# print(persona2.telefono) # el objeto persona2 no tiene este atributo, da error

persona3 = Persona(
    "Franco",
    "Castelli",
    388996001,
    25,
    "Telefono",
    "2625435363",
    "Calle: Ing Lange",
    43,
    "Manzana",
    1,
    "Casa",
    3,
    Altura=1.90,
    Peso=89,
    CFavorito="Negro",
    Auto="Volkswagen",
    Modelo=2015,
)
persona3.mostrar_detalle()

persona4 = Persona(
    "Juan",
    "Quiles",
    45361265,
    22,
    "Telefono",
    "26250001001",
    "Calle: Int. Morales",
    100,
    "Manzana",
    2,
    "Casa",
    5,
    Altura=1.85,
    Peso=75,
    CFavorito="Blanco",
    Auto="Peugeot 207",
    Modelo=2014,
)
persona4.mostrar_detalle()
