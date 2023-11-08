/*
Ejercicio 2: leer 5 numeros, guardarlos en un arreglo y 
mostrarlos en el orden inverso al que se introdujeron
*/
package arreglos_ejercicio_2;

import java.util.Scanner;

public class Arreglos_Ejercicio_2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float[] arreglos = new float[5];
        
        System.out.println("Guardando los dato en el arreglo");
        for(int i=0; i<5; i++){
            System.out.println(i+1 + "Digite un numero: ");
            arreglos[i] = entrada.nextFloat();
        }
        
        System.out.println("Imprimir los elementos del arreglo");
        for (int i = 1; i>=0; i--){
            System.out.println(i+" ");
        }
        System.out.println("\n");
    }
    
}
