/// CLASE NUMERO 2. Ejercicios con ciclos y Crear Clases

/// Leer un numero y mostrar su cuadrado, hasta que ingrese un numero negativo

package Clase2Ciclos;
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero, cuadrado;
        System.out.println("Escriba un numero");
        numero = Integer.parseInt(entrada.nextLine());
        while(numero >=0){
            cuadrado = (int)Math.pow(numero, 2);
            System.out.println("El numero "+numero+" elevado al cuadrado es: "+cuadrado);
            System.out.println("Escriba otro numero: ");
            numero = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("El programa ha finalizado");   
    }  
}