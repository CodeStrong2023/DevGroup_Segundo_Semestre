// Ejercicio 1. Calcular estacion del año:
let mes = 1; // ingresamos el numero nos
let estacion;

// pondresmos condicionales anidados..

if(mes == 1 || mes == 2 || mes == 12){
    estacion = "Estamos en verano";
}
else if( mes == 3 || mes == 4 || mes == 5){
    estacion = "Estamos en otoño"
}
else if(mes == 6 || mes == 7 || mes == 8){
    estacion = "Estamos en invierno"
}
else if(mes == 9 || mes == 10 || mes == 11){
    estacion = "Estamos en primavera"
}
else{
    estacion = "Estacion incorrecta"
}

console.log("Para el valor ingresado: " + estacion);


// Ejercicio num 2:

let hora = 3;
let mensaje;

// Dependiendo la hora del dia, es la act que estemos realizando
// Era otra alternativa a la propuesta por el prof, lo hice antes de escuchar jeje
if(hora >= 0 && hora <= 7){
    mensaje = "Estoy denscansando"
}
else if(hora >= 8 && hora <= 13){
    mensaje = "Estoy en jornada laboral"
}
else if(hora >= 14 && hora <= 15){
    mensaje = "Estoy de sobre mesa / lavando platos"
}
else if(hora >= 16 && hora <= 18){
    mensaje = "Me encuentro en el gym, generalmente.."
}
else if(hora >= 19 && hora <= 23){
    mensaje = "Me encuentro capacitandome y aprendiendo"
}
else{
    "Valor incorrecto, fuera de rango"
}

console.log("Para la hora ingresada, " + mensaje)

// Estructura switch, optimizamos el proceso

switch(mes){ // traemos la variable con el num
    case 1: case 2: case 12:
        estacion = "Verano";
        break;
    case 3: case 4: case 5:
        estacion = "Otoño";
        break;
    case 6: case 7: case 8:
        estacion = "Invierno";
        break;
    case 9: case 10: case 11:
        estacion = "Primavera";
        break;
    default:
        estacion = "Valor fuera de rango";
}
console.log("Bienvedidos a la estacion: " + estacion)