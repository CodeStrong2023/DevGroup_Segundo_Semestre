class Persona: # Creamos una clase
    def __init__(self, nombre, apellido, edad): # Se lo llama método Init Dunder
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad
    def mostrar_detalle(self):
        print(f'Persona: {self.nombre} {self.apellido}, edad: {self.edad}')
        
persona1 = Persona("Enzo", "Balderrama", 25)
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
persona1.mostrar_detalle()
persona2.mostrar_detalle()