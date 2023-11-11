class Persona: # Creamos una clase
    def __init__(self, nombre, apellido, dni, edad, *args, **kwargs): # Metodo especial, se lo llama Init Dunder
        self.nombre = nombre # Atributos y el otro variables
        self.apellido = apellido
        self.edad = edad
        self._dni = dni # Este atributo esta encapsulado de una manera sugerida
        self.args = args
        self.wkargs = kwargs
    def mostrar_detalle(self):
        print(f'La clase Persona tiene los siguientes datos: {self.nombre} {self.apellido} {self._dni} {self.edad}, la dirección es: {self.args}, los datos importantes son: {self.wkargs}')

persona1 = Persona("Lionel", "Scaloni", 3050505, 44) # Necesitamos enviar argumentos
print(f'El objeto1 de la clase persona: {persona1.nombre} {persona1.apellido} su edad es: {persona1.edad}')

persona2 = Persona("Ariel", "Betancud", 35060790, 40)
print(f'El objeto2 de la clase persona: {persona2.nombre} {persona2.apellido} su edad es: {persona2.edad}')

persona1.nombre = "Sergio"
persona1.apellido = "Aguero"
persona1.edad = 35
print(f'El objeto1 modificado de la clase persona: {persona1.nombre} {persona1.apellido} su edad es: {persona1.edad}')

# Los atributos son: caracteristicas
# Los métodos son: el comportamiento que van a tener los objetos (las acciones)
persona1.mostrar_detalle() # La referencia en este caso se pasa de manera automatica
persona2.mostrar_detalle()

# Persona.mostrar_detalle(persona1) # Debemos parasarle una referencia para el self o nos dara error

persona1.telefono = "55023920"
print(f'Este es el teléfono de {persona1.nombre}: {persona1.telefono}') # Hemos creado un atributo de un objeto

# print(persona2.telefono) # El objeto persona2 no tiene el atributo teléfono, da error

persona3 = Persona('Rogelio', 'Romero', 30303100 , 22, 'Teléfono', '230303', 'Calle Lopez', 823, 'Manzana', 77, 'Casa', 18, Altura = 1.83, Peso = 105, cFavorito = 'Azul', Auto = 'Citroen', Modelo = 2021)
persona3.mostrar_detalle()
persona4 = Persona('Gabriel', 'Gonzalez', 45000000, 19, 'Teléfono', '200303030', 'Calle Bernardo', 400, 'Manzana', 20, 'Casa', 40, Altura = 1.83, Peso = 70, cFavorito = 'Azul', Auto = 'Peugeot', Modelo = 2012)
persona4.mostrar_detalle()
print(persona3._dni) # Esto no se debe utilizar(esta encapsulado), esto dice que lo desconocemos a python
# persona3.__nombre # Esta totalmente encapsulado