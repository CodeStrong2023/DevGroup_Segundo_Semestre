
package ciclos08;

import javax.swing.JOptionPane;


public class ejercicio08 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("digite  un numero"));
        int i = 1;
        while(i <= numero) {
           JOptionPane.showMessageDialog(null,i);
            i++;
        }
    }
    
}
