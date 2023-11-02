class Persona: #Creamos una clase
    def __init__(self, nombre, apellido, dni, edad, *args, **kwargs): #Se lo llama metodo Init Dunder
        self.nombre = nombre
        self.apellido = apellido
        self._dni = dni # ESte atributo esta encapsulado de una manera sugerida
        self.edad = edad
        self.args = args
        self.wkargs = kwargs
    def mostrar_detalle(self): # self es igual a this
        print(f'La clase Persona tiene los siguientes datos: {self.nombre} {self.apellido} {self._dni} {self.edad} la direcciones es: {self.args}, los datos importantes son: {self.wkargs}')


persona1 = Persona('Ariel', 'Betancud', 45326888, '40') #necesitamos enviar argumentos
print(persona1.nombre)
print(persona1.apellido)
print(persona1.edad)
#Tarea hacer print igual que con el obejeto2
print(f'El objeto1 de la clase persona: {persona1.nombre} {persona1.apellido} Su edad es:  {persona1.edad}')

persona2 = Persona('Osvaldo', 'Giodanini', 26354879, 45)
print(f'El objeto2 de la clase persona: {persona2.nombre} {persona2.apellido} Su edad es:  {persona2.edad}')

persona1 = Persona('Liliana', 'Buccella', 25555678, '40')
print(f'El objeto1 modificado de la clase persona: {persona1.nombre} {persona1.apellido} Su edad es:  {persona1.edad}')

# Los atributos son : Caracteristicas
# Los metodos son : el comportamiento que van a tener los objetos (acciones)

persona1.mostrar_detalle()
persona2.mostrar_detalle()

# Persona.mostrar_detalle(persona1) #Debemos pasarle una referencia para el self o dara error
persona1.telefono ='1265465465'
print(f'Este es el telefono de: {persona1.nombre} {persona1.telefono}') # hermos creado un atributo de un objeto

#print(persona2.telefono) el objeto persona2 no tiene este atributo por lo tanto da error

persona3 = Persona('Rogelio', 'Romero', 36485699, 22, 'Telefono', '5654456465465', 'Calle Lopez', 823, 'Manzana', 77, 'Casa', 18, Altura=1.83, Peso=105, CFavorito='Azul', Auto='Citroen', Modelo=2021)
persona3.mostrar_detalle()
persona4 = Persona('Pedro', 'Lopez', 15369785, 22, 'Telefono', '2625444488', 'Calle Colon', 456, 'Manzana', 15, 'Casa', 6, Altura=1.75, Peso=95, CFavorito='Verde', Auto='Ford', Modelo=2023)
persona4.mostrar_detalle()
#print(persona3._dni) # ESto no se debe utilizar en python (esta encapsulado ) por mas que si lo ejecutamos funcione
#print(persona3.__nombre) #Esta totalmente encapsulado  #para encapsular totalmente usamos __