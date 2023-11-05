class Persona2:
    def __init__(self, nombre, apellido, edad):
        self._nombre = nombre
        self._apellido = apellido
        self._edad = edad
    def mostrar_detalles(self):
        print(f'Los datos a mostrar son los siguientes: {self._nombre} {self._apellido} {self._edad}')
    @property # decorador
    def nombre(self): # Metodo getter.
        print("Estamos utilizando el metodo get.")
        return self._nombre
    @nombre.setter
    def nombre(self, nombre): # Metodo setter.
        print("Estamos utilizando el método set.")
        self._nombre = nombre
        
    @property # decorador
    def apellido(self): # Metodo getter.
        print("Estamos utilizando el metodo get.")
        return self._apellido
    @apellido.setter
    def apellido(self, apellido): # Metodo setter.
        print("Estamos utilizando el método set.")
        self._apellido = apellido
    @property # decorador
    def edad(self): # Metodo getter.
        print("Estamos utilizando el metodo get.")
        return self._edad
    @edad.setter
    def edad(self, edad): # Metodo setter.
        print("Estamos utilizando el método set.")
        self._edad = edad
    def __del__(self):
        print(f"Persona2: {self._nombre} {self._apellido} {self._edad}")

if __name__ == "__main__":
    persona1 = Persona2("Enzo", "Balderrama", 25)
print(persona1.nombre) #Llamammos al metodo getter
print(persona1.apellido)
print(persona1.edad)
persona1.nombre = "Enzo Ariel"
print(persona1.mostrar_detalles())
    # Tarea: Crear tres objetos más, utilizando los métodos getter y setter
    # para modificar, y mostrar los cambios con el método mostrar_detalles
persona2 = Persona2("Mari", "Balderrama", 30)
persona2.nombre = "Marianela"
persona2.apellido = "Cornejo"
persona2.edad = 34
print(persona2.mostrar_detalles())

persona3 = Persona2("Jazmin", "Cordero", 25)
persona3.nombre = "Rocio"
persona3.apellido = "Barros"
persona3.edad = 20
print(persona3.mostrar_detalles())

persona4 = Persona2("Antonimo", "Contreras", 33)
persona4.nombre = "Esteban"
persona4.apellido = "Quito"
persona4.edad = 44
print(persona4.mostrar_detalles())

print(__name__)