import java.util.Scanner;

import javax.print.attribute.SupportedValuesAttribute;
import javax.swing.text.html.parser.Element;

public class HolaMundo {
    public static void main(String[] args) {
        /*
         * System.out.println("Hola Mundo desde Java");
         * int miVariable = 15;
         * System.out.println(miVariable);
         * miVariable = 5;
         * System.out.println(miVariable);
         * // String
         * String miVariableStr = "Bienvenidos";
         * System.out.println(miVariableStr);
         * miVariableStr = "Sigamos creciendo en programación";
         * System.out.println(miVariableStr);
         * 
         * var miVariableEntera2 = 15;
         * var miVariableStr2 = "Seguimos Estudiando";
         * System.out.println("mivariableEntera2 = " + miVariableEntera2);
         * System.out.println("mivariableStr2 = " + miVariableStr2);
         * 
         * var usuario = "Enzo";
         * var titulo = "Técnico";
         * var union = titulo + " " + usuario;
         * System.out.println("union = " + union);
         * 
         * var a = 13;
         * var b = 12;
         * System.out.println(usuario + (a + b));
         * 
         * var nombre = "Ariel";
         * System.out.println("\nnueva línea: \n" + nombre);
         * System.out.println("Tabulador: \t" + nombre);
         * System.out.println("\t\t *Menú*");
         * System.out.println("Retroseso: \b\b" + nombre);
         * System.out.println("Comillas simples: \'"+ nombre+"\'");
         * System.out.println("Comillas dobles: \""+ nombre+"\"");
         * 
         * // CLASE SCANNER
         * Scanner entrada = new Scanner(System.in);
         * System.out.println("Digite su nombre: ");
         * var usuario2 = entrada.nextLine();
         * System.out.println("usuario2: " + usuario2);
         * System.out.println("Escriba el título: ");
         * var titulo2 = entrada.nextLine();
         * System.out.println("Resultado: " + titulo2 + " " + usuario2);
         * 
         * byte numEnteroByte = 127;
         * System.out.println("numEnteroByte = " + numEnteroByte);
         * System.out.println("Valor minimo de un byte: " + Byte.MIN_VALUE);
         * System.out.println("Valor máximo de un byte: " + Byte.MAX_VALUE);
         * 
         * short numEnteroShort = 32767;
         * System.out.println("numEnteroShort = " + numEnteroShort);
         * System.out.println("Valor minimo de un short: " + Short.MIN_VALUE);
         * System.out.println("Valor máximo de un short: " + Short.MAX_VALUE);
         * 
         * int numEnteroInt = 2147483647;
         * System.out.println("numEnteroInt = " + numEnteroInt);
         * System.out.println("Valor minimo de un int: " + Integer.MIN_VALUE);
         * System.out.println("Valor máximo de un int: " + Integer.MAX_VALUE);
         * 
         * long numEnteroLong = 9223372036854775807L;
         * System.out.println("numeroEnteroLong = " + numEnteroLong);
         * System.out.println("Valor minimo de un long: " + Long.MIN_VALUE);
         * System.out.println("Valor máximo de un long: " + Long.MAX_VALUE);
         * 
         * float numFloat = 3.4028235E38F;
         * System.out.println("numFloat = " + numFloat);
         * System.out.println("Valor minimo de float: " + Float.MIN_VALUE);
         * System.out.println("Valor maximo de float: " + Float.MAX_VALUE);
         * 
         * double numDouble = 10.0D;
         * System.out.println("numDouble = " + numDouble);
         * System.out.println("Valor minimo de double: " + Double.MIN_VALUE);
         * System.out.println("Valor maximo de double: " + Double.MAX_VALUE);
         * 
         * // Inferencia de tipos var y tipos primitivos
         * 
         * var numEntero = 20; // Las literales sin punto automaticamente son de tipo
         * int.
         * System.out.println("numEntero = " + numEntero);
         * 
         * var numFloat = 20.0F;
         * System.out.println("numFloat = " + numFloat); // automaticamente se
         * transforma en double.
         * 
         * var numDouble = 20.0;
         * System.out.println("numDouble = " + numDouble);
         * 
         * // Tipos primitivos char
         * 
         * char miVariableChar = 'a';
         * System.out.println("miVariableChar = " + miVariableChar);
         * 
         * char varCaracter = '\u0024';
         * System.out.println("varCaracter = " + varCaracter);
         * char varCaracterDecimal = 36;
         * System.out.println("varCaracterDecimal = " + varCaracterDecimal);
         * char varCaracterSimbolo = '$';
         * System.out.println("varCaracterSimbolo = " + varCaracterSimbolo);
         * 
         * var varCaracter1 = '\u0024';
         * System.out.println("varCaracter1 = " + varCaracter1);
         * var varCaracterDecimal1 = 36; // lo toma como valor int.
         * System.out.println("varCaracterDecimal1 = " + varCaracterDecimal1);
         * var varCaracterSimbolo1 = '$';
         * System.out.println("varCaracterSimbolo1 = " + varCaracterSimbolo1);
         * 
         * int varEnteroChar = '$';
         * System.out.println("varEnteroChar = " + varEnteroChar);
         * int caracterChar = 'b';
         * System.out.println("caracterChar = " + caracterChar);
         * 
         * // Tipos primitivos booleanos
         * 
         * boolean varBool = true;
         * System.out.println("varBool = " + varBool);
         * 
         * if (varBool){
         * System.out.println("La bandera es verde.");
         * }
         * else {
         * System.out.println("La bandera es roja.");
         * }
         * 
         * // Algoritmo: ¿es mayor de edad?
         * var edad = 18; // literal para tener presente la inferencia de tipos.
         * // var adulto = edad >= 18; // esta es una expresión booleana.
         * if (edad >= 18){
         * System.out.println("Eres mayor de edad.");
         * }
         * else {
         * System.out.println("Eres menor de edad.");
         * }
         * 
         * // Conversión de tipos primitivos.
         * var edad = Integer.parseInt("20");
         * System.out.println("edad = " + (edad + 1));
         * var valorPI = Double.parseDouble("3.1416");
         * System.out.println("valorPI = " + valorPI);
         * 
         * // Pedir valor.
         * var entrada = new Scanner(System.in);
         * //System.out.println("Digite su edad:");
         * //edad = Integer.parseInt(entrada.nextLine());
         * //qSystem.out.println("edad: " + edad);
         * 
         * var edadTexto = String.valueOf(10);
         * System.out.println("edadTexto = " + edadTexto);
         * 
         * var fraseChar = "programadores".charAt(3);
         * System.out.println("fraseChar = " + fraseChar);
         * 
         * System.out.println("Digite un caracter: ");
         * fraseChar = entrada.nextLine().charAt(0);
         * System.out.println("fraseChar = " + fraseChar);
         * 
         * int num1 = 5, num2 = 4;
         * var solucion = num1 + num2;
         * System.out.println("solucion de la suma = " + solucion);
         * 
         * solucion = num1 - num2;
         * System.out.println("solucion de la resta = " + solucion);
         * 
         * solucion = num1 * num2;
         * System.out.println("solucion de la multiplicación = " + solucion);
         * 
         * solucion = num1 / num2;
         * System.out.println("solucion de la división = " + solucion);
         * 
         * var solucion2 = 3.4 / num2;
         * System.out.println("solucion2 de la división = " + solucion2);
         * 
         * solucion = num1 % num2;
         * System.out.println("solucion = " + solucion);
         * 
         * if (num2 % 2 == 0)
         * System.out.println("El número es par.");
         * else
         * System.out.println("El número es impar.");
         * 
         * int varNum1 = 1, varNum2 = 4;
         * int varNum3 = varNum1 + 6 - varNum2;
         * System.out.println("varNum3 = " + varNum3);
         * 
         * varNum1 += 1;
         * System.out.println("varNum1 = " + varNum1);
         * 
         * varNum2 -= 2;
         * System.out.println("varNum2 = " + varNum2);
         * 
         * varNum1 *= 5;
         * System.out.println("varNum1 = " + varNum1);
         * 
         * varNum3 /= 4;
         * System.out.println("varNum3 = " + varNum3);
         * 
         * varNum1 %= 6;
         * System.out.println("varNum1 = " + varNum1);
         * 
         * // Operadores unarios: Cambio de signo
         * var varA = 7;
         * var varB = -varA;
         * System.out.println("varA = " + varA);
         * System.out.println("varB = " + varB);
         * 
         * // Operador de negación
         * var varC = true;
         * var varD = !varC; // Invierte el valor.
         * System.out.println("varC = " + varC);
         * System.out.println("varD = " + varD);
         * 
         * // Operadores unarios de incremento: Preincremento
         * 
         * var varE = 9;
         * var varF = ++varE;
         * System.out.println("varE = " + varE);
         * System.out.println("varF = " + varF);
         * 
         * // Postincremento
         * var varG = 3;
         * var varH = varG++;
         * System.out.println("varG = " + varG);
         * System.out.println("varH = " + varH);
         * 
         * // Predecremento
         * var varI = 4;
         * var varJ = --varI;
         * System.out.println("varI = " + varI);
         * System.out.println("varJ = " + varJ);
         * 
         * // Postdecremento
         * var varK = 8;
         * var varL = varK--;
         * System.out.println("varK = " + varK);
         * System.out.println("varL = " + varL);
         * 
         * 
         * // Operaciones de igualdad y relaciones.
         * var aNum = 5;
         * var bNum = 4;
         * var cNum = (aNum == bNum);
         * System.out.println("cNum = " + cNum);
         * 
         * var dNum = aNum != bNum;
         * System.out.println("dNum = " + dNum);
         * 
         * var cadenaA = "Hola";
         * var cadenaB = "Hola";
         * var cVar = cadenaA == cadenaB;
         * System.out.println("cVar = " + cVar);
         * var dVar = cadenaA.equals(cadenaB);
         * System.out.println("dVar = " + dVar);
         * 
         * var eVar = aNum >= bNum;
         * System.out.println("eVar = " + eVar);
         * 
         * if (bNum % 2 == 0) {
         * System.out.println("El número es par.");
         * } else {
         * System.out.println("El número es impar.");
         * }
         * 
         * var edad = 30;
         * if (edad >= 18){
         * System.out.println("Eres mayor de edad.");
         * } else {
         * System.out.println("Eres menor de edad.");
         * }
         
        var valorA = 7;
        var valorMin = 0;
        var valorMax = 10;
        var respuesta = valorA >= valorMin && valorA <= valorMax;
        if (respuesta) {
            System.out.println("Está dentro del rango establecido.");
        } else {
            System.out.println("No está dentro del rango establecido.");
        }

        var vacaciones = false;
        var diaLibre = false;

        if (vacaciones || diaLibre) {
            System.out.println("El padre puede asistir al juego de su hijo.");
        } else {
            System.out.println("El padre no puede asistir al juego de su hijo.");
        }

        // Operador ternario

        var variableT = (5 > 4) ? "Verdadero" : "Falso";
        System.out.println("variableT = " + variableT);

        var numeroT = 7;
        var resultadoT = (numeroT % 2 == 0) ? "El numero es par." : "El número es impar.";
        System.out.println("numeroT = "+ resultadoT); 

        var x = 5;
        var y = 10;
        var z = ++x + y--;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        var solAritmetica = 4 + 5 * 6 / 3; 
        System.out.println("solAritmetica = " + solAritmetica);

        solAritmetica = (4 + 5) * 6 / 3; 
        System.out.println("solAritmetica = " + solAritmetica);*/

    }
}
