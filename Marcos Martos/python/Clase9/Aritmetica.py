class Aritemtica:
    """
    El nombre de este tipo de comentario es DocString
    esto es documentaicón de la clase en python
    Vamos a hacer en esta clase algunas operaciones de: suma, resta, multiplicación y más...
    """

    def __init__(self, operandoA, operandoB):
        self.operandoA = operandoA
        self.operandoB = operandoB

    # Método para sumar
    def sumar(self):
        return self.operandoA + self.operandoB

    # Método para restar
    def restar(self):
        return self.operandoA - self.operandoB

    # Método para multiplicar
    def multiplicar(self):
        return self.operandoA * self.operandoB

    # Método para dividir
    def dividir(self):
        return self.operandoA / self.operandoB


aritmetica1 = Aritemtica(7, 9)  # Le pasamos los argumentos para los operandos

print(f"La suma de los números es: {aritmetica1.sumar()}")
print(f"La resta de los números es: {aritmetica1.restar()}")
print(f"La multiplicacion de los números es: {aritmetica1.multiplicar()}")
print(f"La division de los números es: {aritmetica1.dividir():.2f}")
