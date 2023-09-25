# Mostrar una frase sin espacios y contar su longitud
# Se debe devolver la misma frase pero sin espacios en blanco, ademas
# un contador de cuantos caract tiene la frase( sin contar los espacios blancos)

# Ejemplo:     frase  = vivir por siempre en paz
# frase final = vivirporsiempreenpaz
# num caract = 20 

frase = input(" Escriba una fraase: ")
frase2 = " "
for i in frase:
    if i != " ":
        frase2 += i
frase = frase2
print(f"\n Frase final: {frase}")
print(f"N° Caracteres: {len(frase)} ")