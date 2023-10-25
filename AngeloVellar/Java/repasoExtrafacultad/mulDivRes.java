package repasoExtrafacultad;
//Leer 2 numeros, si son iguales que los *, si el primero es mayor
// que el segundo que los - y si no que los +

import java.util.Scanner;

public class mulDivRes {
     public static void main(String [] args) {
        Scanner consol1 = new Scanner(System.in);
        System.out.println("Digite el primer número: ");
        int num1 = Integer.parseInt(consol1.nextLine());
        System.out.println("Digite el segundo número: ");
        int num2 = Integer.parseInt(consol1.nextLine());

        if (num1 == num2) {
            System.out.println("El resultado es: " + (num1 * num2));
        }
        else if (num1 > num2) {
            System.out.println("El resultado es: " + (num1 - num2));
        }
        else {
            System.out.println("El resultado es: " + (num1 + num2));
        }
      
    }
}
