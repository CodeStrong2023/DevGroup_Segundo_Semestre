//Tipos de Datos en JavaScript
/*
La sintaxis para los comentarios es muy similar a Java
*/

var nombre ='Ariel'; //Tipo Str
console.log(typeof nombre);
nombre = 7;
console.log(typeof nombre);
nombre = 12.3;
console.log(typeof nombre)

var numero = 3000; //tipo numerico
console.log(numero); 

var objeto = { //creamos un objeto
    nombre :"Ariel",
    apellido : "Betancud",
    telefono : "261456775"
}
console.log(objeto);

//Tipo de dato boolean
var bandera = true;
console.log(typeof bandera);

// Tipo de dato funcion 
function miFuncion(){}
console.log(typeof miFuncion);

//Tipo de dato symbol

var simbolo = Symbol("Mi simbolo");
console.log(simbolo);

//Tipo de dato clase
class Persona{
    constructor(nombre,apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
console.log(typeof Persona);

//Tipo de dato undefined 
var x;
console.log(typeof x);

x = undefined;
console.log(typeof x);
// null: significa ausencia de valor
var y = null; //null no es un tipo de dato, pero su origen es de tipo object
console.log(typeof y);

//Tipo de dato array y Empty String
var autos = ['Citroen','Audi','Bmw','Ford'];
console.log(autos);
console.log(typeof autos); //preguntamos que tipo de datos es

var z = '';
console.log(z); //Esto se refiere a que es una cadena vacia:
console.log(typeof z);
