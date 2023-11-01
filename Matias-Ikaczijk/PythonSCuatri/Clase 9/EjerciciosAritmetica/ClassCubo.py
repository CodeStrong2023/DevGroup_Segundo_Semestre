class Cubo:
    """
    Crear la clase cubo con los atributos ancho, alto y profundidad
    con unmetodo calcular volumen: 
    volumen = ancho * alto * profundidad
    el usuario debe ingresar los valores

    """
    def __init__(self, ancho, alto, profundidad): #recibe los parametros
        self.ancho = ancho
        self.alto = alto
        self.profundidad = profundidad
    
    def Volumen(self):
        return self.ancho * self.alto * self.profundidad
    
ancho = int(input("Escriba el numero que corresponde al ancho del cubo: "))
alto = int(input("Escriba el numero para la altura del cubo: "))
profundidad = int(input("Escriba el numero que corresponde a la profundidad: "))

cubo1 = Cubo(ancho, alto, profundidad) # conv a atributos
print(f"El volumen del cubo es: {cubo1.Volumen()}")
