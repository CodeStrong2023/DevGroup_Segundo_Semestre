import random
# Adivinar el numero:

# Realizar un juego para adivinar el numero. Para ello se debe generar
# un numero aleat entre 1 - 100 y luego ir pidiendo numero indicando
# si es mayor o menor segun N. El proceso termina
# cuando el usuario acierta y se muestra la cantidad de intentos

aleatorio = random.randint(0,100) # toma de 0 a 100 aleatorio
cont = 0
print(" ... JUEGO: ADIVINA EL NÚMERO ...")
while True:
    numero = int(input("Escriba un numero: "))
    cont += 1
    if numero > aleatorio:
        print("\t No es el numero, ingrese un numero menor..")
    elif numero < aleatorio:
        print("\t No es el número, escriba uno mayor..")
    else: # Cuando adivina el num:
        print(f"El número ha sido acertado: {aleatorio}, ¡felicidades!")
        break # para el ciclo 
# Mostramos la cantidad de intentos:
print(f"La cantidad de intentos fue: {cont}")