//Ejercicio 1: Calcular estación del año
let mes = 6;
let estacion;
if(mes == 1 || mes == 2 || mes == 12){
    estacion = "Verano"
}
else if(mes == 3 || mes == 4 || mes == 5){
    estacion = "Otoño" 
}
else if(mes == 6 || mes == 7 || mes == 8){
    estacion = "Invierno"
}
else if(mes == 9 || mes == 10 || mes == 11){
    estacion = "Primavera" 
}
else{
    console.log("Error, no existe ese número de mes")
}
console.log("El número de mes corresponde a la estación: " + estacion)
//Ejercicio 2: Hora del día 
let hora = 18;
let mensaje;
if(hora >= 8 && hora <= 10){
    mensaje = "Me levanto, desayuno";
}
else if(hora >= 10 && hora<= 12){
    mensaje = "Almuerzo";
}
else if(hora >= 12 &&  hora <= 16){
    mensaje = "Realizo tareas y activades";
}
else if(hora >= 16 && hora <= 19){
    mensaje = "Ejercito y juego al fútbol";
}
else if(hora >= 19 &&  hora <= 22){
    mensaje = "Curso la tecnicatura";
}
else if(hora >= 22 && hora<= 24){
    mensaje = "Ceno";
}
else if(hora >= 2 && hora<= 8){
    mensaje = "Duermo";
}
else{
    mensaje = "Valor incorrecto";
}
console.log("En el horario " + hora + "hs: "+ mensaje)

// Estructura switch(la sintaxis es igual a la de java)
switch(mes){ //No solo se pueden utilizar números, también cadenas 
    case 1: case 2: case 12:
        estacion = "verano";
        break;
    case 3: case 4: case 5:
        estacion = "otoño";
        break;
    case 6: case 7: case 8:
        estacion = "invierno";
        break;
    case 9: case 10: case 11:
        estacion = "primavera";
        break;
    default:
        estacion = "Valor incorrecto";

}
console.log("Bienvenido a la estacion de: " + estacion)