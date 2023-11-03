/* Ejercicio 4: Pedir numero hasta que se teclee uno negativo
 * y mostrar cuantos numeros se han introducido.
 */

package Ciclos04;

import javax.swing.JOptionPane;

public class ejercicio04 {
    
     public static void main(String[] args) {
        int numero, conteo = 0;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        while(numero >= 0){
            JOptionPane.showMessageDialog(null, "El numero es positivo.");
            conteo++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        }
        JOptionPane.showMessageDialog(null, "Ha ingresado "+conteo+" numeros que no son negativos.");
    }

}
