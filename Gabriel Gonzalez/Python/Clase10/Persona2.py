class Persona2:
    def __init__(self, nombre, apellido, edad):
        self._nombre = nombre
        self._apellido = apellido
        self._edad = edad 
    def mostrar_detalles(self):
        print(f'Los datos a mostrar son los siguientes: {self._nombre} {self._apellido} {self._edad}')

    @property # Decorador
    def nombre(self): # Método Getter
        print("Estamos utilizando el método get")
        return self._nombre
    
    @nombre.setter
    def nombre(self, nombre): # Método Setter
        print("Estamos utilizando el método set")
        self._nombre = nombre
    
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
    def edad(self, edad):
       self._edad = edad

    def __del__(self):
        print(f'Persona2: {self._nombre} {self._apellido} {self._edad}')

    
if __name__ == '__main__':
    persona1 = Persona2('Gabriel', 'Gonzalez', '19')
    print(persona1.nombre) # Llamamos al método getter

    persona1.nombre = 'Daniel' # Llamamos al método setter donde modificamos el nombre
    print(persona1.nombre) # Otra vez con el método getter
    print(persona1.mostrar_detalles()) # Llamamos al método mostrar_detalle
    # Atributo red-only: (solo lectura) seria la edad porque no tiene el método set
    print(persona1.edad)

    # Objeto número 2 de la tarea
    persona2 = Persona2('Julian', 'Rodriguez', '25')
    print(persona2.nombre)
    print(persona2.apellido)
    print(persona2.edad)
    persona2.nombre = 'Fernando'
    persona2.apellido = 'Fernandez'
    persona2.edad = '30'
    print(persona2.mostrar_detalles())

    # Objeto número 3 de la tarea
    persona3 = Persona2('Edinson', 'Bustos', '16')
    print(persona3.nombre)
    print(persona3.apellido)
    print(persona3.edad)
    persona3.nombre = 'Facundo'
    persona3.apellido = 'Lopez'
    persona3.edad = '50'
    print(persona3.mostrar_detalles())

    # Objeto número 4 de la tarea
    persona4 = Persona2('Cristian', 'Romero', '23')
    print(persona4.nombre)
    print(persona4.apellido)
    print(persona4.edad)
    persona4.nombre = 'Nicolas'
    persona4.apellido = 'Otamendi'
    persona4.edad = '35'
    print(persona4.mostrar_detalles())

    print(__name__)