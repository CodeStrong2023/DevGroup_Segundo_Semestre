package Leccion9.Arreglos;

import java.util.Scanner;

/*
 * Ejercicio 2: Leer 5 números, guardarlos en un arreglo y 
 * mostrarlos en el orden inverso al introducido
 */

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeros[] = new int[5];

        System.out.println("Guardando los datos en el arreglo");
        for(int i = 0; i < 5; i++){
            System.out.print((i + 1) + ". Digite un número: ");
            numeros[i] = entrada.nextInt();
        }

        System.out.println("\n Imprimir elementos del arreglo: ");
        for(int i = (numeros.length - 1); i >= 0; i--){
            System.out.print(numeros[i] + " | ");
        }
        System.out.println("\n");
    }
}
