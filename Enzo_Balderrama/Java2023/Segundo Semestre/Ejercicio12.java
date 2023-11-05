/*
 *  Ejercicio 12: Pedir un número y calcular su factorial.
 *  Hacerlo con las dos clases, Scanner y JOptionPane. * 
 */

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio12 {
    public static void main(String[] args) {
        int num, fact;
        fact = 1;
        // Con Scanner
        /*Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un número: ");
        num = Integer.parseInt(entrada.nextLine());
        for (int i = num; i >= 1; i--){
            fact *= i;
        } */
        // Con JOptionPane
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        for(int i = num; i > 0; i--){
            fact *= i;
        }
        System.out.println("El factorial de "+ num + " es: " + fact);      
    }
    
}
