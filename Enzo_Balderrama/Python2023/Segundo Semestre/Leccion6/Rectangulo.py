class Rectangulo:
    """
    Crear una clase llamada Rectangulo, debe tener 2 atributos: altura y base.
    El nombre del método será calcular area utilizando la formula:
    area = base * altura. Pero la base y altura deben ser ingresadas por el usuario y los obj
    deben ser 3.
    """
    def __init__(self, base, altura):
        self.base = base
        self.altura = altura
    def calcular_area(self):
        return self.base * self.altura   
    
user_base = int(input("Por favor ingrese la base para el primer rectangulo: "))
user_altura = int(input("Por favor ingrese la altura para el primer rectangulo: "))
rectangulo1 = Rectangulo(user_base, user_altura)
print(f'El area del rectangulo1 es: {rectangulo1.calcular_area()}')
user_base = int(input("Por favor ingrese la base para el segundo rectangulo: "))
user_altura = int(input("Por favor ingrese la altura para el segundo rectangulo: "))
rectangulo2 = Rectangulo(user_base, user_altura)
print(f'El area del rectangulo2 es: {rectangulo2.calcular_area()}')
user_base = int(input("Por favor ingrese la base para el tercer rectangulo: "))
user_altura = int(input("Por favor ingrese la altura para el tercer rectangulo: "))
rectangulo3 = Rectangulo(user_base, user_altura)
print(f'El area del rectangulo3 es: {rectangulo3.calcular_area()}')
    