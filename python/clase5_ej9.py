# Ejercicio 9: Mostrar una frase sin espacions y mostrar su longitud

frase1 = input("Ingrese una frase: ")
frase2 = " "
for i in frase1:
    if i != " ":
        frase2 += i

frase1 = frase2
print(f"Frase: {frase1}")
print(f"N° de caracteres: {len(frase1)}")

