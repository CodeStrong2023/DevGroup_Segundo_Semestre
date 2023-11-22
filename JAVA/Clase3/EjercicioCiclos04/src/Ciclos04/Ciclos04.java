/*
Ejercicio 4: Pedir un numero hasta que se teclee uno negativo.
y mostrar cuantos numeros se han introducido
Lo hacemos primero con la clase Scanner
Luego lo hacemos con la clase JOptionpane
 */
package Ciclos04;

import java.util.Scanner;


public class Ciclos04 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero, cantVeces = 0;
        System.out.println("Ingrese un numero: ");
        numero = Integer.parseInt(leer.nextLine());
        while(numero >= 0) {
            System.out.println("El Numero " + numero + " Es POSITIVO");
            cantVeces++;
            System.out.println("Digite Otro numero: ");
            numero = Integer.parseInt(leer.nextLine());
        }
        System.out.println("La cantida de numeros positivos introducidos fueron : "+cantVeces);
    }
}
