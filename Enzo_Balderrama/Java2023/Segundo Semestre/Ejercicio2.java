/*
 * Ejercicio 2: Leer un número e indicar si es positivo o negativo.
 * El proceso se repetirá hasta que se ingrese el 0.
 */

// import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio2 {
    public static void main(String[] args) {
        float numero;
        // con Class Scanner
        /* Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un número: ");
        numero = Float.parseFloat(entrada.nextLine());
        if (numero!=0){
            do {
                if(numero>0){
                    System.out.println("El número ingresado es positivo.");
                } else if(numero<0){
                    System.out.println("El número ingresado es negativo.");
                } else {
                    System.out.println("Ha ingresado el 0.");
                }
                System.out.println("Digite otro número: ");
                numero = Float.parseFloat(entrada.nextLine());
            } while (numero!=0);
        } else {
            System.out.println("Ha ingresado el 0.");
            
        }*/
        // Forma JOptionPane
        numero = Float.parseFloat(JOptionPane.showInputDialog("Digite un número: "));
        if (numero!=0){
            do {
                if(numero>0){
                    System.out.println("El número ingresado es positivo.");
                } else if(numero<0){
                    System.out.println("El número ingresado es negativo.");
                } 
                numero = Float.parseFloat(JOptionPane.showInputDialog("Digite otro número: "));
                } while (numero!=0);
        }
        if (numero==0){
            System.out.println("Ha ingresado el 0.");
        }
    }
}
