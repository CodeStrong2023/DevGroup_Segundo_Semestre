/* Ejercicio 8: Pedir un número N, y mostrar todos los
 * números del 1 al N.
 */

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio8 {
    public static void main(String[] args) {
        // Con clase scanner
        /*Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un número: ");
        var N = Integer.parseInt(entrada.nextLine());
        for (int i = 1; i <= N; i++){
            if (i != N){
                System.out.print(i + " | ");
            } else {
                System.out.println(i);
            }
        }*/
        // Con JOptionPane
        var N = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        for (int i = 1; i <= N; i++){
            if (i != N){
                System.out.print(i + " | ");
            } else {
                System.out.println(i);
            }
        }
    }
}
