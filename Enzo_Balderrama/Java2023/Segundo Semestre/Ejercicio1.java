// Ejercicio 1: Leer un número y mostrar su cuadrado, repetir el proceso hasta
// que se introduzca un número negativo.

// import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio1 {
    public static void main(String[] args) {
       int num, cuadrado;
        /* Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un número: ");
        num = Integer.parseInt(entrada.nextLine());
        if(num < 0) {
                System.out.println("Número ingresado no válido.");
            }
        while (num >= 0){
            cuadrado = (int)Math.pow(num, 2);
            System.out.println("El cuadrado de " + num + " es: " + cuadrado);
            System.out.println("Digite otro número: ");
            num = Integer.parseInt(entrada.nextLine());
            if(num < 0) {
                System.out.println("Número ingresado no válido.");
            }
        }  */ 
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        if(num < 0) {
                System.out.println("Número ingresado no válido.");
            }
        while (num >= 0){
            cuadrado = (int)Math.pow(num, 2);
            System.out.println("El cuadrado de " + num + " es: " + cuadrado);
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
            if(num < 0) {
                System.out.println("Número ingresado no válido.");
            }
        }   
    }
}
