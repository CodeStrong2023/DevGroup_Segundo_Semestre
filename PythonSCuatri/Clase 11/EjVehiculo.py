class Vehiculo:
    """
    Definir una clase padre llamada Vehiculo y dos hijas llamada Auto y Bicicleta
    las cuales heredan de la clase padre Vehiculo. La clase padre debe tener los sgtes atributos y met:
     Vehiculo(clase padre)
     - atributos(color, ruedas)
     - metodos(__init__(color, ruedas) y __str__())

     Auto(hija de vehiculo)
     - atributos(velocidad (km/h))
     - metodos(__init__(color, ruedas, velocidad) y __str__())
    
     Bicicleta(clase hija de vehiculo)
     - atributos(tipo(urbana/montaña/etc.))
     - metodos(__init__(color, ruedas,tipo) y __str__())

    crear un obj para cada clase
    """
    def __init__(self, color, ruedas):
        self.color = color
        self. ruedas = ruedas
    def __str__(self):
        return "color:  " + self.color + " ruedas: " + str(self.ruedas)

class Auto(Vehiculo):
    #met dunter y str
    def __init__(self, color, ruedas,velocidad):
        super().__init__(color, ruedas)
        self.velocidad = velocidad
    def __str__(self):
        return super().__str__() + ", velocidad(km/h): " + str(self.velocidad)
    
class Bicicleta(Vehiculo):
    #met dunter y str
    def __init__(self, color, ruedas, tipo):
        super().__init__(color, ruedas)
        self.tipo = tipo
    def __str__(self):
        return super().__str__() + ", tipo de bicicleta: " + self.tipo
    
# creamos el primer obj
vehiculo = Vehiculo(" Negro mate , ", 4)
print(vehiculo)

# Creamos el segundo obj
auto = Auto(" Rojo , ", 4, 120)
print(auto)

# tercer obj
bici = Bicicleta("Celeste ", 2, " Mountanbike")