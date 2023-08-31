/* Ejercicio 3: Leer numeros hasta que se introduzca un cero.
 * Para cada uno indicar si es par o impar
 */

package Ciclos03;

import javax.swing.JOptionPane;

public class ejercicio03 {
     public static void main(String[] args) {
        int numero;
        System.out.println("Digite un numero: ");
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        while(numero != 0){
            if(numero % 2 == 0){
                JOptionPane.showMessageDialog(null, "El numero ingresado "+numero+" es Par.");
            }else{
                 JOptionPane.showMessageDialog(null, "El numero ingresado "+numero+" es Impar.");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        }
        JOptionPane.showMessageDialog(null, "El numero "+numero+" finaliza el programa.");
    }
}
