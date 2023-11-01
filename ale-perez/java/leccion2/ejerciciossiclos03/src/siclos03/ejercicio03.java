/*
Ejercicios 3:Leeer numeros hasta que se  introduzca un cero 
para cada uno indicar si es par o impar.
primero lo haremos con la clase Scaneer
Luego con la clase JOptionPane
*/
package siclos03;

import javax.swing.JOptionPane;

public class ejercicio03 {
    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        while (numero != 0) {
           if(numero % 2 == 0){
              JOptionPane.showMessageDialog(null, "el numero ingresado"+numero+ "es par"); 
               
           }
           else{
                 JOptionPane.showMessageDialog(null, "el numero ingresado"+numero+ "es impar"); 
           }
           numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        }
        JOptionPane.showConfirmDialog(null, "el numero ingresado es "+numero+" finaliza el programa");
        
    }
}
