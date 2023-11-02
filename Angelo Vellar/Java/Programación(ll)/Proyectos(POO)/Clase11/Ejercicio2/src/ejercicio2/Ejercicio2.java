
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    // Leer 5 numeros. guardarlos en un arreglo y mostrarlos en el orden inverso
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
        float numeros[] = new float[5]; // Tipo float de dimension 5

        System.out.println("Guardando los datos en el arreglo");
        for(int i=0; i<5; i++){
            System.out.println((i+1) + " Digite un número: ");
            numeros[i] = entrada.nextFloat();
        }

        // Mostramos los elementos de manera inversa

        System.out.println("\n Mostramos los elementos del arreglo: ");
        for(int i=4; i>=0; i--){ 
            System.out.println(i + " " + numeros[i]);
        }
        System.out.println("\n");
    }
    
}
