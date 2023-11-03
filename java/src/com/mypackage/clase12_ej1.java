/*
 * Ejercicio 1: Crear y cargar una matriz 3x3, transponerla y mostrarla
 */

import java.util.Scanner;

public class clase12_ej1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][] = new int[3][3];

        System.out.println("Rellenar la matriz: ");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.println("Matriz ["+i+"]["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        System.out.println();

         // Matriz tradicional
         System.out.println("Matriz tradicional: ");
       for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " "); 
            }
            System.out.println();
        }
        System.out.println();

        // Matriz transpuesta
         System.out.println("Matriz transpuesta: ");
         for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[j][i] + " "); 
            }
            System.out.println();
        }
        System.out.println();
        entrada.close();
    }
}
