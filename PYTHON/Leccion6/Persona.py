class Persona: #Creamos una clase
    def __init__(self, nombre, apellido, edad): #Se lo llama metodo Init Dunder
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad
    def mostrar_detalle(self):
        print(f'Persona: {self.nombre} {self.apellido} {self.edad}')


persona1 = Persona('Ariel', 'Betancud', '40') #necesitamos enviar argumentos
print(persona1.nombre)
print(persona1.apellido)
print(persona1.edad)
#Tarea hacer print igual que con el obejeto2
print(f'El objeto1 de la clase persona: {persona1.nombre} {persona1.apellido} Su edad es:  {persona1.edad}')

persona2 = Persona('Osvaldo', 'Giodanini', 45)
print(f'El objeto2 de la clase persona: {persona2.nombre} {persona2.apellido} Su edad es:  {persona2.edad}')

persona1 = Persona('Liliana', 'Buccella', '40')
print(f'El objeto1 modificado de la clase persona: {persona1.nombre} {persona1.apellido} Su edad es:  {persona1.edad}')

# Los atributos son : Caracteristicas
# Los metodos son : el comportamiento que van a tener los objetos (acciones)

persona1.mostrar_detalle()
persona2.mostrar_detalle()