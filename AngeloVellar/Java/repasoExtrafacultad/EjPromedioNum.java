package repasoExtrafacultad;

import java.util.Scanner;

public class EjPromedioNum {
    public static void main(String [] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingrese el primer número:");
        var numero1 = Integer.parseInt(consola.nextLine());
        System.out.println("Ingrese el segundo número: ");
        var numero2 = Integer.parseInt(consola.nextLine());
        System.out.println("Digite el tercer número: ");
        var numero3 = Integer.parseInt(consola.nextLine());
        //Función
        calculoPromSum(numero1,numero2,numero3);
    }

    private static void calculoPromSum(Integer numero1, Integer numero2, Integer numero3){
        Integer suma = numero1 + numero2 + numero3;
        Double promedio = Double.valueOf(suma) / 3;
        System.out.println("El número promedio es: " + promedio);
    }     
}
