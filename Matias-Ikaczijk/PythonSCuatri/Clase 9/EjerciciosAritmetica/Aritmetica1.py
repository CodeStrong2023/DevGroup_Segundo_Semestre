class Aritmetica:
    """
    el nombre de este tipo de comentario es: DocString
    En esta clase veremos algunas operaciones como suma, resta, multiplicacion y mas..
    """
    def __init__(self, operandoA, operandoB):
        self.operandoA = operandoA
        self.operandoB = operandoB

    # Metodos para sumar, restar, mult, div

    def sumar(self):
        return self.operandoA + self.operandoB
    def resta(self):
        return self.operandoA - self.operandoB
    def mult(self):
        return self.operandoB * self.operandoA
    def div(self):
        return self.operandoA / self.operandoB
    
# CREAMOS UNA INSTANCIA DE LA CLASE ARITMETICA
aritmetica1 = Aritmetica(7,9)
print(f"La suma es igual a =   {aritmetica1.sumar()}")
print(f"La resta de los dos numeros es: {aritmetica1.resta()}")
print(f"La multiplicacion de los dos numeros es: {aritmetica1.mult()}")
print(f"La division de los dos numeros es: {aritmetica1.div():.2f}")