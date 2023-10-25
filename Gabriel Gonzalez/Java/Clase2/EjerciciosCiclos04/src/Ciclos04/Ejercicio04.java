/*
Ejercicio 4: Pedir numeros hasta que se teclee uno negativo, y mostrar cuantos
numeros se han introducido.
 */
package Ciclos04;

import javax.swing.JOptionPane;


public class Ejercicio04 {
    public static void main(String[] args) {
        int numero;
        int contador = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero:"));
                
        while (numero > 0) {
            JOptionPane.showMessageDialog(null, "El numero" + numero+ " es positivo");
            contador++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero:"));
            
        }
        JOptionPane.showMessageDialog(null, "A ingresado "  + contador + " numeros que no son negativos");
    }
    
}
