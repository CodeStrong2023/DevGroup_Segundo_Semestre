package repasoExtrafacultad;

import java.util.Scanner;

public class ejMenorMayor {
    public static void main(String[]args) {
        Scanner consol1 = new Scanner(System.in);

        System.out.println("Digite el primer número: ");
        int num1 = Integer.parseInt(consol1.nextLine());
        System.out.println("Digite el segundo número: ");
        int num2 = Integer.parseInt(consol1.nextLine());
        System.out.println("Digite el tercer número: ");
        int num3 = Integer.parseInt(consol1.nextLine());
    
        //Hacemos la estrcutra

        if (num1 < num2 && num1 < num3 ) {
        System.out.println("El número menor es: " + num1);
        }   
        else if (num2 > num1)

    }
}
