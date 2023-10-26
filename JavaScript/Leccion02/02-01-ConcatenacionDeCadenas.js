var nombre = "Jose";
var apellido = "Montes";
var nombreCompleto = nombre + " " + apellido;
console.log(nombreCompleto);
var nombreCompleto2 = "Enzo" + " " + "Balderrama";
console.log(nombreCompleto2);
var juntos = nombre + 219;
console.log(juntos);
juntos = nombre + 78 + 17;
console.log(juntos);
juntos = 78 + 17 + nombre;
console.log(juntos);
nombre += apellido;
console.log(nombre);

// Ya no usamos var, usamos let y const
let nombre2 = "Pedro";
console.log(nombre2);

const apellido2 = "Lopez";
console.log(apellido2);

let x, y; // Se pueden crear varias variables dentro de una misma linea
(x = 17), (y = 21); // Se puede asignar las variables dentro de la misma linea
let z = x + y; // Se asigna el valor de la operación.
console.log(z);