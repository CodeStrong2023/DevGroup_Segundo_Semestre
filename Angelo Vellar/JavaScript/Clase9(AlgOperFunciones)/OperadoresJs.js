//Ejercicio: Si el padre puede asistir al juego de su hijo
let vacaciones = false, diaDescanso = false;
if(vacaciones || diaDescanso) {
    console.log("El padre puede asistir al juego de su hijo")
}
else{
    console.log("El padre No puede asistir al juego de su hijo")

}

//Operador ternario
let resultado2 = 5 > 2 ? "Verdadero" : "Falso";
console.log(resultado2)
let numero = 16
resultado2 = numero % 2 == 0? "Es un número PAR" : "Es un número IMPAR"
console.log(resultado2)

//Convertir String a Number
let miNumero = "21" //Es una cadena
console.log(typeof miNumero);
let edad2 = Number(miNumero); //Esta es una FUNCIÓN
console.log(typeof edad2);

//Funcion isNaN
if(isNaN(edad2)){ //No es un número = is Not a Number(devuelve un resultado booleano)
    console.log("Esta variable no contiene solo numeros")
}
else{
    if(edad2 >= 18){
        console.log("Puede votar");
    }
    else{
        console.log("Muy joven para votar");
    }
}

//Operador ternario
let resultado3 = edad2 >= 18 ? "Puede votar" : "Muy joven para votar";
console.log(resultado3);

//Función isNan
