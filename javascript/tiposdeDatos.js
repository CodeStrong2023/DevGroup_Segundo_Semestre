var nombre = "Juan"; //Tipo string
console.log(nombre);

var numero = 3000; //Tipo numerico
console.log(numero);

var objeto = {
  nombre: "Juan",
  apellido: "Quiles",
  telefono: 123456789,
}; //Tipo objeto

console.log(objeto);

// Variables dinamicas

nombre = "Juan Pablo";
console.log(typeof nombre);
nombre = 7;
console.log(typeof nombre);
nombre = 7.3;
console.log(typeof nombre);

var objeto = {
  nombre: "Juan",
  apellido: "Quiles",
  dni: 44123321,
};

console.log(typeof objeto);

// Tipos de datos booleanos True or False

let bandera = true;
console.log(bandera);
console.log(typeof bandera);

// Tipo de dato function

function miFuncion() {
  console.log("funcion");
}
miFuncion();
console.log(typeof miFuncion);

// Tipo de dato Symbol

let simbolo = Symbol("simbolo");
console.log(typeof simbolo);

// Tipo de dato Clase

class Persona {
  constructor(nombre, apellido) {
    this.nombre = nombre;
    this.apellido = apellido;
  }
}

let personaNueva = new Persona("Juan", "Quiles");
console.log(personaNueva);

console.log(Persona);

// Tipo de dato Undefined
var x;
console.log(x);
console.log(typeof x);

// null: ausencia de valor
var y = null; //null no es un tipo de dato, pero es de tipo object
console.log(y);
console.log(typeof y);

// Tipo de dato array y Empty string
var autos = ["Citroen", "BW", "Fiat", "Ford", "Audi"];
console.log(autos);
console.log(typeof autos);

var z = "";
console.log(z);
console.log(typeof z);

autos.forEach((auto) => {
  console.log(auto);
});

