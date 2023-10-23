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