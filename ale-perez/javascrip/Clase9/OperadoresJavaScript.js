//Ejercicio para encontrar números pares
let parImpar = 11;
if(parImpar % 2 == 0){
    console.log("Es un número PAR")
}
else{
    console.log("Es un número IMPAR")
}

//Ejercicio es mayor de edad
let Edad = 19, mayorDeEdad = 18;
if(Edad >= mayorDeEdad){
    console.log("Es mayor de edad")
}
else{
    console.log("Es menor de edad")
}

//Ejercicio dentro de un rango
let dentroRango = 10;
let valMinima = 0, valMaxima = 10;
if(dentroRango >= valMinima && dentroRango <= valMaxima){
    console.log("Esta dentro del rango establecido");
}
else{
    console.log("Esta fuera de rango del rango establecido");
}

//Ejercicio si el padre puede asistir al juego de su hijo
let vacaciones = true;
let diaDescanso = false;
if(vacaciones || diaDescanso){
    console.log("Puede asistir al juego");
}
else{
    console.log("No puede asistir al juego");
}

//Operador ternario
let resultado = 10 > 2 ? 'Verdadero' : 'Falso';
console.log(resultado);
let numero = 0;
let resultado2 = numero % 2 == 0 ? 'Número PAR' : `Número IMPAR`;
console.log(resultado2);

//Convertir String a Number 
let miNumero = "19"; //Es una cadena
console.log(typeof miNumero);
let edad2 = Number(miNumero);
console.log(typeof edad2)
//Función isNan
if(isNaN(edad2)){ //No es un número = is not a Number(devuelve un resultado booleano)
    console.log("Esta variable no contiene solo números"); 
}
else{
    if(edad2 >= 18){
        console.log("Puede votar");
    }
    else{
        console.log("No puede votar");
    }
}

//Operador ternario con el ejercicio String a Number
let resultado3 = edad2 >= 18 ? 'Puede votar' : 'No puede votar'
console.log(resultado3)
