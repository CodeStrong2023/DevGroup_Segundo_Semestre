// OPERADOR OR
// Ejercicio puede ir o no al partido de futbol

let vacaciones = false, diaDescanso = false; // creamos var y damos el valor
if(vacaciones || diaDescanso){
    console.log("El padre puede asistir al juego de su hijo")
}
else{
    console.log("El padre no podrá asistir al juego")
}

// 9.2 Operador ternario: Ejercicio Par Impar

let resultado = 3 > 2 ? "Verdadero" : "Falso";
console.log(resultado)
let numero = 12;
resultado = numero % 2 == 0 ? "Es un numero par" : "Es un numero impar";
console.log(resultado)

// Convertir String a Number
let miNum = "19";
console.log(typeof miNum);
let edad = Number(miNum); // funcion de convercion 
console.log(typeof edad);

//Funcion isNan --> verificar el valor de una variable numerica 

if(isNaN(edad)){
    console.log("La var no contiene solo números")
}
else{
    if(edad >= 18){
        console.log("Usted puede votar");
    }
    else{
        console.log("Aún no puede ejercer el voto")
    }
}
