class Rectangulo:
    """
    Crear una clase llamada rectangulo, debe tener 2 atributos: base y altura
    el nombre del método será calcular area utilizando la fórmula:
    area = base * altura. Pero la base y la altura deben ser ingresadas por
    el usuario y los objetos deben ser tres
    """

    def __init__(self, base, altura):
        self.altura = altura
        self.base = base

    def calcular_area(self):
        return self.altura * self.base


base = int(input("Digite el número para la base del rectángulo: "))
altura = int(input("Digite el número para la altura del rectángulo: "))

rectangulo1 = Rectangulo(base, altura)

print(f"El área del rectángulo es: {rectangulo1.calcular_area()}")
