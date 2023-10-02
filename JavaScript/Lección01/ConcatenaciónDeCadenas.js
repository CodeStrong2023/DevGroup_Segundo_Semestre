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