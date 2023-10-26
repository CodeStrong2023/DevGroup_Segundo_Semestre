



/*
Ampliando el uso de Var, let y const

con var puedes reasignar en cualquier momento este forma parte del ambito global
Un error es que se sobreecriba
*/

var nombre = "Ariel";
nombre = "Osvaldo";
console.log(nombre);

function saludar(){
    var nombre = "Natalia"
    console.log(nombre);
}
console.log(nombre) // Aqui no lee el dato en la funcion

if (true){
    var edad = 34;
    console.log(edad);
    }
console.log(edad) //En la funcion funciono correctamente, en la estructura if fallo

/*
let: esta puede ser reasignada en cualquier momento, la diferencia es que su ambito es de bloque,
solo disponible dentro de un bloque de llaves o de una funcion
*/

function saludar2(){
    let nombre2 = "Ariel"
    console.log(nombre2);
}
//console.log(nombre2) 

if (true){
    let edad2 = 33;
    console.log(edad2);
}
//console.log(edad2);

/*
const se utiliza para valores constantes que no se pueden ser reasignados
*/
const fechaNacimiento = 2006;
console.log(fechaNacimiento);
///fechaNacimiento = 2003;
//console.log(fechaNacimiento); //solo se ejecuta el console anterior