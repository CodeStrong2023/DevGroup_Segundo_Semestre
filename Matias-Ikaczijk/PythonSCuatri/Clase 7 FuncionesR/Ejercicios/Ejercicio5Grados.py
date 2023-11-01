# EJERCICIO 5: Convertir temp

# Realizar funciones para convertir de grados celsius a fahrenheit y viseversa..
# Formulas: ºF = ºC x 1.8 + 32 // ºC = (ºF-32) ÷ 1.8

# funcion Convertir grados de celsius a f:
def CaFahrenheit(celsius):
    return celsius * 1.8 + 32

def FaCelsius(Fahrenheit): # grados f a c
    return (Fahrenheit - 32) / 1.8

celsius = float(input("Escriba los grados Celsius: "))
resultado = CaFahrenheit(celsius)
print(f"{celsius} C a F --> {resultado} ")

Fahrenheit = float(input("Ingrese los grados Fahrenheit: "))
resultado = FaCelsius(Fahrenheit)
print(f"{Fahrenheit} F a C --> {resultado}")