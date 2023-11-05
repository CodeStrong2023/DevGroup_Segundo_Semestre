/* Ejercicio 9: Pedir dia, mes y año de una fecha e indicar
 * si la fecha es correcta. Suponiendo que todos los meses son de 30 días.
 */

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio9 {
    public static void main(String[] args) {
        var dia = 0; var mes = 0; var año = 0;
        // Con clase Scannes
        /* Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el día: ");
        dia = Integer.parseInt(entrada.nextLine());
        System.out.println("Digite el mes: ");
        mes = Integer.parseInt(entrada.nextLine());
        System.out.println("Digite el año: ");
        año = Integer.parseInt(entrada.nextLine()); */
        // Con JOptionPane
        dia = Integer.parseInt(JOptionPane.showInputDialog("Digite el día: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes: "));
        año = Integer.parseInt(JOptionPane.showInputDialog("Digite el año: "));
        if (dia <= 30 && mes != 2 && mes < 13){
            System.out.println("La fecha indicada es correcta.");
        } if (dia <= 28 && mes == 2 && mes < 13) {
            System.out.println("La fecha indicada es correcta.");
        } else {
            System.out.println("Fecha erronea.");
        }
    }
}
