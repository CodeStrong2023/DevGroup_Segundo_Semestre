/*
Ejercicios 3:Leeer numeros hasta que se  introduzca un cero 
para cada uno indicar si es par o impar.
primero lo haremos con la clase Scaneer
*/
package siclos03;

import java.util.Scanner;

public class ciclos03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Digite un numero");
        numero = Integer.parseInt(entrada.nextLine());
        while (numero != 0){
           if(numero % 2 == 0){
               System.out.println("El numero ingresado"+numero+"es PAR");
               
           }
           else{
               System.out.println("El numero ingresado"+numero+"es IMPAR");
               
           }
            System.out.println("Digite otro numero");
            numero = Integer.parseInt(entrada.nextLine());
        }
     
        System.out.println("El numero ingresado"+numero+"finaliza el programa");
    }
    
}