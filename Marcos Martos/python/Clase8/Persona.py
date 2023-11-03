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

    def __init__(self, nombre, apellido, edad):  # Se lo llama método init Dunder
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad

    def mostrar_detalle(self):
        print(f"Persona: {self.nombre} {self.apellido} {self.edad}")


persona1 = Persona("Juan", "Salazar", 22)  # Necesitamos enviar argumentos
print(
    f"El objeto 1 de la clase persona: {persona1.nombre} {persona1.apellido}, Su edad es:  {persona1.edad}"
)

persona2 = Persona("Micaela", "Fontendiue", 25)
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
persona1.mostrar_detalle()
persona2.mostrar_detalle()
