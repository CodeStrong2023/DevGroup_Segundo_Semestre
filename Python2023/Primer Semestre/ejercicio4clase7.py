'''
Ejercicio4: Etapas de la vida
Haremos un programa que cuando el usuario ingrese su edad le diga, o imprima la etapa
de su vida en una breve oración:

0 - 10: La infancia es increible y bella
10 - 19: Tienes muchos cambios y mucho que estudiar
20 - 29: Amor y comienza el trabajo
30 - 39: Crece y amplia tus fronteras
40 - 49: Continua tu crecimiento y disfruta
50 - 59: La vida es bella, disfruta cada momento
60 - 69: No dejes de amar y compartir con tus seres queridos
70 - 79: Sonríe y agradece cada nuevo día
'''
edad = int(input('Digite su edad: '))

if edad >= 0 and edad <= 10:
    print('La infancia es increible y bella.')
elif edad >= 10 and edad <= 19:
    print('Tienes muchos cambios y mucho que estudiar.')
elif edad >= 20 and edad <= 29:
    print('Amor y comienza el trabajo.')
elif edad >= 30 and edad <= 39:
    print('Crece y amplia tus fronteras.')
elif edad >= 40 and edad <= 49:
    print('Continua tu crecimiento y disfruta.')
elif edad >= 50 and edad <= 59:
    print('La vida es bella, disfruta cada momento.')
else:
    print('Edad fuera de rango.')