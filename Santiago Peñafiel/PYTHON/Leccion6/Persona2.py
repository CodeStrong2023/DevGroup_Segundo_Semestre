class Persona2:
    def __init__(self, nombre, apellido, edad): #Esta encapsulado
        self._nombre = nombre
        self._apellido = apellido
        self._edad = edad


    def mostrar_detalles(self):
        print(f'Los datos mostrados son los siguientes: {self._nombre} {self._apellido} {self._edad}')

    @property  # decorador
    def nombre(self):  # Metodo Getter
        print('Estamos utilizando el metodo Getter')
        return self._nombre


    @nombre.setter
    def nombre(self, nombre):  # Metodo Setter
        print('Estamos utilizando el metodo set')
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
if __name__== '     main       ':

    persona1 = Persona2('Ariel', 'Betancud', 41)
    print(persona1.nombre)  # llamamos al metodo getter
    persona1.nombre = 'Juan Pedro'#LLamamos al metodo setter
    print(persona1.nombre) #Otra vez con getter
    print(persona1.mostrar_detalles()) #llamamos al metodo mostrar_detalle

    #Atributo read-Only (Solo lectura) sera la edad porque no tieene el metodo set

    print(persona1.edad)

    #Tarea crear tres objetos mas, utilizando los metodos getter and setter
    #para modificar, y mostrar los cambios con el metodo mostrar_detalles

    #obtejo n°1 de la tarea
    persona2 = Persona2('Franco', 'Gomez', 29)
    print(persona2.nombre)
    print(persona2.apellido)
    print(persona2.edad)
    persona2.nombre = 'German Franco'
    persona2.apellido = 'Gomes'
    persona2.edad = 35
    print(persona2.mostrar_detalles())

    #obtejo n°2 de la tarea
    persona3 = Persona2('Mariela', 'Parra', 23)
    print(persona3.nombre)
    print(persona3.apellido)
    print(persona3.edad)
    persona3.nombre = 'Mariela Marta'
    persona3.apellido = 'Giñazu'
    persona3.edad = 35
    print(persona3.mostrar_detalles())

    #obtejo n°3 de la tarea
    persona4 = Persona2('joaquin', 'Garcia', 29)
    print(persona4.nombre)
    print(persona4.apellido)
    print(persona4.edad)
    persona4.nombre = 'Mariano'
    persona4.apellido = 'Perez'
    persona4.edad = 48
    print(persona4.mostrar_detalles())

print(__name__)