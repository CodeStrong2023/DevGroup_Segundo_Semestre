# Pilas (lista). Se trabaja con el ult numero y se va agreegando
pila = [1,2,3]
print(pila)

pila.append(4)
pila.append(5)
print(pila)

#quita el ultimo elemento y lo guarda en otra var 
elementoBorrado = pila.pop()
print(f"Elemento borrado = {elementoBorrado}") 

#sacar elementos por el final. Saca y retorna
print(f"La pila quedó asi: {pila}")
