# Ejercicio 5: Convertidor de temperaturas.
# Realizar dos funciones. Para convertir de grados Celsius a Fahrenheit y viceversa.
def convertidorCelsius(gradosF):
    gradosC = (gradosF - 32) * (5/9)
    return gradosC
def convertidorFahrenheit(gradosC):
    gradosF = (gradosC * (9/5)) + 32
    return gradosF

gradosCelsius = int(input("Ingrese grados Celsius: "))
print(f'{gradosCelsius}°C equivalen a {convertidorFahrenheit(gradosCelsius)}°F')
gradosFahrenheit = int(input("Ingrese grados Fahrenheit: "))
print(f'{gradosFahrenheit}°F equivalen a {convertidorCelsius(gradosFahrenheit)}°C')
