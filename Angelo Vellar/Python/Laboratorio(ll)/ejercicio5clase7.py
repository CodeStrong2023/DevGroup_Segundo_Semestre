#Ejercicio 5: Convertidor de temperaturas
#Realizar dos funciones para convertir de grados celsius a fahrenheit y viseversa.
#Investigar las formulas


#Función para Celsius
def celsius_fahrenheit(celsius):
    return celsius * 9 / 5 + 32

#Acá pasamos de grados C a F
celsius = float(input("Digite los grados celsius: "))
resultado = celsius_fahrenheit(celsius)
print(f"{celsius} C a F -> {resultado:.2f}")

#Función para fahrenheit
def fahrenheit_celsius(fahrenheit):
    return (fahrenheit - 32) * (5 / 9)

#Acá pasamos de grados F a C
fahrenheit = float(input("Digite los fahrenheit: "))
resultado2 = fahrenheit_celsius(fahrenheit)
print(f"{fahrenheit} F a C -> {resultado2:.2f}")