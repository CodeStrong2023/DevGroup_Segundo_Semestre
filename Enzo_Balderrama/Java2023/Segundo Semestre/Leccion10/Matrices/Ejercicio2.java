package Leccion10.Matrices;

/*
 * Ejercicio 2: Crear una matriz 7x7 y rellenarla de forma
 * que los elementos de la diagonal principal sean 1 y el resto 0
 */


public class Ejercicio2 {
    public static void main(String[] args) {
        int nums[][] = new int[7][7];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (i == j){
                    nums[i][j] = 1;
                } else {
                    nums[i][j] = 0;
                }
            }
        }
        System.out.println("Datos de la matriz: ");
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " | ");
            }
            System.out.println("");
        }
    }
    
}
