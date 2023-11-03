/*
 * Ejercicio 1: Leer 5 números, guardarlos en un arreglo y
 * mostrarlos en el mismo orden introducido
 */

import java.util.Scanner;

public class clase11_ej1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float arreglo[] = new float[5];

        System.out.println("Guardando los datos en el arreglo");
        for(int i = 0; i < 5; i++){
            System.out.println((i + 1) + ". Digite un número: ");
            arreglo[i] = entrada.nextFloat();
        }

        System.out.println("\n Imprimir elementos del arreglo: ");
        for(float i:arreglo){
            System.out.println(i + " ");
        }
        System.out.println("\n");
        entrada.close();
    }
}
