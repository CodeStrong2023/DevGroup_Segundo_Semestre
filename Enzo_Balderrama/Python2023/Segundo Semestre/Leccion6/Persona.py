class Persona: # Creamos una clase
    def __init__(self, nombre, apellido, dni, edad, *args, **kwargs): # Se lo llama método Init Dunder
        self.nombre = nombre
        self.apellido = apellido
        self._dni = dni # Este atributo se encuentra encapsulado de manera sugerida.
        self.edad = edad
        self.args = args
        self.kwargs = kwargs
    def mostrar_detalle(self):
        print(f'La clase Persona tiene los siguientes datos: {self.nombre} {self.apellido}, edad: {self.edad}, la direccion es {self.args}, los datos importantes son: {self.kwargs}')
        
persona1 = Persona("Enzo", "Balderrama", 40940211, 25)
# print(persona1.nombre)
# print(persona1.apellido)
# print(persona1.edad)
print(f'Objeto 1 de la clase persona: {persona1.nombre} {persona1.apellido}. Su edad es {persona1.edad}')
persona2 = Persona("Rocio", "Barros", 20)
print(f'Objeto 2 de la clase persona: {persona2.nombre} {persona2.apellido}. Su edad es {persona2.edad}')
persona1.nombre = "Jazmin"
persona1.apellido = "Cordero"
persona1.edad = 20
print(f'Objeto 1 de la clase persona modificado: {persona1.nombre} {persona1.apellido}. Su edad es {persona1.edad}')

# Los atributos son características
# Los métodos son el comportamiento que van a tener los objetos (acciones).
persona1.mostrar_detalle() # La referencia en este caso se pasa de manera automática.
persona2.mostrar_detalle()

# Persona.mostrar_detalle(persona1) # Debemos pasarle una referencia para el self o dará error.

persona1.telefono = '46460404'
print(f'{persona1.telefono}, este es el telefono de {persona1.nombre}')

# print(persona2.telefo) da error no tiene atributo telefono.

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
    "Enzo",
    "Balderrama",
    40940211,
    25,
    "Telefono",
    "244124373",
    "Avenida Siempre Viva",
    742,
    "Manzana",
    2,
    "Casa",
    13,
    Altura=1.85,
    Peso=71,
    CFavorito="Violeta",
    Auto="Fiat",
    Modelo=1998,
)
persona4.mostrar_detalle()
# print(persona4._dni) # Esto no se debe utilizar (está encapsulado), estop dice que desconocemos python

# persona4.__nombre # Está totalmente encapsulado, da error