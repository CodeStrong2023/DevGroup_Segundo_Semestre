import java.util.Scanner;

public class repasoArreglos {
    public static void main(String[] args) {
        //Hacer un programa que permita al usuario ingresar 5 números y mostrarlos.
        Scanner consola = new Scanner(System.in);
        
        int numeros[] = new int[5];
        int contador = 0;


        while (contador < 5) {
           System.out.print("Ingrese un número: ");
           int numero = consola.nextInt();
           numeros[contador] = numero;
           contador++;
        }
        contador = 0;
         while (contador < 5) {
            System.out.println("Los numeros son: " + numeros[contador]);
            contador++;


         }

    consola.close();
    }
    
} 
