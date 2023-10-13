class Persona:
    #     def __init__(self):
    #         self.nombre = "Juan"
    #         self.apellido = "Quiles"
    #         self.edad = 22

    # persona1 = Persona()
    # print(persona1.nombre)
    # print(persona1.apellido)
    # print(persona1.edad)

    def __init__(self, nombre, apellido, edad):
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad

    def mostrar_detalle(self):
        print(f"Persona: {self.nombre} {self.apellido} {self.edad}")


persona1 = Persona("Juan", "Quiles", 20)
print(
    f"El objeto 1 de la clase persona: {persona1.nombre} {persona1.apellido}, edad:  {persona1.edad}"
)

persona2 = Persona("Pablo", "Corleone", 23)
print(
    f"El objeto 2 de la clase persona: {persona2.nombre} {persona2.apellido}, edad:  {persona2.edad}"
)

persona1.nombre = "José"
persona1.apellido = "Montana"
persona1.edad = 45

print(
    f"El objeto 1 modificado de la clase persona: {persona1.nombre} {persona1.apellido}, edad:  {persona1.edad}"
)

persona1.mostrar_detalle()
persona2.mostrar_detalle()
