// Ej: Pedir 10 números y escribir la suma total.

import javax.swing.JOptionPane;

public class clase6_ej10ciclos {
     public static void main(String[] args) {

        int numero, suma = 0;

        for(int i = 1; i <= 10; i++){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
            suma += numero;
        }

        JOptionPane.showMessageDialog(null, "Resultado suma: "+suma);
    }
}
