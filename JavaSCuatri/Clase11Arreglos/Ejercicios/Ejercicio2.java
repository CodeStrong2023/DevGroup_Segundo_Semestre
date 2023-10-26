package Clase11Arreglos.Ejercicios;

import java.util.Scanner;

// Leer 5 numeros. guardarlos en un arreglo y mostrarlos
// en el orden inverso

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float numeros[] = new float[5]; // Tipo float de dimension 5

        System.out.println("Cargando los datos en el arreglo");
        for(int i=0; i<5; i++){
            System.out.println((i+1) + " Escriba un número: ");
            numeros[i] = entrada.nextFloat();
        }

        // Mostramos los elementos de manera inversa

        System.out.println("\n Mostramos los elementos del arreglo: ");
        for(int i=4; i>=0; i--){ // recorre de atras hacia adelante..
            System.out.println(i + " " + numeros[i]);
        }
        System.out.println("\n");
    }    
}
