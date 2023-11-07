#Ejercicio: Rango entre las edades 20 y 30 años
# 1. Preguntar la edad al usuario
# 2. Si la edad esta dentro de los 20 o 30 años, está dentro del rango
# 3. Combinamos los operadores and y or para saber si el usuario está dentro del rango o no

Edad = int(input("Digite la edad que tiene actualmente: "))

""" Rango1 = Edad >= 20 and Edad <= 30
Rango2 = Edad >= 30 and Edad < 40
if Rango1 or Rango2:
    print("La edad está dentro del rango de los 20 a 30 años")
else:
    print("La edad está fuera del rango del los 20 a 30 años") """

#Segunda manera de resolverlo simplificada
if (20 <= Edad < 30) or ( 30 <= Edad < 40):
    print("Su edad está dentro del rango de los 20 y 30 años")
else:
    print("Su edad no está dentro del rango de los 20 y 30 años")

#Ejercico: El mayor de dos números
#Solicitar al usuario dos valores, determinar cual es mayor
# 1. Solicitar al usuario dos valores
    #numero1 (int)
    #numero2 (int)
# 2. Se debe imprimir el mayor de los dos números
     #(La salida debe ser identica a la siguiente):
     #Digite el valor para el numnero1:
     #Digite el valor para el numero2:
     #El número mayor es: <numeroMayor>

numero1=int(input("Digite un número: "))
numero2=int(input("Digite otro número: "))
if numero1 > numero2 :
    print("El numero 1 es mayor:")
else:
    print("El numero 2 es menor:")