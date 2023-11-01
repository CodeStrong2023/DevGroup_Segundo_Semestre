// Las variables son dinamicas..
var nombre = "Matias";
console.log(typeof nombre);

nombre = 7;
console.log(typeof nombre)

// tipo numerico 
var num = 3000;
console.log(num);

// tipo object
var objeto = {
    // dentro de la asignacion, ponemos el nombre
    nombre : "Matias",
    apellido : "Ikaczijk",
    tel : "262587111"
}
console.log(objeto);

// ----- 4.4 Definir un tipo clase

// Tipo de dato boolean(bandera)
var bandera = true;
console.log(bandera);

// funcion--> permiten realizar tareas, se reutilizan lineas de codigo
function mifuntion(){}
console.log(typeof mifuntion)

// dato symbol
var simbolo = Symbol("Mi simbolo: ")
console.log(simbolo)

// Clases: 
class persona{
    // nos premite crear un obj
    constructor(nombre,apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
console.log(typeof persona);

//Tipo de dato undefined
var x;
console.log(x);

//null: significa ausencia de un valor
var y = null; // null no es un tipo de dato pero su origen es de type object
console.log(y);

// Tipo de dato array y Empty String
var autos = ["Citroen", "Chevrolet", "BMW", "Ford"];
console.log(autos);
console.log(typeof autos); // Preguntamos que tipo de dato es..

var z = " ";
console.log(z); // cadena vacia 
