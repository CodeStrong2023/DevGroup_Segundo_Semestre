var nombre = "Jose";
var apellido =" Montes";
var nombreCompleto = nombre+" "+apellido;
console.log(nombreCompleto);
var nombreCompleto2 = "Ariel"+" "+"Betancud";
console.log(nombreCompleto2);
var juntos = nombre + 219; //Lee de izq a der siguiendo la cadena lee el numero como tipo str
console.log(juntos);
juntos = nombre + 78 + 17; //Aquí se puede diferenciar a traves de los paréntesis
console.log(juntos)
juntos = 78 + 17 + nombre;
console.log(juntos);

nombre += apellido; //Tercer concatenación usando el operador simplificado
console.log(nombre)

//Hoy ya no se usa var, se utiliza let y const
let nombre2 = "Pedro";
console.log(nombre2);

const apellido2 = "Lepes";
//apellido2 = "Perez" Una constante no puede ser modificada
console.log(apellido2)



                    //Ampliando el uso de var let y const
/*
    Con var puedes reasignar en cualquier momento, este forma parte del ambito global, 
    Un error es que se sobreescriba

*/
var nombre = "Ariel";
nombre = "Osvaldo";
console.log(nombre);

function saludar(){
    var nombre = "Natalia"
    console.log(nombre);
}
console.log(nombre); //Aquí no lee el dato en la función

if(true){
    var edad = 34;
    console.log(edad);
}
console.log(edad); //En la función funciono correctamente, en la estructura if falló

/*
let: esta puede ser reasignada en cualquier momento, la diferencia es que su ambito es el bloque,
solo dispone dentro de un bloque de llaves o dentro de una función
*/
function saludar2(){
    let nombre2 = "Ariel"
    console.log(nombre2);
}
//console.log(nombre2);

if(true){
    let edad2 = 33;
    console.log(edad2);
}
//console.log(edad2);
/*
const se utiliza para valores constantes que no pueden ser reasignadas  
*/
const fechaNacimiento = 2006;
console.log(fechaNacimiento);
fechaNacimiento = 2003;
console.log(fechaNacimiento); // Solo se ejecuta el console anterior




//Ejercicio: Denro de un rango
let dentroRango = 5; //Acá vamos a ir cambiando el valor
let valMin = 0, valMax = 10;
if(dentroRango >= valMin && dentroRango <= valMax){
    console.log("Esta dentro del rango establecido")
}
else{
    console.log("Esta fuera del rango establecido")
}