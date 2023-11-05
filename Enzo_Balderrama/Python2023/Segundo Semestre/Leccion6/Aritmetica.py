class Aritmetica:
    '''
    El nombre de este tipo de comentario es docString
    esto es documentación de la clase en python
    vamos a hacer en esta clase algunas operaciones de suma, resta, multiplicar y más.    
    '''
    def __init__(self, a, b):
        self.a = a
        self.b = b
    def sumar(self):
        return self.a + self.b
    
    def resta(self):
        return self.a - self.b
    
    def multiplicar(self):
        return self.a * self.b
    
    def dividir(self):
        return self.a / self.b
    
aritmetica1 = Aritmetica(7, 9)
print(f'La suma de los números es: {aritmetica1.sumar()}')
print(f'La resta de los números es: {aritmetica1.resta()}')
print(f'La multiplicación de los números es: {aritmetica1.multiplicar()}')
print(f'La división de los números es: {aritmetica1.dividir():.2f}')
