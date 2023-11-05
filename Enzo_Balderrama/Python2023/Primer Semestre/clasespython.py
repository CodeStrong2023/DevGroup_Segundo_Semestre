"""
miVariable = 3
print(miVariable)
miVariable = "Hola a todos desde python"
print(miVariable)
miVariable = 3.5
print(miVariable)
x = 10
y = 2
z = x + y
print(id(x))
# Las literales se escriben x240, la variable y = 984, la variable z = x304
print(id(y))
print(id(z))

# Tipos int, float, string, bool
x = 10
print(x)
print(type(x))
x = 13.2
print(x)
print(type(x))
x = "Hola mundo"
print(x)
print(type(x))
x = True
print(x)
print(type(x))
x = False
print(x)
print(type(x))

# Manejo de cadenas
MyFavoriteBand = "Mägo de Oz"
Caracteristica = "The Best Folk-Rock Band"
print("Mi banda favorita es: ", MyFavoriteBand+":", Caracteristica)

numero1 = "7"
numero2 = "8"
print(int(numero1)+int(numero2))

# Tipos Booleanos
miBooleano = 6 > 3
print(miBooleano)

if miBooleano:
    print("El resultado es Verdadero.")
else:
    print("El resultado es Negativo")

# Procesar datos de entrada del usuario
# Funcion input
resultado = input("Digite un numero: ") # Regresa un dato tipo string.
print(resultado)

# Conversion de la entrada de datos
numero1 = int(input("Escriba el primer número: "))
numero2 = int(input("Escriba el segundo número: "))
resultado = numero1 + numero2
print("El resultado de la suma es:", resultado)
"""
'''
OperandoA = 9
OperandoB = 4
suma = OperandoA + OperandoB
print(f'El resultado de la suma es: {suma}')

resta = OperandoA - OperandoB
print(f'El resultado de la resta es: {resta}')

multiplicacion = OperandoA * OperandoB
print(f'El resultado de la multiplicacion es: {multiplicacion}')

division = OperandoA / OperandoB
print(f'El resultado de la division es: {division}')
division = OperandoA // OperandoB
print(f'El resultado de la division(int) es: {division}')
modulo = OperandoA % OperandoB
print(f'El modulo o residuo de la division es: {modulo}')
exponente = OperandoA ** OperandoB
print(f'El resultado del exponente es: {exponente}')

alto = int(input("Proporciona el alto del rectangulo: "))
ancho = int(input("Proporciona el ancho del rectangulo: "))
area = alto * ancho
perimetro = (alto + ancho) * 2
print("Area: ", area)
print("Perimetro: ", perimetro)

miVariable3 = 10
print(miVariable3)

# Operadores de reasignacion

miVariable3 = miVariable3 + 1
print(miVariable3)

miVariable3 += 1
print(miVariable3)

miVariable3 -= 2
print(miVariable3)

miVariable3 *= 3
print(miVariable3)

miVariable3 //= 2
print(miVariable3)

# Operadores de comparacion

d = 4
b = 6
resultado = d == b # Comprobamos si son iguales
print(resultado)

# Operador diferente

resultado = d != b
print(resultado)

# Operador mayor que

resultado = d > b
print(resultado)

# Operador menor que

resultado = d < b
print(resultado)

# Operador menor o igual que

resultado = d <= b
print(resultado)

# Operador mayor o igual que

resultado = d >= b
print(resultado)
'''
"""
a = int(input("Digite un numero: "))
print("El residuo de la division entre 2 es:", a % 2)
if a % 2 == 0:
    print(f"{a} es un número PAR ")
else:
    print(f"{a} es un número IMPAR")

edadAdulto = 18
edadPersona = int(input("Digite su edad: "))
if edadPersona >= edadAdulto:
    print(f"Su edad es {edadPersona}, usted es mayor de edad.")
else:
    print(f"Su edad es {edadPersona}, usted es menor de edad.")
"""
'''
# Operadores lógicos

a = True
b = False
resultado = a and b
print(resultado)

# Operador or

resultado = a or b
print(resultado)

# Operador not

resultado = not a
print(resultado)

# Ejercicio valor dentro de un rango
valor = int(input("Digite un numero: "))
valorMinimo = 0
valorMaximo = 5
dentroRango = (valor >= valorMinimo and valor <= valorMaximo)
if dentroRango:
    print(f"El valor {valor} esta dentro del rango.")
else:
    print(f"El valor {valor} no esta dentro del rango.")

# Ejercicio con el operador or, operador not

vacaciones = False
diaDescanso = True
if not (vacaciones or diaDescanso):
    print(f'Tiene trabajo que hacer.')
else:
    print(f'Puede asistir al juego.')

# Ejercicio: Rango entre 20 y 30 años
edad = int(input("Digite su edad: "))
veinte = edad >= 20 and edad < 30
print(veinte)
treinta = edad >= 30 and edad < 40
print(treinta)

if veinte or treinta:
    if veinte:
        print("Estas dentro del rango de los 20's años")
    elif treinta:
        print("Estas dentro del rango de los 30's años")
else:
    print("No estas dentro del rango de los 20's a 30's años")


numero1 = int(input("Digite el valor para el primer numero: "))
numero2 = int(input("Digite el valor para el segundo numero: "))

if numero1 > numero2:
    print("El numero 1 es mayor")
else:
    if numero1 < numero2:
        print("El numero 2 es mayor")
    else:
        print("Los numeros son iguales")
'''
# Ejercicio tienda libros

print("Digite los siguientes datos del libro:")
nombre = input("Nombre del libro: ")
id = int(input(f"Digite el id del libro: "))
precio = float(input("Digite el precio del libro: "))
envioGratuito = input("Indique si el envio es gratuito ('True') o no ('False'): ")
if envioGratuito == 'True' or envioGratuito == 'true':
    envioGratuito = True
elif envioGratuito == 'False' or envioGratuito == 'false':
    envioGratuito = False
else:
    print('El valor es invalido. Debe indicar "True" o "False"')

print(f'''
    Nombre: {nombre}
    Id: {id}
    Precio: {precio}
    Envio Gratuito: {envioGratuito}
''')