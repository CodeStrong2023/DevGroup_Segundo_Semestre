/*
Ejercicio 3: leer numeros hasta que se introduzca un cero
para cada uno indicar si es par o impar
primero lo haremos con la clase Scanner
Luego con la clase JOptionPane
*/
package Ciclos03;

import javax.swing.JOptionPane;


public class Ejercicios03 {
     public static void main(String[] args) {
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite un numero:"));
        while(numero!=0){
            if(numero %2 == 0){
                JOptionPane.showInputDialog(null, "El numero ingresado " + numero + " es PAR");
            } else{
                JOptionPane.showInputDialog(null, "El numero ingresado " + numero + " es IMPAR");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite un numero:"));
        }
        JOptionPane.showInputDialog(null, "El numero ingresado " + numero + " finaliza el programa");
    }
}
