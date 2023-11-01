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
    @edad.setter # modifica lo de adentro del atributo
    def edad(self, edad):
        self._edad = edad
    
    def __del___(self): # destructor
        print(f"Persona2: {self._nombre} {self._apellido} {self._edad} ") 
    
if __name__ == "__main__":
    persona1 = Persona2("Matias " , "Ikaczijk ", 22)
    print(persona1.nombre) # llamamos al metodo get 
    print(persona1.mostrar_detalle())
    # CREAR tres objetos mas, utilizando los metodos getter and setter
    # # para modificar y mostrar los cambios con el metodo mostrar_detalle
    # # dif entre getter y setter. El setter, necesita el self y otro parametro, porque modifica el valor del atributo. 
    persona2 = Persona2("Juan Carlos ", "Lopez ", 49) 
    persona2.nombre = "Juan Andres "
    persona2.apellido = "Araujo" 
    persona2.edad = 33 
    
    print(persona2.nombre) 
    print(persona2.apellido) 
    print(persona2.edad) 
    print(persona2.mostrar_detalle()) 
    
    persona3 = Persona2("Estela ", "De La Hoz ", 65) 
    persona3.nombre = "Julian " 
    persona3.apellido = "Arao" 
    persona3.edad = 19 
    
    print(persona3.nombre) 
    print(persona3.apellido) 
    print(persona3.edad) 
    print(persona3.mostrar_detalle()) 
    
    persona4 = Persona2("Florencia ", "Mosano ", 46) 
    persona4.nombre = "Jazmin " 
    persona4.apellido = "Ocla" 
    persona4.edad = 41 
    
    print(persona4.nombre) 
    print(persona4.apellido) 
    print(persona4.edad) 
    print(persona4.mostrar_detalle()) 