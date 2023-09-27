var nombre = "Esteban";
var apellido = " Pollito";
var nombreComp = nombre + " " + apellido;
console.log(nombreComp); // primera concatenacion

var nombreComp2 = "Matias" + " " + " Ikaczijk"; // segunda concatenacion
console.log(nombreComp2);

var juntos = nombre + 219;
console.log(juntos);

juntos = nombre + 78 + 17;
console.log(juntos);

juntos = 78 + 17 + nombre;
console.log(juntos); // de esta manera, concatena pero primero suma los numeros

// CONCATENACION PARTE 2:
nombre += apellido; // usando el operador simplificado
console.log(nombre);
