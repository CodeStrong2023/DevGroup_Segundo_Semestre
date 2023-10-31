package Lección1;

public class HolaMundo {
    public static void main(String[] args) {
        /*
        System.out.println("HolaMundoDesdeJava");

        int miVariable = 10;
        System.out.println(miVariable);
        miVariable = 5;
        System.out.println(miVariable);
        // Tipo String
        String miVariableCadena = "Bienvenidos";
        System.out.println(miVariableCadena);
        miVariableCadena = "Sigamos creciendo en programación";
        System.out.println(miVariableCadena);

        // Var - inferencia de tipos en Java

        var miVariableEntera2 = 10;
        var miVariableCadena2 = "Seguimos estudiando";
        System.out.println("miVariableEntera2 = " + miVariableEntera2);
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
        // soutv + tab
        // Reglas para definir una variable en Java
        // Se recomienda escritura CamelCashe

        var usuario = "Osvaldo";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);
        var universidad = "UTN";
        var termino = "Recibido";
        var union2 = termino + " " + universidad;
        System.out.println("union2 = " + union2);

        var a = 8;
        var b = 4;
        System.out.println(usuario + (a + b));
        // Ejercicio: Caracteres Especiales con Java
        var nombre = "Belen";
        System.out.println("Nueva linea: \n" + nombre); // Diagonal Inversa y letra n
        System.out.println("Tabulador:\t" + nombre); //Tabulador un espacio para centrar
        System.out.println("\t.:MENÚ:.");
        System.out.println("Retroseso:\b"+nombre); //Caracter de Retroseso
        
                    //Clase Scanner

        Scanner consola = new Scanner(System.in);
        System.out.println("Digite su nombre: ");
        var usuario2 = consola.nextLine();
        System.out.println("usuario2 = " + usuario2);
        System.out.println("Escriba el titulo: ");
        var titulo2 = consola.nextLine();
        System.out.println("Resultado: " + titulo2 + " " + usuario2);
       
        //"Vamos con otro ejemplo de clase scanner"
        Scanner scanner1 = new Scanner(System.in);
                //Escribe tu solucion acá
        System.out.println("Proporsiona el titulo");
        var titulo3 = scanner1.nextLine();
        System.out.println("Proporsiona el autor");
        var autor = scanner1.nextLine();
        System.out.println(titulo3 + " Fue escrito por " + autor); 
        */
                        //TIPOS PRIMITIVOS (CLASE 4)
        /*
         byte numEteroByte = (byte)127;
        System.out.println("numEnteroByte = " + numEteroByte );
        System.out.println("Valor minimo del Byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo del Byte:" + Byte.MAX_VALUE);

        short numEnteroShort = 32767;
        System.out.println("numEnteroShort = " + numEnteroShort );
        System.out.println("Valor minimo del Short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo del Short:" + Short.MAX_VALUE);
        
        int numEnteroint = 2147483647;
        System.out.println("numEnteroInt = " + numEnteroint );
        System.out.println("Valor minimo del Int: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo del Int:" + Integer.MAX_VALUE);
        
        long numEnteroLong = 9223372036854775807L; 
         //Se le agrega L porque java le asigna a los numeros enteros
        el tipo int (por lo cual se limita solo a "2147483647")

        System.out.println("numEnteroLong = " + numEnteroLong );
        System.out.println("Valor minimo del Long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo del Long:" + Long.MAX_VALUE); 

         float numFloat = 3.4028235E38F; //PONER F PORQUE JAVA LO TOMA SI NO COMO TIPO DOUBLE
        System.out.println("numFloat = " + numFloat);
        System.out.println("El valor minimo de float:" + Float.MIN_VALUE);
        System.out.println("El valor maximo de float: " + Float.MAX_VALUE);
        
        double numDouble = 1.7976931348623157E308D;
        System.out.println("numDouble = " + numDouble);
        System.out.println("El valor minimo de Double:" + Double.MIN_VALUE);
        System.out.println("El valor maximo de Double: " + Double.MAX_VALUE); */

                     //Inferencia de tipos con var y tipos primitivos
        /*var numEntero = 20; //Las Literales sin punto automaticamente son de tipo int
        System.out.println("numEntero = " + numEntero);
        var numFloat = 10.0F; //Automaticamente con el punto decimal se transforma en tipo double
        System.out.println("numFloat = " + numFloat);        
        var numDouble = 10.0;
        System.out.println("numDouble = " + numDouble); */ 
                       
                                //Tipo primitivos char (Sin entender)
        //char miVariableChar = "a"
        /* var miVariableChar = "a";
       System.out.println("miVariableChar = " + miVariableChar);
       char varCaracter = 36; //Valor decimal de juego de caracteres unicode "$"
       System.out.println("varCaracter = " + varCaracter); */
       
                             //Tipos primitivos boolenaos
       /* var varBool = false; 
        System.out.println("Varbool = " + varBool);
         if(varBool) {
            System.out.println("La bandera es verde");

         }
         else{
            System.out.println("La bandera es roja ");
         }
         //Algortimo: Es mayor de edad?
         var edad = 17; //Literal teenr presente la inferecia de tipos, en este caso (int)
         var adulto = edad >= 18; //Esta es una expresión booleana
         if (edad >= 18) {
            System.out.println("Eres mayor de edad");
         }
         else{
            System.out.println("Eres menor de edad");
         }
         */

                //Conversión de tipos primitivos
        
         /*var  edad = Integer.parseInt("20");  
         System.out.println("edad = " + (edad + 1 ));
         var valorPI = Double.parseDouble("3.1416");
         System.out.println("valorPI = " + valorPI);
         //Pedir un valor
         var scanner2 = new Scanner(System.in);
         System.out.println("Digite su edad:");
         edad = Integer.parseInt (scanner2.nextLine());
         System.out.println("edad = " + edad); */
            //Conversión de tipos primitivos parte 2
        
       /* var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto );

        var fraseChar = "programadores".charAt(12);
        System.out.println("fraseChar =" + fraseChar);

        System.out.println("Digite un caracter: ");
        var scanner3 = new Scanner (System.in); 
        fraseChar = scanner3.nextLine().charAt(0); 
        System.out.println("fraseChar = " + fraseChar); */
                  //OPERADORES DE ASIGNACIÓN
        
      /*   int num1 = 5, num2 = 4;
         var solucion = num1 + num2;
         System.out.println("Solucion suma = " + solucion);

         solucion = num1 - num2;
         System.out.println("Solucion de la resta = " + solucion);

         solucion = num1 / num2;
         System.out.println("Solucion de la división = " + solucion);

         var solucion2 = 3.4 / num2;
         System.out.println("Resultado de la división = " + solucion2);
         
         solucion = num1 % num2; //Guarda el residuo entero de3 la división
         System.out.println("Solución = " + solucion); // 5/4

         if(num1 % 2 == 0)
            System.out.println("Es un número Par");
         else
            System.out.println("Es un número Impar");    */

        /* int varNum1 = 1, varNum2 = 4;
         var varNum3 = varNum1 + 6 - varNum2; //Una operación 
         System.out.println("varNum3 = " + varNum3);

         varNum1 += 1; // es lo mismo que "varNum1 = varNum1 + 1;
         System.out.println("varNum1 = " + varNum1);
         //Ejercicio:
      // -=   *=   /=   %=
         
         varNum2 -= 2;
         System.out.println("varNum2 = " + varNum2);
         varNum1 *= 5;
         System.out.println("varNum1 = " + varNum1);
         varNum3 /= 4;
         System.out.println("varNum3 = " + varNum3);
         varNum1 %= 6;
         System.out.println("varNum1 = " + varNum1); */
         /* 
                  //Operadores Unarios: Cambio de Signo Clase 8
         var varA = 7;
         var varB = -varA;
         System.out.println("varA = " + varA);
         System.out.println("varB = " + varB);//El resultado será un numero negativo

         //Operador de Negación
         var varC = true; //Esta literal por default en java es de tipo boolean
         var varD = !varC;//Aquí está inviertiendo el valor
         System.out.println("varC = " + varC);
         System.out.println("VarD = " + varD);
         //Operadores Unarios de Incremento: Preincremento
         var varE = 9; //Se va a modificar su valor
         var varF = ++varE; //Simbolo antes de la variable
         //Primero se incrementa la variable y después se usa su valor
         System.out.println("varE = " + varE); //Se incremente en la unidad
         System.out.println("varF = " + varF); //Va sumar uno

         //Postincremento (el simbolo va después de la variable)
         var varG = 3;
         var varH = varG++; //Primero el valor de la variablem luego el incremento
         System.out.println("varG = " + varG);
         System.out.println("varH = " + varH);
         //Operadores Unarios de decremento: Predecremento
         var varI = 4;
         var varJ = --varI;
         System.out.println("varI = " + varI); //La variable ya está con decremento
         System.out.println("varJ = " + varJ );
         
         //Postdecremento
         var varK = 8;
         var varL = varK--; //Primero el valor de la variable, luego queda el decremento 
         System.out.println("varK = " + varK); //Aquí va a decrementar en 1
         System.out.println("varL = " + varL);
         
         //Operadores de igualdad y relacionales 
         var aNum = 5;
         var bNum = 4;
         var cNum = (aNum == bNum); //aNum es igual a bNum? (Se interpretaria así)
         System.out.println("cNum = " + cNum);

         var dNum = aNum != bNum; //aNum es diferente a bNum? (Se interpretaria así)
         System.out.println("dNum = " + dNum);
         //comparacion de cadenas
         var cadenaA = "Hello";
         var cadenaB = "bye bye";
         var cVar = cadenaA == cadenaB;
         System.out.println("cVar = " + cVar);
         
         var fVar = cadenaA.equals(cadenaB);
         System.out.println("fVar = " + fVar);
         //Operadores relacionales, nos van a indicar si un valor es igual o menor o igual o mayor a otro
         var gVar = aNum >= bNum; // Se pueden utilizar > >= < <= == !=
         System.out.println("gVar = " + gVar);

         if (bNum % 2 == 0) { 
            System.out.println("El numero es Par");
         }
         else {
            System.out.println("El numero es impar"); 
         }
         var edad = 21;
         var adulto = 18;
         if (edad >= adulto) {
            System.out.println("Es mayor de edad");
         }
         else {
            System.out.println("Es menor de edad");
         } */

         //Operadores condicional and
         var valorA = 7;
         var valorMinimo = 0; //rango del 0 al 10
         var valorMaximo = 10;
         var respuesta = valorA >= 0 && valorA <= 10;
         if(respuesta){
            System.out.println("Está dentro del rango establecido");
         }
         else { 
            System.out.println("Esta fuera del rango establecido");
         }
         //Operador condicional tipo or
         var vacaciones = false;
         var diaLibre = false;
         if ( vacaciones || diaLibre ) {
            System.out.println("Papá puede asistir al juego de su hijo");
         }
         else {
            System.out.println("Papá no puede asistir al juego de su hijo");
         }
         //Operador ternario 
         var resultadoT = (5 > 4) ? "Verdadero" : "Falso";
         System.out.println("resultadoT = " + resultadoT);

         var numeroT = 7;
         resultadoT = (numeroT % 2 == 0) ? "Es par" : "Es impar";
         System.out.println("resultadoT = " + resultadoT);

         var x = 5;
         var y = 10;
         var z = ++x + y--;
         System.out.println("x = " + x); // 6
         System.out.println("y = " + y); // 9
         System.out.println("z = " + z); // 16

         var solucionAritmetica = 4 + 5 * 6 / 3; // 4 + ((5 * 6) / 3) = 30 / 3
         System.out.println("solucionAritmetica = " + solucionAritmetica);

         solucionAritmetica = (4 + 5) * 6 / 3; // 4 + 5 = 9 * 6 = 54 / 3 = 18
         System.out.println("solucionAritmetica = " + solucionAritmetica);

    }    

}  
