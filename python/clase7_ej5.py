# Ejercicio 5: Convertidor de temperaturas

def celsius_fahrenheit(celsius):
    return celsius * 9 / 5 + 32


def fahrenheit_celsius(fahrenheit):
    return (fahrenheit - 32) * 5 / 9


celsius = float(input("Ingrese el valor de Celsius: "))
resultado = celsius_fahrenheit(celsius)
print(f"{celsius} C a F -> {resultado:.2f}")

fahrenheit = float(input("Ingrese el valor de Fahrenheit: "))
resultado = fahrenheit_celsius(fahrenheit)
print(f"{fahrenheit} F a C -> {resultado:.2f}")
