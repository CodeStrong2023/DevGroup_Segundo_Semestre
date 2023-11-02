//Ejercicio para encontrar numeros pares e impares
let parImpar = 1;
if(parImpar %2 == 0){
    console.log("Es un numero Par")
    }
    else { 
        console.log("Es un numero Impar")
    }

    //Ejercicio: Es mayor de edad
    let edad = 18, adulto = 18;
    if(edad >= adulto) { 
        console.log ("Usted es una persona adulta")
    }
    else {
        console.log("Usted es una persona menor de edad")
    }

//Ejercico : Dentro de un rango 

let dentroRango = 10;
let valMin =0,valMax= 10;
if(dentroRango >=valMin && dentroRango <= valMax){
    console.log("Esta dentro del rango establecido")
}
else{
    console.log("Esta fuera del rango establecido")
}

//Ejercicio: Si el padre puede asistir al juego de su hijo 
let vacaciones = false, diaDescanso= false;
if (vacaciones || diaDescanso){
    console.log("El padre puede asistir al juego de su hijo")
}
else{
    console.log("El padre NO puede asistir al juego de su hijo")
}

//Operador ternario
let resultado2 = 3 > 2 ? "Verdadero" : "Falso"
console.log(resultado2)
let numero = 12;
resultado2 = numero % 2 == 0 ? "Es un numero PAR" : "Es un numero IMPAR";
console.log(resultado2)

//Convertir String a Numero
let miNumero ="21"; //Es una cadena
console.log(typeof miNumero)
let edad2 = Number(miNumero); //Esta es una funcion
console.log(typeof edad2);

//Funcion isNan
if(isNaN(edad2)){ //Significa "No es un numero = Is not a Number" y esto devuelve un booleano
    console.log("Esta variable no contiene solo numeros")
}
else{
    if(edad2 >=18){
        console.log("Puede votar");
    }
    else{
        console.log("Es muy joven para votar");
    }
}
//Operador Ternario
let resultado3 = edad2 >=18 ? "Puede votar" : "Es muy joven para votar";
console.log(resultado3);