// Pedir un número y mostrar los antecesores.

import java.util.Scanner;

public class clase5_ej8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba un número: ");
        int numero = Integer.parseInt(entrada.nextLine());
        int i = 1;

        while(i <= numero){ // mientras sea menor al numero ingresado, va mostrando
            System.out.println(i);
            i++;
        }
        entrada.close();
    }
}
