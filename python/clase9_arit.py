class Aritemtica:
    def __init__(self, operandoA, operandoB):
        self.operandoA = operandoA
        self.operandoB = operandoB

    def sumar(self):
        return self.operandoA + self.operandoB

    def restar(self):
        return self.operandoA - self.operandoB

    def multiplicar(self):
        return self.operandoA * self.operandoB

    def dividir(self):
        return self.operandoA / self.operandoB


aritmetica1 = Aritemtica(7, 9)

print(f"Suma: {aritmetica1.sumar()}")
print(f"Resta: {aritmetica1.restar()}")
print(f"Multiplicación: {aritmetica1.multiplicar()}")
print(f"División: {aritmetica1.dividir():.2f}")
