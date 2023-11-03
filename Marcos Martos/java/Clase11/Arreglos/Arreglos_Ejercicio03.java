package Clase11.Arreglos.Test;

import java.util.Scanner;

/*
 * Ejercicio 3: Leer 5 números por teclado, almacenarlos en 
 * un arreglo y a continuación realizar la media de los
 * números positivos, la media de los números negativos y
 * contar el número de ceros
 */


public class Arreglos_Ejercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float numeros[]= new float[5];
        float negativos = 0, positivos = 0, mediaNegativos, mediaPositivos;
        int conteo0 = 0, conteo_negativos = 0, conteo_positivos = 0;


        System.out.println("Guardando los datos en el arreglo");
        for(int i = 0; i < 5; i++){
            System.out.println((i + 1)+ ". Digite un número: ");
            numeros[i] = entrada.nextFloat();
            if(numeros[i] > 0) {
                positivos += numeros[i];
                conteo_positivos++;
            }else if(numeros[i] < 0){
                negativos += numeros[i];
                conteo_negativos++;
            }else{
                conteo0++;
            }
        }

        if(conteo_positivos == 0){
            System.out.println("\n No se puede sacar la media de los números positivos");
        }else{
            mediaPositivos = positivos/conteo_positivos;
            System.out.println("\n La media de los numeros positivos es: "+mediaPositivos);
        }

          if(conteo_negativos == 0){
            System.out.println("\n No se puede sacar la media de los números negativos");
        }else{
            mediaNegativos = negativos/conteo_negativos;
            System.out.println("\n La media de los numeros positivos es: "+mediaNegativos);
        }

        System.out.println("\n La cantidad de ceros es: "+conteo0);


    }
}
