/*
Ejercicio 3: Crear y cargar una matriz de 3x3, trasponerla y mostrarla
*/
package ejerciciosmatrices;

import java.util.Scanner;


public class Matriz_Ejercicio_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][] = new int[3][3];
        
        System.out.println("Rellenar la matriz: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("matriz ["+ i +"] ["+j+"]: " );
                matriz[i][j] = entrada.nextInt();
            }
            
        }
        System.out.println();
        
        System.out.println("Matriz original: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(matriz[i][j] + " ");
                
            }
            System.out.println(); //Le damos forma a la matriz
            
        }
        System.out.println();
        
        
        System.out.println("Matriz Transpuesta: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(matriz[j][i] + " "); //Modificamos lugar de filas = columnas, columnas = filas
                
            }
            System.out.println(); //Le damos forma a la matriz
            
        }
        System.out.println();
    }
    
}

        
