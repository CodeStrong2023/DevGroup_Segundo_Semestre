// Ej 12: Pedir un número y calcular su factorial.
// >> Hacerlo con las dos clases, Scanner y JOptionPane.

import javax.swing.JOptionPane;

public class clase7_ej12JO {
      public static void main(String[] args) {

        long factorial = 1;
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        for(int i = 1; i<=numero; i++){
            factorial *= i;
        }

        JOptionPane.showMessageDialog(null, "Factorial: "+factorial);
    }
}
