class Rectangulo:
    def __init__(self, base, altura):
        self.altura = altura
        self.base = base

    def calcular_area(self):
        return self.altura * self.base


base = int(input("Ingresela base del rectángulo: "))
altura = int(input("Ingrese la altura del rectángulo: "))

rectangulo1 = Rectangulo(base, altura)

print(f"Área: {rectangulo1.calcular_area()}")
