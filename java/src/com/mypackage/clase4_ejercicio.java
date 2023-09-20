// Ejercicio: Pedir números hasta que se introduzca uno negativo y calcular la media.

import java.util.Scanner;

public class clase4_ejercicio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, conteo = 0, suma = 0;
        float promedio = 0;
        System.out.println("Escriba un numero: ");
        numero = Integer.parseInt(entrada.nextLine());
        
        while(numero >=0){
            suma+= numero;
            conteo ++; //
            System.out.println("Ingrese otro numero: ");
            numero = Integer.parseInt(entrada.nextLine());
        }
        if(conteo == 0){
            System.out.println("\nEror, La division por 0 no existe");
        }
        else{
            promedio = (float) suma/conteo;
            System.out.println("El promedio es: " + promedio);
        }
        entrada.close();
    }
}
