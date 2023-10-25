#Ejercicio 1: Califica tu dia
print("EJERCICIO 1")
print("Como estuvo tu dia?")
dia = "10"
dia = str(dia)
print("Mi dia estuvo de: " + dia)
#Ejercicio 2: Informacion Libro (titulo,autor). (Acá Utilizo la "," para concatenar)
print("EJERCICIO 2")
titulo= "Buscando a Alaska"
autor= "John Green"
libro = titulo,autor
print("Proporciona el titulo: ",titulo)
print("Proporciona el autor:",autor)
print (titulo,"fue escritor por",autor,libro)
 
#A TENER EN CUENTA
"""Para concatenar podemos hacerlo de dos formas. Una de ellas es usando la "," y de esa manera automanticamente
python reconoce el tipo de dato,cadena,variable automaticamente. La otra forma es usando el signo "+", pero al usarlo
ya tenemos que tener en cuenta que si por ejemplo queremos unir una cadena "string" con un tipo de dato "int" o numerico
nos va saltar un error, por lo cual tendriamos que convertir esa variable de tipo "int" a una "str" y luego ejecutar.
"""