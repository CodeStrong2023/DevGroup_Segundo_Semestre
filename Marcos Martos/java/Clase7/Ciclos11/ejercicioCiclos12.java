/*
 *  Ejercicio 12: Pedir un número y calcular su factorial
 *  Hacerlo con las dos clases, Scanner y JOptionPane 
 */

package Ciclos11;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ejercicioCiclos12 {
      public static void main(String[] args) {

        long factorial = 1;
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        for(int i = 1; i<=numero; i++){
            factorial *= i;
        }

        JOptionPane.showMessageDialog(null, "El factorial del numero ingresado es: "+factorial);
    }
}
