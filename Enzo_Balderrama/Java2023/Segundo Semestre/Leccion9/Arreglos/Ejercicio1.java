package Leccion9.Arreglos;

import java.util.Scanner;

/*
    * Ejercicio 1: Leer 5 números, guardarlos en un arreglo y
    * mostrarlos en el mismo orden introducido.
*/

public class Ejercicio1 {
        public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[5];

        System.out.println("Guardando los datos en el arreglo");
        for(int i = 0; i < 5; i++){
            System.out.print((i + 1) + " - Digite un número: ");
            arreglo[i] = entrada.nextInt();
        }

        System.out.println("\n Imprimir elementos del arreglo: ");
        for(int i:arreglo){
            System.out.print(i + " | ");
        }
        System.out.println("\n");

    }
}
