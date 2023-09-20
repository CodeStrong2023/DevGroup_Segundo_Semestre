// Pedir un numero N y mostrar los numeros que se encuentran hasta N

import javax.swing.JOptionPane;

public class clase5_ej8J {
    public static void main(String[] args) {
       
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Escriba un numero: "));
        int i = 1;

        while(i <= numero){ // mientras sea menor al numero ingresado, va mostrando
            JOptionPane.showMessageDialog(null,i);
            i++;
        }
    }
}
