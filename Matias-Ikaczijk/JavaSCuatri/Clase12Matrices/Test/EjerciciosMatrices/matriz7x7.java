package Clase12Matrices.Test.EjerciciosMatrices;

import java.util.Scanner;

// crear una matriz 7x7 donde las diagonales principales sean 1 y el reto 0
public class matriz7x7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matrizA[][] = new int [7][7];

        // Llenamos matriz
        for(int i=0; i<7; i++){
            for(int j = 0; j < 7; j++){
                if ((i == j)){ // cuando sean igual indice asigna 1
                    matrizA[i][j] = 1;
                }
                else{
                    matrizA[i][j] = 0;
                }
            }
        }
        System.out.println("Mostrando matriz completa: ");
        for(int i = 0; i < 7; i ++){
            for(int j = 0; j < 7; j++){
                System.out.println(matrizA[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
