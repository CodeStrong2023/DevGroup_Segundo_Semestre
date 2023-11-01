package Clase5.EjerciciosJava;
// Pedir un numero N y mostrar los numeros que le anteceden

import java.util.Scanner;

public class Ejercicio8PedirNum {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba un número: ");
        int numero = Integer.parseInt(entrada.nextLine());
        int i = 1;

        while(i <= numero){ // mientras sea menor al numero ingresado, va mostrando
            System.out.println(i);
            i++;
        }
        entrada.close();
    }
}
