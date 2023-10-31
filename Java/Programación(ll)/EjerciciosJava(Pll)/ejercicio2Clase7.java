import java.util.Scanner;

import javax.swing.JOptionPane;

public class ejercicio2Clase7 {
    public static void main(String[] args) {
        //Ejercicio 12: Pedir un número y calcular su factorial. Hacerlo con las dos clases
        //Scanner y JOptionPane
        //Scanner consola1 = new Scanner(System.in);
        long factorial = 1;
        //System.out.println("Digite un número: ");
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        for(int i=1; i<=numero; i++){
            factorial *= i;
        }
        //System.out.println("\nEl factorial del número es: "+factorial);
        JOptionPane.showMessageDialog(null, "El factorial del número es: "+ factorial);

        //consola1.close();
    }
}
