// Ejercicio 1: Calcular estación del año.
let mes = 2;
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

console.log("El valor corresponde a la estación de: " + estacion);
// Estructura Switch

switch (mes) {
    case 1: case 2: case 12:
      estacion = "Verano";
      break;
    case 3:
    case 4:
    case 5:
      estacion = "Otoño";
      break;
    case 6: case 7: case 8:
      estacion = "Invierno";
      break;
    case 9: case 10: case 11:
      estacion = "Primavera";
      break;
  }
  
  console.log(estacion);

// Ejercicio 2: Hora del día.

let horaDia = 9;
let mensaje;
if (horaDia >= 6 && horaDia <= 11) {
  mensaje = "Good morning";
} else if (horaDia >= 12 && horaDia <= 16) {
  mensaje = "Good afternoon";
} else if (horaDia >= 17 && horaDia <= 19) {
  mensaje = "Good evening";
} else if (horaDia >= 20 && horaDia <= 23) {
  mensaje = "Good night";
} else {
  mensaje = "Valor incorrecto";
}

console.log(mensaje);

/* Evitar repetir tu código
   Try don't repeat yourself
*/
let days = "Viernes";

switch (days) {
  case "Lunes":
    console.log("Hoy es " + days);
    break;
  case "Martes":
    console.log("Hoy es " + days);
    break;
  case "Miercoles":
    console.log("Hoy es " + days);
    break;
  case "Jueves":
    console.log("Hoy es " + days);
    break;
  case "Viernes":
    console.log("Hoy es " + days);
    break;
  case "Sabado":
    console.log("Hoy es " + days);
    break;
  case "Domingo":
    console.log("Hoy es " + days);
    break;

  default:
    console.log("Error en el ingreso del día de la semana");
    break;
}

let days2 = [
  "Lunes",
  "Martes",
  "Miercoles",
  "Jueves",
  "Viernes",
  "Sabado",
  "Domingo",
];

function getDays(n) {
  if (n < 1 || n > 7) {
    throw new Error("out of range");
  }
  return days2[n - 1];
}

console.log(getDays(5));

// Hacer ejericio de los meses del año

// Primero con switch

let month = 5;

switch (month) {
  case 1:
    console.log("Este mes es Enero");
    break;
  case 2:
    console.log("Este mes es Febrero");
    break;
  case 3:
    console.log("Este mes es Marzo");
    break;
  case 4:
    console.log("Este mes es Abril");
    break;
  case 5:
    console.log("Este mes es Mayo");
    break;
  case 6:
    console.log("Este mes es Junio");
    break;
  case 7:
    console.log("Este mes es Julio");
    break;
  case 8:
    console.log("Este mes es Agosto");
    break;
  case 9:
    console.log("Este mes es Septiembre");
    break;
  case 10:
    console.log("Este mes es Octubre");
    break;
  case 11:
    console.log("Este mes es Noviembre");
    break;
  case 12:
    console.log("Este mes es Diciembre");
    break;

  default:
    console.log("Número de mes inexistente");
    break;
}

// Ahora mejorado

let month2 = [
  "Enero",
  "Febrero",
  "Marzo",
  "Abril",
  "Mayo",
  "Junio",
  "Julio",
  "Agosto",
  "Septiembre",
  "Octubre",
  "Noviembre",
  "Diciembre",
];

function getMonth(n) {
  if (n < 1 || n > 7) {
    throw new Error("out of range");
  }
  return month2[n - 1];
}

console.log(getMonth(5));