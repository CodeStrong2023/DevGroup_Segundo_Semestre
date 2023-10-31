#Ejercicio 6: Llenar una lista
#Llenar una lista con los números del 1 al 50, luego mostra 
#La lista con el bucle for, los elementos deben mostrarse 
#de la siguiente forma:
# 1-2-3-4-5....-50
Lista = []
i = 1
while i <= 50:
    Lista.append(i)
    i += 1
for i in Lista:
    print(i,end="/")
