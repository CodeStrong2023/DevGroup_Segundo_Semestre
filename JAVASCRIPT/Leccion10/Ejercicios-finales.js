//Estacion del año
let mes=4;
let estacion;

if(mes== 1 || mes == 2 || mes == 12){
    estacion="verano";
}else if( mes == 3 || mes == 4 || mes == 5){
    estacion="otoño"
}else if( mes == 6 || mes == 7 || mes == 8){
    estacion="invierno"
}else if( mes == 9 || mes == 10 || mes == 11){
    estacion="primavera"
}else{
    estacion="valor incorrecto"
}
console.log("la estacion es "+estacion)

// Hora del dia

let horaDia = 22;
let mensaje;
if(horaDia >=6 && horaDia <=11){
    mensaje= "Good morning";
}
else if(horaDia >=12 && horaDia <=16){
    mensaje= "Good afternoon";
}
else if(horaDia >=17 && horaDia <=19){
    mensaje= "Good evening";
}
else if(horaDia >=20 && horaDia <=23){
    mensaje= "Good night";
}
else{
    mensaje= "Valor Incorrecto";
}
console.log(mensaje)

//estructura switch

//Estructura switch(la sintaxis es igual a Java)
switch(mes){
    case 1: case 2: case 12:
    estacion="Verano";
    break;
    case 3: case 4: case 5:
    estacion="Otoño";
    break;
    case 6: case 7: case 8:
    estacion="Invierno";
    break;
    case 9: case 10: case 11:
    estacion="Primavera";
    break;
    default:
        estacion  = "Valor incorrecto";
}
console.log("Bienvenido a la estacion de: "+estacion);

//

var nombre = "Ariel";
nombre = "Osvaldo";
console.log(nombre);

function saludar(){
    var nombre = "Natalia"
    console.log(nombre);
}
console.log(nombre) 

if (true){
    var edad = 34;
    console.log(edad);
    }
console.log(edad)

//

function saludar2(){
    let nombre2 = "Ariel"
    console.log(nombre2);
}


if (true){
    let edad2 = 33;
    console.log(edad2);
}



const fechaNacimiento = 2006;
console.log(fechaNacimiento);