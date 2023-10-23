/*
Ejercicio 5: Ralizar un juego para adivinar un numero, para ello generar
un numero aleatorio entre 0-100 , y luego ir pidiendo numeros indicando "es mayor"
o "es menor" segun sea mayor o menor con respecto a N
El proceso termina cuando el usuario acierta y mostramos el numero de intentos hechos.
 */
package Ciclos05;

import java.util.Scanner;


public class Ciclos05 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero, aleatorio, conteo = 0;
        aleatorio = (int)(Math.random()*100); // ESto genera un numero aleatorio de 0-100
        do{
            System.out.println("Digite un numero: ");
            numero = Integer.parseInt(leer.nextLine());
            if (numero < aleatorio){
                System.out.println("Digite un numero mayor");
            }
            else if (numero > aleatorio){
                System.out.println("Digite un numero menor");
            }
            else {
                System.out.println("!! FELICIDADES!! has encontrado el numero");
            }
            conteo++;
        }while (numero != aleatorio);
        System.out.println("Adivinaste el numero en "+conteo+ " intentos");
    }
}