// Estructura switch (Sintaxis igual a Java)
let mes = 4
let estacion;
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
console.log("Bienvenido a la estación de: " + estacion)