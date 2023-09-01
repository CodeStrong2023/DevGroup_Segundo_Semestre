package Clase3Completa;
import java.util.Scanner;

// Realizar un juego para adivinar el numero, para ello
// generar un numero aleatorio entre 0-100 y luego ir pidiendo
// numeros indicando "es mayor" o "menor", segun sea mayor o menor
// con respecto a N. Termina cuando el usuario acierta y mostramos la cant de intentos

public class Ejercicio5CS {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, aleator, cont = 0;
        /// generar un num aleatorio 
        aleator = (int)(Math.random()*100); // conv a entero, genera un aleatorio

        do{
            System.out.println("Escriba un numero: ");
            numero = Integer.parseInt(entrada.nextLine());
            /// una vez que ingresa el num:

            if(numero < aleator){
                System.out.println("Ingrese un numero mayor");
            }
            else if(numero > aleator){
                System.out.println("Ingrese un numero menor");
            }
            else{ // se nuestra una vez que acierta el num
                System.out.println("¡FELICIDADES! Acertaste");
            }
            cont++;
        } while(numero != aleator); // repetir hasta q num sea distinto de aleatorio
        System.out.println("Adivinaste el numero " + aleator + " en: " + cont + " intentos");
    }
}
