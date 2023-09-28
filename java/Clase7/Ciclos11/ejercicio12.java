/*
 *  Ejercicio 12: Pedir un número y calcular su factorial
 *  Hacerlo con las dos clases, Scanner y JOptionPane 
 */

package Ciclos11;

import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        long factorial = 1;
        System.out.println("Digite un número: ");
        int numero = Integer.parseInt(entrada.nextLine());
        for(int i = 1; i<=numero; i++){
            factorial *= i;
        }
        System.out.println("El factorial del numero ingresado es: "+factorial);
    }
}
