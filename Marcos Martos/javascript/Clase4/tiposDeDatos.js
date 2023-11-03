// Clase 4: Tipos de datos parte 2

// Variables dinamicas

nombre = "Marcos";
console.log(typeof nombre);
nombre = 7;
console.log(typeof nombre);
nombre = 7.3;
console.log(typeof nombre);

var objeto = {
  nombre: "Marcos",
  apellido: "Martos",
  dni: 45361265,
};

console.log(typeof objeto);

// Tipos de datos booleanos True or False

let bandera = true;
console.log(bandera);
console.log(typeof bandera);

// Tipo de dato function

function miFuncion() {
  console.log("Soy una función :)");
}
miFuncion();
console.log(typeof miFuncion);

// Tipo de dato Symbol

let simbolo = Symbol("Soy un simbolo");
console.log(typeof simbolo);

// Tipo de dato Clase

class Persona {
  constructor(nombre, apellido) {
    this.nombre = nombre;
    this.apellido = apellido;
  }
}

let personaNueva = new Persona("Marcos", "Martos");
console.log(personaNueva);

console.log(Persona);
