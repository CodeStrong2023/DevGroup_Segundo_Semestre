# Eliminar duplicados de una lista
# Escriba un programa donde tenga una lista y a continuación
# elimine los elementos repetidos, por último, mostrar la lista.

lista = ["hola", "こんにちは", "hello", "hallo", "hola", "hello", "hallo"]
print(lista)
conjunto = set(lista)
lista = list(conjunto)

print(f"La nueva lista es: {lista}")
