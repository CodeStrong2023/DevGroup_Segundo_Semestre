/*
Ejercicio 2: leer un numero e identificar si es positivo o
negativo. El proceso se repetira hasta que se introduzca un 0
*/
package Ciclos02;

import javax.swing.JOptionPane;


public class Ciclos02 {
     public static void main(String[] args) {

       
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        while (numero!=0){
            if (numero>0){
                JOptionPane.showInputDialog(null, "El numero " + numero + " es positivo");
                
            } else {
                 JOptionPane.showInputDialog(null, "El numero " + numero + " es negativo");
            }
            System.out.println("Digite otro numero:");
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));
        }
        JOptionPane.showInputDialog(null, "El numero " + numero + " finaliza el programa");
    }
}
