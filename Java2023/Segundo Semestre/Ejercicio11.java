/*
 * Ejercicio 11: Diseñar un programa que muestre el producto
 * de los 10 primeros números impares.
 * Hacerlo con JOptionPane.
 */

import javax.swing.JOptionPane;

public class Ejercicio11 {
    public static void main(String[] args) {
        int num, i, producto;
        producto = 1;
        i = 0;
        while (i < 10){
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
            if(num % 2 == 1) {
                producto *= num;
                i++;
            }
        }
        System.out.println("El producto de los 10 primeros números impares es: " + producto);
    }    
}
