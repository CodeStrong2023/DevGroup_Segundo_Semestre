package Clase4Completa;

import java.util.Scanner;

// Pedir numeros hasta que se teclee 0, mostrar la suma
// de todos los mumeros introducidos

public class Ejercicio6CS {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero, suma = 0;
        do{
            System.out.println("Ingrese un numero: ");
            numero = Integer.parseInt(entrada.nextLine());
            suma+= numero; // hacemos que se sumen los num ingresados

        }while(numero != 0);
        System.out.println("La suma de todos los num ingresados es: " + suma);

    }
}
