/*
 *  Ejercicio 10: Pedir 10 números y escribir la suma
 *  total.
 *  Hacerlo con la clase Scanner y JOptionPane.
 */

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio10 {
    public static void main(String[] args) {
        int num, suma;
        suma = 0;
        // Con clase Scanner.
        /*Scanner entrada = new Scanner(System.in);
        for (int i = 1; i <= 10; i++){
            System.out.println(i+" - Digite un número: ");
            num = Integer.parseInt(entrada.nextLine());
            suma += num;
        }*/
        // Con JOptionPane
        for (int i = 1; i <= 10; i++){
            num = Integer.parseInt(JOptionPane.showInputDialog(i+" - Digite un número:"));
            suma += num;
        }
        System.out.println("La suma total es: " + suma);

    }
}
