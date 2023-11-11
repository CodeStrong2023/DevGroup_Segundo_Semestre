class Vehiculo:
    """
    Definir una clase padre llamada Vehiculo y do clases hijas
    llamadas Auto y Bicicleta, las cuales heredan de la clase padre Vehiculo.
    La clase padre debe tener los sgtes atributos y métodos:
    Vehiculo(Clase padre)
    -Atributos(color, ruedas)
    -Métodos(__init__(),__str__())

    Auto(Clase hija de Vehiculo)
    -Atributos(Velocidad(km/hr))
    -Métodos(__init__(),__str__())

    Bicicleta(Clase hija de Vehiculo)
    -Atributos(tipo)
    -Métodos(__init__(),__str__())

    Crear un objeto de cada clase
    """

    def __init__(self, color, ruedas):
        self.color = color
        self.ruedas = ruedas

    def __str__(self):
        return "Color: " + self.color + " Ruedas: " + str(self.ruedas)


class Auto(Vehiculo):
    def __init__(self, color, ruedas, velocidad):
        super().__init__(color, ruedas)
        self.velocidad = velocidad

    def __str__(self):
        return super().__str__() + " Velocidad (km/h): " + str(self.velocidad)


class Bicicleta(Vehiculo):
    def __init__(self, color, ruedas, tipo):
        super().__init__(color, ruedas)
        self.tipo = tipo

    def __str__(self):
        return super().__str__() + ", Tipo: " + self.tipo


# Primer objeto de la clase Vehiculo
vehiculo = Vehiculo("Rojo", 4)
print(vehiculo)

# Segundo objeto, ahora la clase hija Auto
auto = Auto("Amarillo", 4, 120)
print(auto)

# Tercer objeto, ahora la clase hija Bicicleta
bicicleta = Bicicleta("Azul", 2, "Urbana")
print(bicicleta)