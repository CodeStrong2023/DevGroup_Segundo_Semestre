import java.util.Scanner;

import javax.swing.JOptionPane;

public class ejercicio8Clase5{
    public static void main(String[] args) {
        
    //EJERCICIO 8: Pedir un numero "N" y mostrar los números de 1 a "N"
                    //CLASE SCANNER
    /* 
    Scanner consola1 = new Scanner(System.in);
    System.out.print("Ingrese un número: ");
    int num = Integer.parseInt(consola1.nextLine());
    int i = 1;
    while (i <= num) {
        System.out.println(i);
        i++;
    }
    

    consola1.close();
*/
                     //CLASE JOptionPane
    System.out.print("Ingrese un número: ");
    int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
    int i = 1;
    while (i <= num) {
        JOptionPane.showMessageDialog(null, i);
        i++;
    }


    }
}