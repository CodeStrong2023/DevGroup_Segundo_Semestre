package Clase4Completa.Leccion4.Aritmetica;

// Ejercicios: pedir numeros hasta que se introduzca uno negativo y calcular la media
import java.util.Scanner;

public class Operaciones07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, conteo = 0, suma = 0;
        float promedio = 0;
        System.out.println("Escriba un numero: ");
        numero = Integer.parseInt(entrada.nextLine()); // conversion
        
        //mientras el num no sea neg
        while(numero >=0){
            suma+= numero; // va sumando
            conteo ++; // va sumando uno a conteo
            System.out.println("Ingrese otro numero: ");
            numero = Integer.parseInt(entrada.nextLine());
        } // Si ingresa neg no va a sumar, contar, nada. Por eso usamos if
        if(conteo == 0){
            System.out.println("\nEror, La division por 0 no existe");
        }
        else{
            promedio = (float) suma/conteo;
            System.out.println("El promedio es: " + promedio);
        }
    }
}
