/*
 Ejercicio 08: Pedir un numero N, y mostrar todos los numeros del 1 al N.
 */
package Ciclos08;

import java.util.Scanner;


public class Ciclos08 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite un numero: ");
        int numero = Integer.parseInt(leer.nextLine());
        int i =1;
        while (i <= numero){
            System.out.println(i);
            i++;
        }
    }
}
