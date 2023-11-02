//Ejercicio 2: Hora del dia

//Ejercicio 2: Hora del día 
let hora = 7;
let mensaje;
if(hora >= 6 && hora <= 11){
    mensaje = "¡Good Morning!";
}
else if(hora >= 12 && hora<= 16){
    mensaje = "¡Good afternoom!";
}
else if(hora >= 17 &&  hora <= 19){
    mensaje = "¡Good evening!";
}
else if(hora >= 20 && hora <= 23){
    mensaje = "¡Good Night!";
}
else{
    mensaje = "Valor incorrecto";
}
console.log("Son las: " + hora + "hs --- "+ mensaje + " --- ")

