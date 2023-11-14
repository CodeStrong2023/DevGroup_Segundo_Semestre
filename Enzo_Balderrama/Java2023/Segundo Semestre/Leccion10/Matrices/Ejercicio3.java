package Leccion10.Matrices;

import javax.swing.JOptionPane;

/*
 * Ejercicio 3: Crear y cargar una matriz de tamaño n x m, mostrar la suma 
 * de cada fila y de cada columna
 */


public class Ejercicio3 {
    public static void main(String[] args) {
        int n, m, k, l; 
        k = 0; l = 0;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite numero de filas: "));
        m = Integer.parseInt(JOptionPane.showInputDialog("Digite numero de columnas: "));
        int nums[][] = new int[n][m];
        int numsCol[] = new int[m];
        int numsFilas[] = new int[n];
        System.out.println("Cargar datos de la matriz: ");
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite valor del elemento ["+i+"]"+"["+j+"]"));
            }
        }
        for (int i = 0; i < numsCol.length; i++){
            numsCol[i] = 0;
        }
        for (int i = 0; i < numsFilas.length; i++){
            numsFilas[i] = 0;
        }
        System.out.println("Datos de la matriz: ");
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " | ");
            }
            System.out.println("");
        }
        while (k < n) {
            for (int i = 0; i < m; i++){
                numsFilas[k] += nums[k][i];
            }
            k++;
        }
        while (l < m) {
            for (int i = 0; i < n; i++){
                numsCol[l] += nums[i][l];
            }
            l++;
        }
        System.out.println("La suma de las columnas es: ");
        for (int i = 0; i < numsCol.length; i++){
            System.out.println("Columna "+ i + ": "+ numsCol[i]);
        }
        System.out.println("La suma de las filas es: ");
        for (int i = 0; i < numsFilas.length; i++){
            System.out.println("Fila "+ i + ": "+ numsFilas[i]);
        }
        

        
    }
}
