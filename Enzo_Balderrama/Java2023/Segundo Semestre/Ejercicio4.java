/*
 * Ejercicio 4: Pedir números hasta que se teclee uno negativo, y mostrar
 * cuantos números se han introducido. Lo hacemos primero con clase Scanner,
 * luego con JOptionPane.
 */

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio4 {
    public static void main(String[] args) {
        float numero;
        int i = 0;
        // Con clase Scanner.
        /* Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un número: ");
        numero = Float.parseFloat(entrada.nextLine());
        if (numero>= 0) {
            do {
                i++;
                System.out.println("Digite otro número: ");
                numero = Float.parseFloat(entrada.nextLine());
            } while (numero>=0);
        }
        if (numero < 0){
            System.out.println("Ha ingresado un número negativo.");
        }
        System.out.println("Ha ingresado: "+ i + " números válidos."); */
        numero = Float.parseFloat(JOptionPane.showInputDialog("Digite un número: "));
        if (numero>= 0) {
            do {
                i++;
                numero = Float.parseFloat(JOptionPane.showInputDialog("Digite otro número: "));
            } while (numero>=0);
        }
        if (numero < 0){
            System.out.println("Ha ingresado un número negativo.");
        }
        System.out.println("Ha ingresado: "+ i + " números válidos.");
    }
}
