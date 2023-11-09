package Clase12Matrices.Test.EjerciciosMatrices;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Matriznxm {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][], nFilas, nColum, sumaFilas, sumaCol;
        int posFila, posCol;
        
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de filas: "));
        nColum = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de columnas: "));

        matriz = new int [nFilas] [nColum]; //instanciamos
        int filas[] = new int [nFilas];
        int columnas[] = new int [nColum];
        
        System.out.println("Completamos matriz: ");
        for(int i=0; i < nFilas; i++){
            for(int j=0; j < nColum; j++){
                System.out.println("Matriz [" + i + "] [" + j + "]");
                matriz[i][j] = entrada.nextInt();
            }
        }
        System.out.println("\nMatriz original: ");
        for(int i=0; i < nFilas; i++){
             for(int j=0; j<nColum; j++){
                System.out.println(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        // Sumamos filas
         posFila = 0;
         for(int i=0; i < nFilas; i++){
            sumaFilas = 0;
            for(int j= 0; j<nColum; j++){
                sumaFilas += matriz[i][j]; // suma y recorre col
            }
            filas[posFila] = sumaFilas;
            posFila++;
        }
            
            // Suma columnas
            posCol = 0;
            for(int j=0; j < nColum; j++){ // en columnas sumamos al reves
                sumaCol = 0;
                for(int i = 0; i<nFilas;i++){
                    sumaCol += matriz[i][j];
                }
                columnas[posCol] = sumaCol;
                posCol++;
            }
            System.out.println("");

            System.out.println("La suma de las filas es: ");
            for(int i = 0; i < nFilas; i++){
                System.out.println(filas[i] + " - ");
            }
            System.out.println( ""); 
            
            System.out.println("La suma de las columnas es: ");
            for(int i=0; i<nFilas; i++){
                System.out.println(columnas[i] + " - ");
            }
            System.out.println("");
        }

}
