/*
Ejercicio2:leeer un numero e indica si es positivo o
negativo.El proceso se repetira hasta que se introduzca un cero 0
Hacer este ejercicio con la clase Scanner,
luego hacerlo nuevamente con la claseJOptionPane
*/
package siclos02;

import javax.swing.JOptionPane;

public class ciclos02 {
    public static void main(String[] args) {
       
        var numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        while (numero != 0) {
            if (numero > 0) {
                JOptionPane.showMessageDialog(null, "El numero"+"es POSITIVO");
            } else {
                JOptionPane.showMessageDialog(null, "El numero"+"es NEGATIVO");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));
        }
       JOptionPane.showMessageDialog(null,"El numero " + numero + " finaliza el programa.");
       
    }
}
