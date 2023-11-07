// No repetir el código

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

let mes = 5;

switch (mes) {
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
    console.log("Ingresaste un número de mes inexistente");
    break;
}

// Ahora mejorado

let mes2 = [
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

function getMes(n) {
  if (n < 1 || n > 7) {
    throw new Error("out of range");
  }
  return mes2[n - 1];
}

console.log(getMes(5));
