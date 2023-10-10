// 8.1 Ejercicio: dentro de un rango: Operador and
// operador and -> && Doble aspersan

let dentroDeRango = -10;
let valMinimo = 0, valMax = 10;

if(dentroDeRango >= valMinimo && dentroDeRango <= valMax){
    console.log("El numero está dentro del rango")
}
else{
    console.log("El número ingresado está fuera del rango")
}

// 8.3

let nombre = "Pepe";
console.log(nombre);
const apellido = "Lopez";
// apellido = "Perez"; una costante no se puede modificar
console.log(apellido);

// 8.4 Aclaración con var, let y const

// con var -> se puede reasignar en cualquier momento
var nombre2 = "Estefan";
nombre2 = "Jesus";
console.log(nombre2)

function saludar(){
    var nombre2 = "Nazarena";
    console.log(nombre2);
}
console.log(nombre2); // no lee el dato en la funcion

if(true){
    var edad = 32;
    console.log(edad);
}
console.log(edad);

/* Let: puede ser reasignada en cualquier momento, la diferencia
 es que su ambito es de bloque, solo disponible dentro de un bloque de
 llaves o dentro de una funcion
*/

function saludar2(){
    let nombre3 = "Osvaldo";
    console.log(nombre3);
}
// console.log(nombre3); // no lee el dato en la funcion

if(true){
    let edad3 = 82;
    console.log(edad3);
}
console.log(edad3); // en la estructura if falla la var

// const se usa para valores que no pueden ser reasignados
const fechaNac = 2006;
console.log(fechaNac);
// fechaNac = 2001;
// console.log(fechaNac);