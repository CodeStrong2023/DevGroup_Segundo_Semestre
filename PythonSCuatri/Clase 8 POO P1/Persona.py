class Persona:
# Atributos o características --> metodo init(permite inicializar metodos)

    def __init__(self): # self: Llama a traves de este y el init, uno mismo, al objeto hace referencia
        self.nombre = "Matias"
        self.apellido = "Ikz" # atributos
        self.edad = 22
    def mostrar_detalle(self):
        print(f" Persona: {self.nombre}{self.apellido} {self.edad}")

persona1 = Persona() #constructor, instancia

print(persona1.apellido)
print(persona1.nombre)
print(persona1.edad)

# Creación de objetos con argumentos
class Persona2:
    def __init__(self, nombre,apellido, edad): # self: Llama a traves de este y el init, uno mismo, al objeto hace referencia
        self.nombre = nombre
        self.apellido = apellido # variables
        self.edad = edad
# Objeto: 
persona = Persona2("Arturo", "Lope", "33") # enviamos argumetos

print(persona.apellido) # llamamos a traves del obj persona al atributo(con los valores)
print(persona.nombre)
print(persona.edad)

print(f"El objeto2 de la clase persona es: {persona.nombre} {persona.apellido} Su edad es: {persona.edad}")

class Persona3:
    def __init__(self, nombre,apellido, edad): # self: Llama a traves de este y el init, uno mismo, al objeto hace referencia
        self.nombre = nombre
        self.apellido = apellido # variables
        self.edad = edad
    def mostrar_detalle(self):
        print(f" Persona: {self.nombre}{self.apellido} {self.edad}")

persona3 = Persona3("Jose", "Casti", "45")
print(f"El objeto3 de la clase persona es: {persona3.nombre} {persona3.apellido} Su edad es: {persona3.edad}")

# SI BIEN, EL PROFE LO HACE DENTRO DE UNA MISMA CLASS PERSONA, EL PROGRAMA FUNCIONA..

# Modificar atributos de un objeto
persona3.nombre = "Juancito "
persona3.apellido = " Costra "
persona3.edad = 39

print(f"El objeto3 de la clase persona, modificado es: {persona3.nombre} {persona3.apellido} , Su edad es: {persona3.edad}")

# METODOS DE INSTANCIA:
 # METODO (asociado a una clase) = FUNCION (depende de si misma)
persona1.mostrar_detalle()
persona3.mostrar_detalle()