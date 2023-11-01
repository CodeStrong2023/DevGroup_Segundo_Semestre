class Persona2:
    def __init__(self, nombre, apellido, edad):
        self._nombre = nombre # encapsulamos con el _
        self._apellido = apellido 
        self._edad = edad
    def mostrar_detalle(self):
        print(f" Los datos a mostrar son los siguientes: {self._nombre} {self._apellido} {self._edad}")
    
    # para cada atributo necesitamos un metodo getter and setter
    
    @property #decorador 
    
    def nombre(self): # Método getter
        print("Utlizamos el metodo GET")
        return self._nombre 
    @nombre.setter # setter
    def nombre(self, nombre): #Método setter
        print("Utilizamos el método set")
        self._nombre = nombre

    # TAREA. Crear el método get y set para el apellido y edad

    @property
    def apellido(self):
        return self._apellido
    @apellido.setter
    def apellido(self, apellido):
        self._apellido = apellido
    
    @property
    def edad(self):
        return self._edad
    @edad.setter
    def apellido(self, edad):
        self._edad = edad

persona1 = Persona2("Matias " , "Ikaczijk ", 22)
print(persona1.nombre , persona1.apellido) # llamamos al metodo get