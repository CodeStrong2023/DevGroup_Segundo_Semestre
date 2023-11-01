/*
Ejercicio 4: pedir numeros hasta que se teclee un numero negativo, 
y mostrar cuantos numeros se han introducido
Lo hacemos primero con la clase Scanner
luego lo hacemos con la clase JOptionPane
*/
package Ciclos04;

import javax.swing.JOptionPane;


public class Ejercicio04 {
    public static void main(String[] args) {
        int numero, conteo = 0;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite un numero:"));
        while (numero>=0){
            JOptionPane.showMessageDialog(null, "El numero " + numero + " es positivo");
            conteo++;
            numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite otro numero:"));
        }
        JOptionPane.showMessageDialog(null, "Ha ingresado " + conteo + " numeros que no son negativos");
    }
}
