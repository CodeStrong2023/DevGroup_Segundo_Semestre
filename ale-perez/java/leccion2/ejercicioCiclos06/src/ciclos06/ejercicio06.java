
package ciclos06;

import javax.swing.JOptionPane;

public class ejercicio06 {
    public static void main(String[] args) {
        int numero,suma = 0;
        do{
           
            numero = Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));
            suma+= numero;
        }while(numero != 0);
        
       JOptionPane.showConfirmDialog(null,"La suma de todos los numeros ingresados es: "+suma);
    }
}
