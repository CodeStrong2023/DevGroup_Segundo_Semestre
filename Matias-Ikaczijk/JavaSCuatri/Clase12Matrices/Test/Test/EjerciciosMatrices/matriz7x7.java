package Clase12Matrices.Test.EjerciciosMatrices;

import java.util.Scanner;

// crear una matriz 7x7 donde las diagonales principales sean 1 y el reto 0
public class matriz7x7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matrizA[][] = new int [7][7];

        // Llenamos matriz
        for(int i=0; i<7; i++){
            for(int x=0;x<7;x++){
                if ((i==x)){ // cuando sean igual indice asigna 1
                    matrizA[i][x] = 1;
                }
                else{
                    matrizA[i][x] = 0;
                }
            }
        }
        // NO ENCUENTRO LA FALLA EN ESTE EJ
    }
    System.out.println("Mostrando matriz completa: ");
    for(int i = 0; i < 7; i ++){
        for(int x=0; x<7;x++){
            System.out.println(matrizA[i][x] + " ");
        }
        System.out.println("");
    }
}
