var nombre = 'Jose';
var apellido = ' Montes';
var nombreCompleto = nombre + ' ' +apellido; // Primera concatenacion 
console.log(nombreCompleto);
var nombreCompleto2 = 'Ariel' + ' ' + 'Betancud' ; // Segunda concatenacion
console.log(nombreCompleto2);
var juntos = nombre + 219; //Lee izquierda a derecha siguienda la cadena lee el numero como tipo Str
console.log(juntos);
juntos = nombre + (78+ 17); // Aqui se puede diferenciar a traves de parentesis
console.log(juntos);
juntos = 78 +17+ nombre;
console.log(juntos);

nombre += apellido ; // Tercera Concatenacion usando el operador simplificado
console.log(nombre);

//Hoy ya no se usa var, se utiliza let y const
let nombre2 = "Pedro";
console.log(nombre2);

const apellido2 = "Lepes";
//apeliido2 = "Peres"; una constante no puede ser modificada
console.log(apellido2);

let x, y; //Se puede crear varias variables dentro de una misma linea
x = 17, y = 21; // Se puede hacer asigancion de varios variables dentro de la misma
let z = x + y;  // Se asigna el valor de la operacion
console.log(z);

let _1num = 31; //No utilizar numeros para iniciar el nombre de la una variable
let $break = "rompe"; // no utilizar palabras reservadas para variables
console.log(_1num);
console.log($break);