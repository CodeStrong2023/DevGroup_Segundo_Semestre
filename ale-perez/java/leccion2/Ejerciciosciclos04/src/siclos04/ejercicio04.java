
package siclos04;

import javax.swing.JOptionPane;

public class ejercicio04{
    public static void main(String[] args) {
        int numero, conteo = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        while(numero >= 0) {
        JOptionPane.showMessageDialog(null,"el numero "+numero+" es POSITIVO");
            conteo++;
             numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        }
         JOptionPane.showMessageDialog(null,"A ingresado "+conteo+" numero que no son negativos ");
        
    }
   
    
}