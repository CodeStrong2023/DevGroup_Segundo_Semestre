/*
 * Ejercicio 3: Leer números hasta que se introduzca un cero. Para cada uno
 * indicar se es par o impar. Primero hacerlo con Scanner luego con JOptionPane. * 
 */

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio3 {
    public static void main(String[] args) {
        float numero;
        // con Class Scanner
        /* Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un número: ");
        numero = Float.parseFloat(entrada.nextLine());
        if (numero!=0){
            do {
                if(numero%2 == 0){
                    System.out.println("El número ingresado es par.");
                } else if(numero%2 != 0){
                    System.out.println("El número ingresado es impar.");
                }
                System.out.println("Digite otro número: ");
                numero = Float.parseFloat(entrada.nextLine());
            } while (numero!=0);
        } 
        if (numero == 0) {
            System.out.println("Ha ingresado el 0.");
            
        } */
        // Con JOptionPane
        numero = Float.parseFloat(JOptionPane.showInputDialog("Digite un número: "));
        if (numero!=0){
            do {
                if(numero%2==0){
                    System.out.println("El número ingresado es par.");
                } else if(numero%2!=0){
                    System.out.println("El número ingresado es impar.");
                } 
                numero = Float.parseFloat(JOptionPane.showInputDialog("Digite otro número: "));
                } while (numero!=0);
        }
        if (numero==0){
            System.out.println("Ha ingresado el 0.");
        }
    }
}
