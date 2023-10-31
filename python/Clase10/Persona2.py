class Persona2:
    def __init__(self, nombre, apellido, edad):
        self._nombre = nombre
        self._apellido = apellido
        self._edad = edad

    def mostrar_detalles(self):
        print(
            f"Los datos a mostrar son los siguientes: {self._nombre} {self._apellido} {self._edad}"
        )

    @property
    def nombre(self):  # Método Getter
        print("Estamos usando el método Get")
        return self._nombre

    @nombre.setter
    def nombre(self, nombre):  # Método Setter
        print("Estamos usando el método Set")
        self._nombre = nombre

    @property
    def apellido(self):  # Método Getter
        print("Estamos usando el método Get")
        return self._apellido

    @apellido.setter
    def apellido(self, apellido):  # Método Setter
        print("Estamos usando el método Set")
        self._apellido = apellido

    @property
    def edad(self):  # Método Getter
        print("Estamos usando el método Get")
        return self._edad

    @edad.setter
    def edad(self, edad):  # Método Setter
        print("Estamos usando el método Set")
        self._edad = edad

    def __del__(self):
        print(f"Persona2: {self._nombre} {self._apellido} {self._edad}")


if __name__ == "__main__":
    persona1 = Persona2("Marcos", "Martos", 19)
    print(persona1.nombre)  # Llamamos al método Getter
    persona1.nombre = "Julian"  # Llamamos al método Setter
    print(persona1.nombre)
    print(persona1.apellido)  # Llamamos al método Getter
    print(persona1.edad)  # Llamamos al método Getter
    print(persona1.mostrar_detalles())
    # Atributo read-only sería la edad porque no tiene el método set
    # print(persona1.edad)

    # Tarea: Crear tres objetos más, utilizando los métodos getter y setter
    # para modificar, y mostrar los cambios con el método mostrar_detalles

    persona2 = Persona2("Pablo", "Bogado", 19)
    persona2.nombre = "Juan"
    persona2.apellido = "Onetti"
    persona2.edad = 89
    print(persona2.mostrar_detalles())

    persona3 = Persona2("Axel", "Arrieta", 19)
    persona3.nombre = "Marcelo"
    persona3.apellido = "Martos"
    persona3.edad = 35
    print(persona3.mostrar_detalles())

    persona4 = Persona2("Damian", "Escudero", 23)
    persona4.nombre = "Roberto"
    persona4.apellido = "Ruiz"
    persona4.edad = 54
    print(persona4.mostrar_detalles())

    print(__name__)
