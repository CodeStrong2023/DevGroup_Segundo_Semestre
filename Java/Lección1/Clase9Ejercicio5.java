package Lección1;

import java.util.Scanner;

public class Clase9Ejercicio5 {
    public static void main(String[]args) {
        //Ejercicio 5:
        //Hacer un programa que calcule e imprima la suma de tres calificaciones.
        //Pedir las calificaciones al usuario, crear un proyecyo nuevo llamado Ejercicio 5

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Digite la primer calificación : ");
        var nota1 = Integer.parseInt (scanner1.nextLine());
        System.out.println("Digite la segunda calificación : " );
        var nota2 = Integer.parseInt (scanner1.nextLine());
        System.out.println("Digite la tercer calificación : ");
        var nota3 = Integer.parseInt (scanner1.nextLine());

        var sumatotal = nota1 + nota2 + nota3;
        System.out.println("La suma de las tres calificaciones da = " + sumatotal);
        












    }
}
