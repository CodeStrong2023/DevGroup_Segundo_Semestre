# Ejercicio 9: Mostrar una frase sin espacios y contar su longitud.
#
# Hacer un programa donde el usuario ingrese una frase, se le devolverá la misma frase
# pero sin espacios en blanco, y además un contador de cuántos caracteres tiene la frase.
# (sin contar espacios en blanco)
# Ejemplo:          Frase = Vivir por siempre en paz
#                   Frasefinal = Vivirporsiempreenpaz
#                   N° de caracteres = 20
frase = input("Por favor ingrese una frase: ")
frase2 = ""
for i in frase:
    if (i != " "):
        frase2 += i
print(f'Frasefinal = {frase2}')
print(f'N° de caracteres = {len(frase2)}')