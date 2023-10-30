/*
Ejercicio 3: Leer numeros hasta que se instroduzca un cero
Para cada uno indicar si es par o impar. 
Primero lo haremos con la clase Scanner
Luego con la clase JOptionpane
*/

package Ciclos03;

import javax.swing.JOptionPane;


public class Ejercicio03 {
    public static void main(String[] args) {
        int numero;
                
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        while (numero !=0){
            if (numero % 2 == 0){
                JOptionPane.showMessageDialog(null, "El numero Ingresado "+ numero + " es PAR");
            }
            else {
                JOptionPane.showMessageDialog(null, "El numero Ingresado "+ numero + " es IMPAR");
            }    
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero : "));
        }
        JOptionPane.showMessageDialog(null, "El numero Ingresado "+ numero + " Finaliza el proceso");
    }  
}
