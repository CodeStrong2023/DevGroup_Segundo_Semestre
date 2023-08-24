/*
 * Ejercicio 2: Leer un número e indicar si es positivo o negativo.
 * El proceso se repetirá hasta que se ingrese el 0.
 */

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        float numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un número: ");
        numero = Float.parseFloat(entrada.nextLine());
    }
}
