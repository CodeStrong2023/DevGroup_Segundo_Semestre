# Llenar una lista con numero del 1 al 50, luego mostrar
# la lista con el ciclo for, los elementos deben verse asi: 1-2-3..-50

lista = []
i = 1
while i <= 50:
    lista.append(i)
    i += 1 # va sumando 1 al iterador
    # para que sea mas eficaz: hacemos lista = list(range(1,51))
for i in lista:
    print(i,end= " - ") # va dejando un - entre num
