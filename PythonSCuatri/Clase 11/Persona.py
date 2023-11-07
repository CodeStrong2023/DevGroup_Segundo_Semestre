class Persona:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad
    
    @property
    def nombre(self):
        return self._nombre
    @nombre.setter
    def nombre(self, nombre):
        self._nombre = nombre

    @property
    def edad(self):
        return self._edad
    @edad.setter
    def edad(self, edad):
        self._edad = edad
    
    def __str__(self): # sobre escribir los atributos encapsulados
        return f"Persona: [ Nombre: {self._nombre} , Edad: {self._edad}]"
    
class Empleado(Persona): # clase hija de la clase persona
    def __init__(self, nombre, edad, sueldo):
        super().__init__(nombre, edad) # usamos las caract del padre
        self.sueldo = sueldo
    
    @property
    def sueldo(self):
        return self._sueldo
    
    @sueldo.setter
    def sueldo(self, sueldo):
        self._sueldo = sueldo
    
    def __str__(self):
        return f" Empleado: [ Sueldo: {self._sueldo}] {super().__str__()}" # sobre escribimos el str de la clase padre

Empleado1 = Empleado("Arturo", 40, 78900)
print(Empleado1.nombre)
print(Empleado1.edad)
print(Empleado1.sueldo)

# Crear otro obj, pasar los datos y mostrarlos (encapsulamiento, getter and setter) 
# Modificarlos y volverlos a mostrar

Empleado2 =  Empleado("Mariela", 20, 456890)
print(Empleado2.nombre)
print(Empleado2.edad)
print(Empleado2.sueldo)

#Modificamos 
Empleado2.nombre = "Manuela"
Empleado2.edad = 38
Empleado2._sueldo = 259800