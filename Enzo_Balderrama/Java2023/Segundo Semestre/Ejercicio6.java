/*
 * Ejercicio 6: Pedir números hasta que se ingrese un 0, 
 * mostrar la suma de todos los números introducidos.
 */

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio6 {
    public static void main(String[] args) {
        int numero, suma; suma = 0;
        /* Con clase scanner.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor ingrese un número: ");
        numero = Integer.parseInt(entrada.nextLine());
        if (numero!=0){
            do {
                suma += numero;
                System.out.println("Ingrese otro número: ");
                numero = Integer.parseInt(entrada.nextLine());
            } while (numero!=0);
        }
        if (numero==0){
            System.out.println("Ha ingresado un 0. La suma de los números ingresados es: " + suma);
        } */
        // Con JOptionPane.
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        if (numero!=0){
            do {
                suma += numero;
                numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número: "));
            } while (numero!=0);
        }
        if (numero==0){
            System.out.println("Ha ingresado un 0. La suma de los números ingresados es: " + suma);
        }
    }
}
