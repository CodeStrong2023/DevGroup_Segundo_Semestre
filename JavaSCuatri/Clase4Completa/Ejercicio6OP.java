package Clase4Completa;

import javax.swing.JOptionPane;

public class Ejercicio6OP {
    public static void main(String[] args){
         int numero, suma = 0;
         do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Escriba un numero: "));
            suma+= numero; // hacemos que se sumen los num ingresados
        
         }while(numero != 0);
         JOptionPane.showMessageDialog(null,"La suma de todos los num ingresados es: " + suma);   
            
    }
}
