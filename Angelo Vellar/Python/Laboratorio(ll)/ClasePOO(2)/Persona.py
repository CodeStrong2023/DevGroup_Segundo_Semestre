
            #Creamos la clase persona
class Persona: 
    def __init__(self, nombre, apellido, dni, edad, *args, **kwargs):  # Metodo especial, se lo llama Init Dunder
        self.nombre = nombre 
        self.apellido = apellido
        self.edad = edad
        self._dni = dni
    def mostrar_detalle(self): # SELF ES IGUAL A THIS
        print(f'La clase Persona tiene los siguientes datos: {self.nombre} {self.apellido} {self._dni} {self.edad}')

persona1 = Persona("José", "Mujica", 1089592, 88) # Necesitamos enviar argumentos
print(f'El objeto1 de la clase persona: {persona1.nombre} {persona1.apellido} su edad es: {persona1.edad}')

persona2 = Persona("Ariel", "Betancud", 3579648, 40)
print(f'El objeto2 de la clase persona: {persona2.nombre} {persona2.apellido} su edad es: {persona2.edad}')

persona1.nombre = "José"
persona1.apellido = "Mujica"
persona1.edad = 88
print(f'El objeto1 modificado de la clase persona: {persona1.nombre} {persona1.apellido} su edad es: {persona1.edad}')

# Los atributos son: caracteristicas
# Los métodos son: el comportamiento que van a tener los objetos (las acciones)
persona1.mostrar_detalle() # La referencia en este caso se pasa de manera automatica
persona2.mostrar_detalle()

# Persona.mostrar_detalle(persona1) # Debemos parasarle una referencia para el self o nos dara error

persona1.telefono = "403828524"
print(f'Este es el telefono pertenenciente a : {persona1.nombre}: {persona1.telefono}') # Hemos creado un atributo de un objeto

# print(persona2.telefono) # El objeto persona2 no tiene el atributo teléfono, da error

persona3 = Persona('Angelo', 'Vellar', 41696873 , 22, 'Teléfono', '2625842976')
persona3.mostrar_detalle()
