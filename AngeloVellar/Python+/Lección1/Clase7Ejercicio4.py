#Ejercicio 4: Etapas de Vida
#Haremos un programa que cuando el usuario ingrese su edad le diga, o imprima
#la etapa de su vida en una breve oración
# 0 al 10 = La infancia es increible y  bella
# 10 al 19 = Tienes muchos cambios, mucho que estudiar 
# 20 a 29 = Amor y comienza el trabajo 
# 30 a 39 = Vida ya adulta con trabajo y familia
#40 a 49 = Estableciendo metas y consolidando carreras
#50 a 59 = Enfoque en el crecimiento personal y profesional
#60 a 69 = Disfrutando de la jubilación y aprovechando el tiempo libre
#70 a 79 = Reflexionando sobre la vida y disfrutando de la familia y amigos
#80 a 89 = Sabiduría y experiencia, compartiendo conocimientos
#90 a 99 = Celebrando una larga y plena vida

edad = int(input("Ingrese su edad para ver en que etapa de la vida se encuentra: "))
etapa = None
if 0 <= edad <= 10:
    etapa = "- 0 al 10 - La infancia es increible y  bella"
elif 10 < edad <= 19:
    etapa = "- 10 al 19 - Tienes muchos cambios, mucho que estudiar"
elif 20 <= edad <= 29:
    etapa = "-20 a 29 - Amor y comienza el trabajo "
elif 30 <= edad <= 39:
    etapa = "-30 a 39 - Vida ya adulta con trabajo y familia"
elif 40 <= edad <= 49:
    etapa = "-40 a 49 - Estableciendo metas y consolidando carreras"
elif 50 <= edad <= 59:
    etapa = "-50 a 59 - Enfoque en el crecimiento personal y profesional"
elif 60 <= edad <= 69:
    etapa = "- 60 a 69 - Disfrutando de la jubilación y aprovechando el tiempo libre"
elif 70 <= edad <= 79:
    etapa = "-70 a 79 - Reflexionando sobre la vida y disfrutando de la familia y amigos"
elif 80 <= edad <= 89:
    etapa = "-80 a 89 - Sabiduría y experiencia, compartiendo conocimientos"
elif 90 <= edad <= 99:
    etapa = "-90 a 99 - Celebrando una larga y plena vida"
else:
    etapa = (input("El dato ingresado no corresponde"))
print(f"Usted tiene {edad} años, la etapa de los {etapa}")