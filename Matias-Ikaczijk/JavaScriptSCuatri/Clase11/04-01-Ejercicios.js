/*
const se utiliza para valores constantes que no pueden reasignarse
*/
const fechaNac = 2001;
console.log(fechaNac);

// fechaNac = 2005. Claramente nos da error
// console.log(fechaNac)

// Para evitar repetir un codigo: 

let days = "Lunes";

// let days = ["Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"];
switch(days){ // lea el dato ingresado
    case "Lunes":
        console.log("Hoy es: " + days);
        break;
    case "Martes":
        console.log("Hoy es: " + days);
        break;
    case "Miercoles":
        console.log("Hoy es: " + days);
        break;
    case "Jueves":
        console.log("Hoy es: " + days);
        break;
    case "Viernes":
        console.log("Hoy es: " + days);
        break;
    case "Sabado":
        console.log("Hoy es: " + days);
        break;
    case "Domingo":
        console.log("Hoy es: " + days)
    default:
        break;
}
// Version mejorada

let days2 = ["Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"];
function getDay(n){ // necesita parametro
    if(n <1 || n > 7){
        throw new Error("out of range");
    }
    return days2[n-1]; // retorna lo guardado
}
console.log(getDay(5)); // llamamos y muestra el dia

// Ej meses del año 

// Hacer un ej similar al anterior pero ahora con los meses del año,
// debemos hacerlo con la estructura switch y luego la opc mejorada

let month = 11;
switch(month){
    case 1:
        console.log("Estamos en Enero");
        break;
    case 2:
        console.log("Estamos en Febrero, el mejor(? ");
        break;
    case 3:
        console.log("Estamos en Marzo");
        break;
    case 4:
        console.log("Estamos en Abril");
        break;
    case 5:
        console.log("Estamos en Mayo");
        break;
    case 6:
        console.log("Estamos en Junio");
        break;
    case 7:
        console.log("Estamos en Julio")
    
    case 8:
        console.log("Estamos en Agosto");
        break;
    case 9:
        console.log("Estamos en Septiembre")
    
    case 10:
        console.log("Estamos en Octubre")
    
    case 11:
        console.log("Estamos en Noviembre");
        break;
    case 12:
        console.log("Estamos en Diciembre")
    default:
        console.log("El mes ingresado es incorrecto")
        break;
}

// VERSION PRO

let mes = ["Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"]
function getmes(n){
    if(n <1 || n > 12){
        throw new Error("out of range");
    }
    return mes[n-1]; // retorna lo guardado
}
console.log(getmes(7));