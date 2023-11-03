package Clase12Matrices.Test.EjerciciosMatrices;

import java.util.Scanner;

public class matriz3x3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][] = new int[3][3];

        System.out.println("RELLENAR MATRIZ: ");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3;j++){
                System.out.println("Matriz [" + i + " ] [" + j + " ] = ");
                matriz[i][j] = entrada.nextInt();
            }
        } 
        System.out.println();

        System.out.println("Matriz original");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3;j++){
                System.out.println(matriz[i] [j] + " ");
            }
            System.out.println();
        } 
        System.out.println();

        // Matriz transpuesta
        System.out.println("Matriz transpuesta: ");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3;j++){
                System.out.println(matriz[j][i] + " ");
            }
            System.out.println();
        } 
        System.out.println();

    }
}
