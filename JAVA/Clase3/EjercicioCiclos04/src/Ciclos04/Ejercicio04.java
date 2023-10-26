/*
Ejercicio 4: Pedir un numero hasta que se teclee uno negativo.
y mostrar cuantos numeros se han introducido
Lo hacemos primero con la clase Scanner
Luego lo hacemos con la clase JOptionpane
 */
package Ciclos04;

import javax.swing.JOptionPane;




public class Ejercicio04 {
    public static void main(String[] args) {
        int numero, cantVeces = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));        
    
        while(numero >= 0) {
            JOptionPane.showMessageDialog(null, "El Numero " + numero + " Es POSITIVO");            
            cantVeces++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro un numero: "));  
            
        }
        JOptionPane.showMessageDialog(null, "La cantidad de numeros positivos introducidos fueron : "+cantVeces);   
        
    }
    
}
