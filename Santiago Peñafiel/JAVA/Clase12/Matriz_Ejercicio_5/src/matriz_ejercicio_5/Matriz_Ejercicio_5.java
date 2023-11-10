/*
 Ejercicio 5: Crear y cargar una matriz de tamaño n x m, mostar la suma de cada
fila y cada columna.
 */
package matriz_ejercicio_5;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Matriz_Ejercicio_5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int matriz[][], nFilas, nCol, sumaFilas, sumaCol;
        int posFila, posCol;
        
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas: "));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas: "));
        
        matriz = new int [nFilas][nCol];
        int filas[] = new int[nFilas];
        int columnas[]= new int[nCol];
        
        System.out.println("Rellenando la matriz: ");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nCol; j++) {
                 System.out.print("Matriz ["+i+"]["+j+"]: ");
                matriz[i][j]= leer.nextInt();                
            }
        }
        System.out.println("\nMatriz Original: ");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nCol; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        
        //Sumando las filas
        posFila = 0;
        for (int i = 0; i < nFilas; i++) {
            sumaFilas = 0;
            for (int j = 0; j < nCol; j++) {
                sumaFilas += matriz[i][j];
            }
            filas[posFila] = sumaFilas;
            posFila ++;
        }
        
        //Sumando las columnas
        posCol= 0;
        for (int i = 0; i < nCol; i++) {
            sumaCol= 0;
            for (int j = 0; j < nFilas; j++) {
                sumaCol += matriz[j][i];
            }
            columnas[posCol] =sumaCol;
            posCol++;
        }
        
        System.out.println("\nLa suma de las filas es: ");
        for (int i = 0; i < nFilas; i++) {
            System.out.print(filas[i]+" - ");
        }
        System.out.println("");
        
        System.out.println("\n La suma de las columnas es: ");
        for (int i = 0; i < nCol; i++) {
            System.out.print(columnas[i]+" - ");
        }
        System.out.println("");
    }
}
