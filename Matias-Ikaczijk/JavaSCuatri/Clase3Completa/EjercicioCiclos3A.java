package Clase3Completa;

import java.util.Scanner;

// Leer numeros hasta que se introduzca el cero. Para cada num
// indicar si es par o no. Luego con JOptionPane

public class EjercicioCiclos3A {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;
        System.out.println("Escriba un número: ");
        numero = Integer.parseInt(entrada.nextLine());

        while(numero != 0){
            if (numero % 2 == 0){ // mientras esto es T, el num es par
                System.out.println("El numero inresado " + numero + " es par");
            }
            else{
                System.out.println("El numero ingresado: " + numero + " es impar");
            }
            System.out.println("Escriba un numero: ");
            numero = Integer.parseInt(entrada.nextLine());
        }

        System.out.println("El numero 0 termina el programa");
    }
}
