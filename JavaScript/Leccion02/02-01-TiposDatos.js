// Tipos de datos en JavaScript
var nombre = "Enzo"; // Tipo String
console.log(nombre);
var numero = 3000; // Tipo Numérico
console.log(numero);
var objeto = { // Tipo Objeto
    nombre : "Enzo",
    apellido : "Balderrama",
    celular : "2625460406"
}
console.log(objeto);

// Tipo de dato booleano
var bandera = true;
console.log(bandera);

// Tipo de dato funcion
function miFuncion(){}
console.log(typeof miFuncion);

// Tipo de dato symbol
var simbolo = Symbol("Mi simbolo");
console.log(simbolo);

// Tipo de dato clase
class Persona{
    constructor(nombre, apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
console.log(Persona);

// Tipo de dato undefined
var x;
console.log(x);
var x = undefined;
console.log(typeof x);

// null: significa ausencia de un valor.
var y = null; // null no es un tipo de dato pero su origen que es de tipo object.
console.log(typeof y);

// Tipo de dato array y empty string.
var autos = ["Citröen", " Audi", "BWM", "Ford"];
console.log(autos);

var z = '';
console.log(z);
console.log(typeof z);