class Persona:  # Esta clase hereda de la clase Object
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

    def __str__(self):  # Override - Sobreescribir
        return f"Persona: [nombre: {self._nombre}, edad:  {self._edad}] "


class Empleado(Persona):  # Esta clase es hija de la clase Persona
    def __init__(self, nombre, edad, sueldo):
        super().__init__(nombre, edad)
        self.sueldo = sueldo

    @property
    def sueldo(self):
        return self._sueldo

    @sueldo.setter
    def sueldo(self, sueldo):
        self._sueldo = sueldo

    def __str__(self):
        return f"Empleado: [sueldo: {self._sueldo}] {super().__str__()}"


empleado1 = Empleado("Marcos", 19, 100000)
print(empleado1)
print(empleado1.nombre)
print(empleado1.edad)
print(empleado1.sueldo)

empleado2 = Empleado("Donato", 20, 250000)
print(empleado2.nombre)
print(empleado2.edad)
print(empleado2.sueldo)
empleado2.nombre = "Pablo"
empleado2.edad = 19
empleado2.sueldo = 300000
print(empleado2.nombre)
print(empleado2.edad)
print(empleado2.sueldo)
