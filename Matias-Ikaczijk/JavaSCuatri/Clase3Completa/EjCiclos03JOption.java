package Clase3Completa;

import javax.swing.JOptionPane;

public class EjCiclos03JOption {
     public static void main(String[] args) {
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Escriba un número"));
             
            while(numero != 0){
                if (numero % 2 == 0){ // mientras esto es T, el num es par
                    JOptionPane.showMessageDialog(null, "El numero inresado " + numero + " es par");
                }
                else{
                    JOptionPane.showMessageDialog(null, "El numero ingresado: " + numero + " es impar");
                }
                numero = Integer.parseInt(JOptionPane.showInputDialog(" Escriba un numero"));
            }
            JOptionPane.showMessageDialog(null, "El numero 0 termina el programa");
    }
}
