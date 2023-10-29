/*
Ejercicio 12: Pedir un número y calcular su factorial
Hacerlo con las dos clases, Scanner y JOptionPane
 */
package ciclos12;

//import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ciclos12 {

    public static void main(String[] args) {
        //Scanner entrada  = new Scanner(System.in)
        long factorial = 1;
        //System.out.println("Digite un numero: ");
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        //System.out.println("El factorial del numero ingresado es: " + factorial);
        JOptionPane.showMessageDialog(null, "El factorial del número ingresado es: " + factorial);
    }

}
