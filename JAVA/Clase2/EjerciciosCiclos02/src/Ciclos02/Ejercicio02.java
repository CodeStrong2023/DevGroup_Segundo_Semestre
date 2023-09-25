/*
Ejercicio 2: Leer un numero e indicar si es positivo o negativo.
El porceso se repetira hasta que se introduzca un cero 0
*/
package Ciclos02;

import java.util.Scanner;


public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite un numero: ");
        var numero = Integer.parseInt(leer.nextLine());
        while(numero != 0){
            if(numero > 0){
                System.out.println("El numero " +numero+ " es POSITIVO");
            }
            else {
                System.out.println("El numero " + numero+ " es NEGATIVO");
            }
            System.out.println("Digite  otro numero");
            numero = Integer.parseInt(leer.nextLine());
        }
        System.out.println("El numero "+numero+ " finaliza el programa");
    }
}
        

