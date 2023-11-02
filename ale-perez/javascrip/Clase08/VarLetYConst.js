//Hoy ya no se usa var, se utiliza let y const
let nombre1 = "Pedro";
console.log(nombre);
let nombre2 = "Gabriel";
console.log(nombre2);

const apellido2 = "Gonzalez";
console.log(apellido2);
// apellido2 = "Peréz"; (Una constante no puede ser reutilizada)

//Ampliando el uso de var let y const
/*
con var puedes reasignar en cualquier momento este forma parte
del ambito global, Un error es que se sobreescriba
*/

var nombre = "Ariel";
nombre = "Osvaldo";
console.log(nombre);

function saludar(){
    var nombre3 = "Natalia";
    console.log(nombre3);
}
// console.log(nombre3); //Aquí no lee el dato en la función
if(true){
    var edad = 34;
    console.log(edad);
}
console.log(edad); //En la función funciona correctamente, en la estructura if fallo

/*
let: esta puede ser reasignada en cualquier momento la diferencia es
que su ambito de bloque, solo disponible dentro de un bloque de llaves
o dentro de una función
*/

function saludar2(){
    let nombre4 = "Ariel";
    console.log(nombre4);
}
//console.log(nombre4);

if(true){
    let edad2 = 33;
    console.log(edad2);
}
//console.log(edad2);

/*
const se utiliza para valores constantes que no pueden ser reasignados
*/
const fechaNacimiento = 2004;
console.log(fechaNacimiento);
//fechaNacimiento = 2004;
//console.log(fechaNacimiento)