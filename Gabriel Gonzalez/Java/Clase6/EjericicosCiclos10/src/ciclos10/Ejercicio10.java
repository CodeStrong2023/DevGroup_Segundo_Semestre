/*
Ejercicio 10: Pedir 10 números y escribir la súma total
*/
package ciclos10;

import javax.swing.JOptionPane;


public class Ejercicio10 {
    public static void main(String[] args) {
         int numero,suma = 0;
        for (int i = 1; i <= 10 ; i ++){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número:"));
            suma += numero;
    }
      JOptionPane.showInputDialog(null, "La suma de todos los numeros es: " + suma);
       
    }
    
}
