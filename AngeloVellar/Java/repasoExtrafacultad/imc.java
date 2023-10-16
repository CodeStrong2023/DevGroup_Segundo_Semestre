package repasoExtrafacultad;

import java.util.Scanner;

public class imc {
    public static void main(String[] args) {
    //Peso en kg /altura en metros al cuadrado
        //Mayor a 30 -> Obesidad
        //Entre 25 y 30 sobrepeso
        //Entre 18.5 y 25 normal
        //Menor a 18.6 debajo del normal
        Scanner consol1 = new Scanner(System.in);
        System.out.println("Ingrese su peso expresado en kg: ");
        int peso = Integer.parseInt(consol1.nextLine());
        System.out.println("Ingrese su altura expresada en m: ");
        double altura = Double.parseDouble(consol1.nextLine());
        double imc = peso / (altura * altura);
        System.out.println("Su indice de masa corporal es :" + imc);
        //Acá hacemos una estructura if para saber si tiene sobrepeso,obesidad o normal
        if (imc > 30) {
            System.out.println("Usted padece obesidad");
            }
        else if (imc > 25 && imc <= 30) {
            System.out.println("Usted pedece de sobrepeso");
            }
        else if (imc >= 18.5 && imc <= 25) {
            System.out.println("Usted posee un IMC normal");
            }
        else if (imc < 18.6 && imc >= 0) {
            System.out.println("Usted tiene un IMC bajo");
            }
        else {
            System.out.println("A ingresado un valor no valido: ");
        }


  }
}   
