package Clase6POO;

import java.util.Scanner;

//  Ejercicio 10 : Pedir 10 números y escribir la suma total

public class ciclos10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, suma = 0;
        for(int i = 1; i <= 10; i ++){
            System.out.println("Escriba un numero: ");
            numero = Integer.parseInt(entrada.nextLine());
            suma += numero;
        }
        System.out.println("La suma de todos los numeros es: "+ suma);

        entrada.close();
    } 
}
