class Persona2:
    def__init__(self,nombre,apellido,edad):
    self.nombre = nombre
    self.apellido = apellido
    self.edad = edad

    def mostrar_detalles(self):
        print(f"Los datos a mostrar son los siguientes: {self.nombre} {self.apellido} {self.edad} ")

     # decorador
    @property
    def nombre(self): 
        print("Estamos utilizando el método get")
        return self._nombre
    

     #Metodo setter
    @nombre.setter
    def nombre(self, nombre):
        print("Estamos utilizando el método set")
        self._nombre = nombre
    @property
    def apellido(self):
        return self._apellido
    @apellido.setter
    def apellido(self,apellido):
        self._apellido = apellido
    
    @property
    def edad(self):
        return self._edad
    @edad.setter
    def edad(self,edad):
        self._edad = edad
    def __del__(self):
        print(f"Persona2:{self._nombre} {self._apellido} {self._edad}")

if __name__ == "__main__":
    #Llamamos al metodo getter
    persona1 = Persona2("Angelo","Vellar", 21)
    print(persona1.nombre())
#Llamamos el metodo setter
    persona1.nombre = "Lucas Sanchez"
    print(persona1.nombre) #Otra vez con el método getter
 #Llamamos el método detalles
    print(persona1.mostrar_detalles())

#Atributo read-only (Solo lectura) sería la edad porque no tiene el método set
    print(persona1.edad)

#Tarea crear tres objetos mas, utilizando los métodos getter and setter para modificar y mostrar los cambios
#con el metodo mostrar detalles

    persona2 = Persona2("Julieta","Martinez", 22)
    persona2.nombre = "Julieta"
    persona2.apellido = "Martinez"
    persona2.edad = 22
    print(persona2.nombre)
    print(persona2.apellido)
    print(persona2.edad)

    print(persona2.mostrar_detalles())

    persona3 = Persona2("Monica","Correa", 21)
    persona3.nombre = "Monica"
    persona3.apellido = "Correa"
    persona3.edad = 31
    print(persona3.nombre)
    print(persona3.apellido)
    print(persona3.edad)
    print(persona3.mostrar_detalles())


    persona4 = Persona2("Magui","Gutierrez", 25)
    persona4.nombre = "Magali"
    persona4.apellido = "Gutierrez"
    persona4.edad = 25
    print(persona4.nombre)
    print(persona4.apellido)
    print(persona4.edad)
    print(persona4.mostrar_detalles())

    print(__name__)