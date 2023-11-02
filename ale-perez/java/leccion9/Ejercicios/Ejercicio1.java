package Clase11Arreglos.Ejercicios;
import java.util.Scanner;

public class Ejercicio1 {
    // Leer 5 numeros. guardarlos en un arreglo y mostrarlos
    // en el mismo orden introducidos
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float arreglos[] = new float[5]; // Tipo float de dimension 5

        System.out.println("Cargando los datos en el arreglo");
        for(int i=0; i<5; i++){
            System.out.println((i+1) + " Escriba un número: ");
            arreglos[i] = entrada.nextFloat();
        }

        // Mostramos los elementos tal cual lo ingresó

        System.out.println("\n Mostramos los elementos del arreglo: ");
        for(float i:arreglos){
            System.out.println(i + " "); // mostramos con espacio y num del iterador
        }
        System.out.println("\n");
    }    

}
