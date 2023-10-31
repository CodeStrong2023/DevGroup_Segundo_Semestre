#Leer 10 numeros e imprimir cuantos son posiivos
#Cuantos negativos y cuantos neutros.

num = int(input("Digite 10 números: "))
numPositivos = 0
numNegativos = 0
numNeutro = 0

for num in range(10):
   if num >= 1:
      print (f"Numeros positivos{num+1}: ") 
   elif num < 1:
      print (f"Numero negativo{num+1}: ")
    