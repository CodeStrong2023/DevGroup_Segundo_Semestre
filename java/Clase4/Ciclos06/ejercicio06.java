/* Ejercicio 6: Pedir numeros hasta que se teclee un 0, 
mostrar la suma de todos los numeros introducidos */

package Ciclos06;

import java.util.Scanner;

public class ejercicio06 {
    public static void main(String[] args) {
        int numero, suma = 0;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("Digite un numero: ");
            numero = Integer.parseInt(entrada.nextLine());
            suma+= numero;
        } while (numero != 0);
        
        System.out.println("La suma de todos los numeros ingresados es: "+suma);
    }
}
