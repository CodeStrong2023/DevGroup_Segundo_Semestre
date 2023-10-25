// Ejercicio: Padre

let vacaciones = false,
  diaDescanso = false;
if (vacaciones || diaDescanso) {
  console.log("El padre puede asistir al juego de su hijo.");
} else {
  console.log("El padre NO puede asistir al juego de su hijo.");
}

// Operador Ternario

let resultado2 = 3 > 2 ? "Verdadero" : "Falso";
console.log(resultado2);
let numero = 9;
resultado2 = numero % 2 == 0 ? "Es un número PAR" : "Es un numero IMPAR";
console.log(resultado2);

// String -> Number

let miNumero = "15";
console.log(typeof miNumero);
let edad2 = Number(miNumero);
console.log(typeof edad2);

// Funciones isNaN

if (isNaN(edad2)) {
  console.log("La variable no contiene solo números");
} else {
  if (edad2 >= 18) {
    console.log("Puede votar");
  } else {
    console.log("NO puede votar");
  }
}

let resultado3 = edad2 >= 18 ? "Puede Votar" : "NO puede votar";
console.log(resultado3);
