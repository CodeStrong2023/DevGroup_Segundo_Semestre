                //EJERCICIO NÚMERO MAYOR Y MENOR

package repasoExtrafacultad;

import java.util.Scanner;

public class EjNumMayorMenor { 
    public static void main(String [] args) {
        //En esta parte pedimos que el usuario ingrese un número
        Scanner consola1 = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        var num1 = Integer.parseInt(consola1.nextLine());

        System.out.println("Ingrese el segundo número: ");
        var num2 = Integer.parseInt(consola1.nextLine());

        System.out.println("Ingrese el tercer número: ");
        var num3 = Integer.parseInt(consola1.nextLine());
       
        //Funciones
        calcularNumeroMayor(num1,num2,num3);
        calcularNumeroMenor(num1,num2,num3);
    }

        //Creamos una función donde se calcula el numero mayor
        private static void calcularNumeroMayor(Integer num1, Integer num2, Integer num3) {
            var numMayor = Math.max(num1, Math.max(num2, num3));
            System.out.println("El número mayor es: " + numMayor);
        }
        
       /**
        * Creamos una función donde se calcula el número menor
        * @param num1 Es el primer número
        * @param num2 Es el segundo número
        * @param num3 Es el tercer número
        */
       private static void calcularNumeroMenor(Integer num1, Integer num2, Integer num3) {
        
        var numMenor = num1;
        if (num2 < numMenor) {
             numMenor = num2;
        }
        if (num3 < numMenor) {
            numMenor = num3;
        }
        System.out.println("El número menor es: " + numMenor);
      }


    }

