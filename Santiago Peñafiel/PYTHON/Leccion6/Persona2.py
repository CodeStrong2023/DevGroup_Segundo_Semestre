class Persona2:
    def __int__(self, nombre, apellido, edad): #Esta encapsulado
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


persona1 = Persona2('Ariel', 'Betancud', 41)
print(persona1.nombre)  # llamamos al metodo getter
