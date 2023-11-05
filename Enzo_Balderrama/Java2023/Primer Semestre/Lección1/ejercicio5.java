// Hacer un programa que pida calcule e imprima la suma de 3 calificaciones.
// Pedir al usuario las calificaciones.

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        float nota1, nota2, nota3, suma;

        System.out.println("Digite las calificaciones: ");
        nota1 = Float.parseFloat(entrada.nextLine());
        nota2 = Float.parseFloat(entrada.nextLine());
        nota3 = Float.parseFloat(entrada.nextLine());
        suma = nota1 + nota2 + nota3;

        System.out.println("\n La suma de las notas es: " + suma);

    }
}
