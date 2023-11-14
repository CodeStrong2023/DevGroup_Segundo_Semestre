package Leccion10.Matrices;

/*
 * Crear y cargar una matriz de 3x3, trasponerla y mostrarla.
 */

public class Ejercicio1 {
    public static void main(String[] args) {
        int nums[][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Matriz Original: ");
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j]+ " | ");
            }
            System.out.println("");
        }
        System.out.println("\nMatriz Traspuesta:");
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[j][i]+ " | ");
            }
            System.out.println("");
        }

    }
}
