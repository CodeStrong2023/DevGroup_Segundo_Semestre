# tipo set o conjunto

planetas = {"Marte", "Jupiter", "Venus"}
print(planetas)

print(len(planetas))

print("Marte" in planetas)
print("saturno" in planetas)

planetas.add("Tierra")
planetas.add("Saturno")
print(planetas)


planetas.remove("Saturno")
print(planetas)


planetas.discard("marte")
print(planetas)

planetas.clear()
print(planetas)

del planetas
print(planetas)





# diccionario

diccionario = { 
    "IDE" : "Integrated Development Environment",
    "POO" : "Programacion Orientada a Objetos",
    "SABD" : "Sistema de Administracion de Base de Base de Datos"
}

print(diccionario)


print(len(diccionario))


print(diccionario["IDE"])


print(diccionario.get("POO"))
print(diccionario.get("SABD"))


diccionario["IDE"] = " Entorno de Desarrollo Integrado"
print(diccionario)


for termino in diccionario:
    print(termino)

for termino, valor in diccionario.items():
    print(termino, valor)

for termino in diccionario.keys():
    print(termino)

for valor in diccionario.values():
    print(valor)

 
print("IDE" in diccionario)

diccionario["PK"] = "Primary key"
print(diccionario)

diccionario.pop("SABD")
print(diccionario)

diccionario.clear()
print(diccionario)

del diccionario
print(diccionario)





# repaso

nombres = ["Juan" , "Pablo" , "Jose" , "Quiles"]
print(nombres)

nombres.append("Gustavo")
nombres.append([1,2,3])
nombres.append(True)
nombres.append(10.45)
nombres.append([3,7,0])
nombres.append("No soy un nombre, solo soy un dato mas")

print(nombres)

lista1 = [1 , 2 , 3]
lista2 = [5 , 6 , 7]
lista3 = lista1 + lista2
print(lista3)

lista3.extend([9,1,11])
print(lista3)

print(lista3.index(6))

print(lista3.count(1))

lista3.reverse()
print(lista3)

lista = [3,4,5] * 2
print(lista3)

lista3.sort()
print(list)

lista3.sort(reverse=True)
print(lista3)

tupla = (4,"Hello World", 7.30, [2,3,9], "Bye Bye", 4)
print(tupla)

print(4 in  tupla)

