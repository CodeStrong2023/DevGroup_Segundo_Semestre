// Ejercicio para encontrar numeros pares

let parImpar = 10;
if (parImpar % 2 === 0) {
  console.log("Es un numero PAR");
} else {
  console.log("Es un numero IMPAR");
}

// Ejercicio: Es mayor o menor de edad

let edad = 18,
  adulto = 18;
if (edad >= adulto) {
  console.log("Usted es una persona adulta.");
} else {
  console.log("Usted es una persona menor de edad.");
}

// Ejercicio: Dentro de un rango
let dentroRango = 5; // Aquí vamos a ir cambiando el valor
let valMin = 0, valMax = 10;

if (dentroRango >= valMin && dentroRango <= valMax) {
  console.log("Está dentro del rango establecido");
} else {
  console.log("Está fuera del rango establecido");
}

// Ejercicio: Si el padre puede asistir al juego de su hijo

let vacaciones = false,
  diaDescanso = false;
if (vacaciones || diaDescanso) {
  console.log("El padre puede asistir al juego de su hijo.");
} else {
  console.log("El padre NO puede asistir al juego de su hijo.");
}

// Operador ternario

let resultado2 = 3 > 2 ? "Verdadero" : "Falso";
console.log(resultado2);
let numero = 9;
resultado2 = numero % 2 == 0 ? "Es un número PAR" : "Es un numero IMPAR";
console.log(resultado2);

// Convertir String a Number

let miNumero = "25"; // Es una cadena
console.log(typeof miNumero);
let edad2 = Number(miNumero); // Esta es una funcion
console.log(typeof edad2);

// Funcions isNaN

if (isNaN(edad2)) {
  // no es un número, is not a number, retorna un booleano
  console.log("La variable no contiene solo números");
} else {
  if (edad2 >= 18) {
    console.log("Puede votar");
  } else {
    console.log("Muy joven para votar");
  }
}

let resultado3 = edad2 >= 18 ? "Puede Votar" : "Muy joven para votar";
console.log(resultado3);