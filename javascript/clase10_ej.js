//Ej 1: Estación del año

let mes = 4;
let estacion;
if (mes == 1 || mes == 2 || mes == 12) {
  estacion = "Verano";
} else if (mes == 3 || mes == 4 || mes == 5) {
  estacion = "Otoño";
} else if (mes == 6 || mes == 7 || mes == 8) {
  estacion = "Invierno";
} else if (mes == 9 || mes == 10 || mes == 11) {
  estacion = "Primavera";
} else {
  estacion = "Valor incorrecto";
}

console.log("value = " + estacion);

// SWITCH

switch (mes) {
  case 1:
  case 2:
  case 12:
    estacion = "Verano";
    break;
  case 3:
  case 4:
  case 5:
    estacion = "Otoño";
    break;
  case 6:
  case 7:
  case 8:
    estacion = "Invierno";
    break;
  case 9:
  case 10:
  case 11:
    estacion = "Primavera";
    break;
}

console.log(estacion);

//Ej 2: Hora
let horaDia = 9;
let mensaje;
if (horaDia >= 6 && horaDia <= 11) {
  mensaje = "Buen dia";
} else if (horaDia >= 12 && horaDia <= 16) {
  mensaje = "Buenos dias";
} else if (horaDia >= 17 && horaDia <= 19) {
  mensaje = "Buenas tardes";
} else if (horaDia >= 20 && horaDia <= 23) {
  mensaje = "Buenas noches";
} else {
  mensaje = "error!";
}

console.log(mensaje);