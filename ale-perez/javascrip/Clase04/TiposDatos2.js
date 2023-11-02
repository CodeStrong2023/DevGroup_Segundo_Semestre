// Clase 4 Tipos de datos parte 2:
var nombre = "Gabriel"; 
console.log(typeof nombre);
var nombre = 7;
console.log(typeof nombre);
var nombre = 12.3;
console.log(typeof nombre);
var numero = 3000; 
console.log(numero);
var objeto = {
    nombre: "Gabriel",
    apellido: "Gonzalez",
    telefono: 262558067021
}
console.log(typeof objeto);

//Tipo de dato boolean
var bandera  = true;
console.log(typeof bandera);

//Tipo de dato de funcion 
function mifuncion(){};
console.log(typeof mifuncion);

//Tipo de dato symbol
let simbolo = Symbol("Mi simbolo");
console.log(typeof simbolo);

//Tipo de dato clase
class Persona{
    constructor(nombre,apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
console.log(typeof Persona);