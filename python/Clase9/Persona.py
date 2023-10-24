class Persona:  # Creamos una clase
    # ASIGNACIÓN DE VALORES EN CÓDIGO DURO
    #     def __init__(self):  # Se lo llama método init Dunder
    #         self.nombre = "Juan"
    #         self.apellido = "Salazar"
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


persona1 = Persona("Juan", "Salazar", 32436374, 22)  # Necesitamos enviar argumentos
print(
    f"El objeto 1 de la clase persona: {persona1.nombre} {persona1.apellido}, Su edad es:  {persona1.edad}"
)

persona2 = Persona("Micaela", "Fontendiue", 382783727, 25)
print(
    f"El objeto 2 de la clase persona: {persona2.nombre} {persona2.apellido}, Su edad es:  {persona2.edad}"
)

persona1.nombre = "Liliana"
persona1.apellido = "Rotherbard"
persona1.edad = 45

print(
    f"El objeto 1 modificado de la clase persona: {persona1.nombre} {persona1.apellido}, Su edad es:  {persona1.edad}"
)

# Los atributos son: Características
# Los métodos son: el comportamiento que van a tener los objetos (las acciones)
persona1.mostrar_detalle()  # La referencia en este caso se pasa de manera automatica
persona2.mostrar_detalle()

# Persona.mostrar_detalle(persona1) # Debemos pasarle una referencia para el self o dará error
persona1.telefono = "3947273687926"
print(f"Este es el telefono de {persona1.nombre} : {persona1.telefono}")

# print(persona2.telefono) # el objeto persona2 no tiene este atributo, da error

persona3 = Persona(
    "Rogelio",
    "Romero",
    253253262,
    22,
    "Telefono",
    "23526247243",
    "Calle Lopez",
    823,
    "Manzana",
    77,
    "Casa",
    18,
    Altura=1.83,
    Peso=105,
    CFavorito="Azul",
    Auto="Citroen",
    Modelo=2021,
)
persona3.mostrar_detalle()

persona4 = Persona(
    "Marcos",
    "Martos",
    45361265,
    21,
    "Telefono",
    "246327373",
    "Calle Vicente Viloni",
    777,
    "Manzana",
    25,
    "Casa",
    13,
    Altura=1.83,
    Peso=85,
    CFavorito="Marrón",
    Auto="Fiat",
    Modelo=2019,
)
persona4.mostrar_detalle()

# print(persona4._dni) # Esto no se debe utilizar (está encapsulado), estop dice que desconocemos python

# persona4.__nombre # Está totalmente encapsulado, da error
