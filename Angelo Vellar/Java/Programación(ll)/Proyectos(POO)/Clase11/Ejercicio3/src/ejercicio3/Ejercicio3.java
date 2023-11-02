
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    // Leer 5 numeros. guardarlos en un arreglo y realizar la media de num positivos negativos y contar el numero de ceros.

    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
        float numeros[] = new float[5]; // Tipo float de dimension 5
        float negativos = 0, positivos = 0, mediaNegativos = 0, mediaPos = 0;
        int conteo0 = 0, contNeg = 0, contPos = 0;

        System.out.println("Guardamos numeros al arreglo: ");
        for(int i=0; i<5; i++){
            System.out.println((i+1) + "Digite un número: ");
            numeros[i] = entrada.nextFloat();
            if(numeros[i]>0){
                positivos += numeros[i];
                contPos++;
            }
            else if(numeros[i]<0){ // si es menor a 0, va sumando negativos
                negativos+= numeros[i];
                contNeg++;
            }
            else{
                conteo0++;
            }
        }
        if(contPos==0){ // si pos quedó en 0..
            System.out.println("\n No se puede sacar la media de num pos");
        }
        else{
            mediaPos = positivos / contPos;
            System.out.println("La media de numeros positivos es: " + mediaPos);
        }

        if(contNeg==0){ // si pos quedó en 0..
            System.out.println("\n No se puede sacar la media de num negativos");
        }
        else{
            mediaNegativos = negativos / contNeg;
            System.out.println("La media de numeros negativos es: " + mediaNegativos);
        }

        System.out.println("La cantidad de  ceros es: " + conteo0);
    }
    
}
