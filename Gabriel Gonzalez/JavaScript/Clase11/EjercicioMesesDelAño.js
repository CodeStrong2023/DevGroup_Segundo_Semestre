//Hacer un ejercicio similar al que esta hecho, pero ahora con los
//meses del año, debes hacerlo con la estructura swhitch y luego con
//la función en la opción mejorada
let mes = 12;
switch (mes) {
    case 1:
        console.log("Enero")
        break; 
    case 2:
        console.log("Febrero")
        break;  
    case 3:
        console.log("Marzo")
        break;  
    case 4:
        console.log("Abril")
        break;  
    case 5:
        console.log("Mayo")
        break;  
    case 6:
        console.log("Junio")
        break;  
    case 7:
        console.log("Julio")
        break;  
    case 8:
        console.log("Agosto")
        break;  
    case 9:
        console.log("Septiembre")
        break;  
    case 10:
        console.log("Octubre")
        break;  
    case 11:
        console.log("Noviembre")
        break;
    case 12:
        console.log("Diciembre")
        break;  

    default:
        console.log("Error ingreso de mes incorrecto")
        break;
}

//Version mejorada
let mes2 = ["Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"]
function getmes(n) {
    if(n < 1 || n > 12){
        throw new Error('out of range');
    }
    return mes2[n-1];  
}
console.log(getmes(6));