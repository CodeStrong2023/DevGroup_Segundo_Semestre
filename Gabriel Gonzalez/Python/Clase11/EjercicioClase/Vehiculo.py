class Vehiculo:    
    '''
    Definir una clase padre llamada Vehiculo y dos clases hijas llamadas
    Auto y Bicicleta, las cuales heredan de la clase padre Vehiculo. La clase 
    padre debe tener los siguientes atributos y métodos:

    vehiculo (clase padre)
    -Atributos(color, ruedas)
    -Métodos(__init__(color, ruedas) y __str__())

    Auto(clase hija de Vehiculo)
    -Atributos(velocidad (km/hr))
    -Métodos(__init__(color, ruedas, velocidad) y __str__())

    Bicicleta(Clase hija de Vehiculo)
    -Atributos(tipo(urbana/montaña/etc.))
    -Métodos(__init__(color, ruedas, tipo) y __str__())

    Crear un objeto de cada clase

    '''
    def __init__(self, color, ruedas):
        self.color = color
        self.ruedas = ruedas

    def __str__(self):
        return 'Color:  ' + self.color +' , Ruedas:  ' + str(self.ruedas)
    
class Auto(Vehiculo):
    def __init__(self, color, ruedas, velocidad):
        super().__init__(color, ruedas)
        self.velocidad = velocidad

    def __str__(self):
        return super().__str__()+' , Velocidad(km/hr): ' + str(self.velocidad)

class Bicicleta(Vehiculo):
    def __init__(self, color, ruedas, tipo):
        super().__init__(color, ruedas)
        self.tipo = tipo
        
    def __str__(self):
        return super().__str__()+' , Tipo: '+ (self.tipo)

# Primer objeto de la clase padre vehiculo
vehiculo = Vehiculo('Blanco', 4)
print(vehiculo)

# Segundo objeto de la clase hija Auto
auto = Auto('Blanco', 4, 100)
print(auto)

# Tercer objeto de la clase hija Bicicleta
bicicleta = Bicicleta('Roja', 2 , 'Urbana')
print(bicicleta)

    

    

