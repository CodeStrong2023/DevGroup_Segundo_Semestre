let nombre = "Jose";
let apellido = "Montes";
let nombreCompleto = nombre + " " + apellido;
console.log(nombreCompleto);
let nombreCompleto2 = "Marcos" + " " + "Martos";
console.log(nombreCompleto2);
let juntos = nombre + 219;
console.log(juntos);
juntos = nombre + 20 + 23;
console.log(juntos);
juntos = 20 + 23 + nombre;
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
let z = x + y;
console.log(z);
