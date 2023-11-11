package Clase12.Matrices;

import java.util.Scanner;

import javax.swing.JOptionPane;

/*
 * Ejercicio 3: Crear y cargar una matriz de tamaño n x m, mostrar la suma 
 * de cada fila y de cada columna
 */

public class Ejercicio_matriz03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][],nFilas,nCol,sumaFilas,sumaCol;
        int posFila,posCol;

        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de filas: ")); 
        
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de columnas: ")); 

        matriz = new int [nFilas][nCol];
        int filas[] = new int[nFilas];
        int columnas[] = new int[nCol];

        System.out.println("Llenar matriz: ");
        for(int i=0; i<nFilas; i++){
            for(int j=0; j<nCol; j++){
                System.out.println("Matriz ["+i+"]["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        System.out.println("\n Matriz original: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " "); 
            }
            System.out.println();
        }
        System.out.println();

        // Sumando las filas
        posFila = 0;
        for(int i=0; i<nFilas; i++){
            sumaFilas = 0;
            for(int j=0; j<nCol; j++){
                sumaFilas += matriz[i][j];
            }
            filas[posFila] = sumaFilas;
            posFila++;
        }

        // Sumando las columnas
         posCol = 0;
        for(int j=0; j<nCol; j++){
            sumaCol = 0;
            for(int i=0; i<nFilas; i++){
                sumaCol += matriz[i][j];
            }
            columnas[posCol] = sumaCol;
            posCol++;
        }

        System.out.println("\n La suma de las filas es: ");
        for (int i = 0; i < nFilas; i++) {
            System.out.print(filas[i] + " - "); 
        }
        System.out.println(); 
        
        System.out.println("\n La suma de las columnas es: ");
         for (int i = 0; i < nCol; i++) {
            System.out.print(columnas[i] + " - "); 
        }
        System.out.println(); 
    }
}
