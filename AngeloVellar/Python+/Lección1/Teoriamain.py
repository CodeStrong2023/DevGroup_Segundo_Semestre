"""miVariable = 3
print(miVariable)
miVariable = "Hola a todos los alumnos de la tecnicatura"
print(miVariable)
miVariable = 3.5
print(miVariable)
x = 10
y = 2
z = x + y
r = 780
h = 564
o = r / h
print (r)
print(h)
print (o)
#Vemos la casilla de memoria donde se guarda el valor de las literales
print (id(x))
print (id(y))
print(id(z))
print (id(r))
print (id(h))
print (id(o))
#Las literales se escriben x736

miVariable = 3
print(miVariable)
miVariable = "Hola a todos los alumnos de la tecnicatura"
print(miVariable)
miVariable = 3.5
print(miVariable)
x = 10
y = 2
z = x + y
r = 780
h = 564
o = r / h
print (r)
print(h)
print (o)
#Vemos la casilla de memoria donde se guarda el valor de las literales
print (id(x))
print (id(y))
print(id(z))
print (id(r))
print (id(h))
print (id(o))
#Las literales se escriben x736

#Tipos int,float,string,bool
x = 10
print(x)
print(type(x))
x = 14.5
print(x)
print(type(x))
x = "Hola a todos"
print(x)
print(type(x))
x = True
print(x)
print(type(x))
x = False
print(x)
print(type(x))"""



                                #Manejo de cadenas (String)
"""miGrupoFavorito = "Los piojos"
print("Mi grupo favorito es: " + miGrupoFavorito) "De esta forma concatenamos"
"""
#A TENER EN CUENTA
"""Para concatenar podemos hacerlo de dos formas. Una de ellas es usando la "," y de esa manera automanticamente
python reconoce el tipo de dato,cadena,variable automaticamente. La otra forma es usando el signo "+", pero al usarlo
ya tenemos que tener en cuenta que si por ejemplo queremos unir una cadena "string" con un tipo de dato "int" o numerico
nos va saltar un error, por lo cual tendriamos que convertir esa variable de tipo "int" a una "str" y luego ejecutar."""
                                
                                #Tipos Boleanos
""" miBooleano = 5 < 6
print(miBooleano)
if miBooleano:
    print("El resultado es verdadero")
else miBooleano
    print("El resultado es falso") """
                                #OPERADORES ARITMETICOS
"""OperandoA = 8
OperandoB = 5
suma = OperandoA + OperandoB
#print("Resultado de la suma:", suma)
print(f"El resultado de la suma es: {suma}")
resta = OperandoA - OperandoB 
print(f"El resultado de la suma es: {resta}")
multiplicacion = OperandoA * OperandoB
print(f"El resultado de la suma es: {multiplicacion}")
division = OperandoA / OperandoB
print(f"El resultado de la division es: {division}")
division = OperandoA // OperandoB
print (f"El resultado de la division (int) es: {division}")
modulo = OperandoA % OperandoB
print(f"El resultado de la division o residuo (modulo) es: {modulo}")
exponente = OperandoA ** OperandoB
print(f"El resultado del exponente es: {exponente}")"""

                                #OPERADORES DE ASIGNACION Y COMPARACION
"Podemos ver las dos formas en las cuales podemos reasignar"

"""miVariable3 = 10
print(miVariable3)

#Operadores de reasignación
miVariable3 = miVariable3 + 5
print(miVariable3) 
miVariable3 += 1
print(miVariable3)

#miVariable3 = miVariable3 - 2
miVariable3 -= 2
print(miVariable3)

#miVaraible3 = miVariable3 * 3
miVariable3 *= 3
print(miVariable3)

# miVariable3 = miVariable3 / 2
miVariable3 /= 2
print(miVariable3)"""
                                    #OPERADORES DE COMPARACION 
"Los operadores de comparacion nos permite saber si dos valores son iguales o distintos"

"""d = 4
b = 4
resultado = d == b #Comprobamos si son iguales 
print (resultado)

#Operador diferente
resultado = d != b
print(resultado)

#Operador Mayor que
resultado = d > b
print(resultado)

#Operador menor que 
resultado d < b
print(resultado)

#Operador menor o igual que
resultado = d <= b
print(resultado)

#Operador mayor o igual que
resultado = d >= b
print(resultado) """

                                #Operadores lógicos Clase 5

""" a = True
b = True
resultado = a and b 
print(resultado)

#Operador or
resultado = a or b
print(resultado)

#Operador not
resultado = not a 
print(resultado)  """

#Ejercicio: Valor dentro de un rango
""" valor = int(input("Digite un número dentro del rango 0 al 30: "))
valorManimo = 0
valorMaximo = 30
dentroRango = valor >= valorManimo and valor <= valorMaximo
if dentroRango:
    print(f"El valor {valor} está dentro del rango")
else:
    print(f"El valor {valor} está fuera del rango") """
#Ejercicio Operador or
""" vacaciones = True
diadescanso = False
if vacaciones or diadescanso:
    print ("Puede asistir al juego")
else:
    print ("No puede asistir al juego")

#Ejercicio Operador not
vacaciones = True
diadescanso = False
if not (vacaciones or diadescanso):
    print ("Tiene trabajo que hacer")
else:
    print ("Puede asistir al juego") """

                                #Sentencias de Control Clase 6
#En esta clase veremos sentencia if/else
""" condicion = True
condicion = False
if condicion == False:
    print("Condición Verdadera")
elif condicion == False:
    print("Condición Falsa")
else:
    print("Condición sin Especificar") """
#Ejemplos

"""num = int(input("Digite un número en el rango del 1 al 3: "))
numTexto = ""
if num == 1:
    numTexto = "Numero uno"
elif num == 2:
    numTexto = "Numero dos"
elif num == 3:
    numTexto = "Numero tres"
else:
    numTexto = "Has ingresado un número fuera de rango"
print(f"El número ingresado es: {num} - {numTexto}") """


""" numero = int(input ("Digite un numero del 1 al 5: "))
numTex = ""
if numero == 1:
    numTex = "Numero uno" 
elif numero == 2:
    numTexV= "Numero dos"
elif numero == 3:
    numTex = "Numero tres"
elif numero == 4:
    numTex = "Numero cuatro"
elif numero == 5:
    numTex = "Numero cinco"
else:
    numTex = "Usted a ingresado un número fuera del rango"
print(f"El numero ingresado es {numero} - {numTex}")  """

                            #Clase 7 Ciclo While y for (Minetras o durante)
"""contador = 0
while contador <= 8: #CONDICION 
    print("Ejecutando el ciclo while " , contador)
    contador += 1
else:
    print("Fin del ciclo While")
#El ciclo se va ir ejecutando hasta cumplir la condicion de llegar a 8 """

#Imprimimos numeros del 0 al 5 con el ciclo While
""" maximo = 5
contador = 0
while contador <= maximo:
    print("Ejecutando ciclo while " , contador)
    contador += 1
else:
    print("Fin del ciclo while") 
    """
#Imprimimos numeros del 5 al 1 en forma descendente 
"""contador = 20
minimo = 1
while contador >= minimo:
    print("Ejecuntando ciclo While en forma descendente " ,contador)
    contador -= 1
else:
    print("Fin del ciclo While")
"""
#Ciclo for
"""cadena = "HelloWorld"
for letra in cadena:
    print(letra)
else:
    print("Fin del ciclo for")
    """
#Palabra reservada break (Rompe o termina nuestro codigo en un punto cuando se cumpla una condicion)
"""for letra in "Alemania":
    if letra == "a":
        print(f"Letra encontrada: {letra} ")
        break
else:
        print("Fin del ciclo for")
        """
#Palabra reservada continue
""" for i in range(6):
    if i % 2 == 0:
        print(f"valor: {i}")
        
for i in range(6):
    if i % 2 != 0:
        continue
    print(f"Valor: {i} ") 
    """
#Lista = Ariel, Liliana, Natalia, Osvaldo
nombres = ["False", "3", "HolaMundo", "A","3,14"]
print(nombres)
print(nombres[0])
print(nombres[1])
print(nombres[-1])
#Cuando ponemos 0:2 por ejemplo, nos va mostrar los elementos que se encuentren desde indice 0 hasta el 2 (no incluido), 
#por lo tanto sería el elemento 0 y 1.
print(nombres[0:2])
#En este ejemplo le indicamos que se ejecute desde el indice 1 en adelante (Desde 3 en el ejemplo que pusimos) 
print(nombres[1: ])
#Modificamos un valor
nombres[3] = "Liliana"
nombres[0] = "True"
print(nombres)
#Iterar una lista
for nombre in nombres:  #nombre es singula, la lista es plural
    print(nombre)
else:
    print("Se acabaron los elementos de la lista")