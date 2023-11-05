/*
 * Ejercicio 7: Pedir números hasta que se introduzca uno negativo y calcular la media.
 */

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio7 {
    public static void main(String[] args) {
        int suma, media, numero, i; i = 0; suma = 0;
        // Con clase Scanner.
        /* Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un número: ");
        numero = Integer.parseInt(entrada.nextLine());
        if(numero>=0){
            do {
                suma += numero;
                i++;
                System.out.println("Digite otro número: ");
                numero = Integer.parseInt(entrada.nextLine());
            } while (numero>=0);
        }
        if (numero<0){
            System.out.println("Ha ingresado un número negativo.");
        }
        media = suma / i;
        System.out.println("La media es: " + media);*/
        // Con JOptionPane
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        if(numero>=0){
            do {
                suma += numero;
                i++;
                numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));
            } while (numero>=0);
        }
        if (numero<0){
            System.out.println("Ha ingresado un número negativo.");
        }
        media = suma / i;
        System.out.println("La media es: " + media);
    }
}
