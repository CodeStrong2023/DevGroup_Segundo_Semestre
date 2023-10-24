#Debe tener do atributos. Altura y base
# el nombre del metodo será calcilar el area utilizando la formula:
# area = base * altura . Pero los datos lo debe ingresar el usuario y 
# los objetos deben ser 3..

class Rectangulo:
    def __init__(self, altura, base):
        self.altura = altura
        self.base = base
    def calcularArea(self):
        return self.altura * self.base
base = int(input("Escriba el numero que corresponde a la base del rectangulo: "))
altura = int(input("Escriba el numero para la altura del rectángulo: "))

Rectangulo1 = Rectangulo(base,altura)
print(f"El resultado de esta multiplicacion es: {Rectangulo1.calcularArea()}")
