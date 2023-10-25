class Cubo:
    def __init__(self, ancho, altura, profundidad):
        self.ancho = ancho
        self.altura = altura
        self.profundidad = profundidad

    def calcular_volumen(self):
        return self.ancho * self.altura * self.profundidad


ancho = int(input("Ingrese el ancho del cubo: "))
altura = int(input("Ingrese la altura del cubo: "))
profundidad = int(input("Ingrese la profundidad del cubo: "))

cubo1 = Cubo(ancho, altura, profundidad)
print(f"Volumen: {cubo1.calcular_volumen()}")
