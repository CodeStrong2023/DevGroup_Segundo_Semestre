package Lección1;

import java.util.Scanner;

public class Clase8EjercicioRectangulo {
    public static void main(String[]args) {
        
        //Ejercicio: Rectángulo
        Scanner scannerRectan = new Scanner(System.in);
        System.out.println("Digite la altura del rectángulo = ");
        var alto = Integer.parseInt (scannerRectan.nextLine());
        System.out.println("Digite el ancho del rectángulo = ");
        var ancho = Integer.parseInt (scannerRectan.nextLine());
        //Fórmula:

        var area = alto * ancho;
        var perimetro = (alto + ancho) * 2;
        System.out.println("El área del rectangulo es = " + area);
        System.out.println("El perímetro del rectangulo es = " + perimetro); 
                                                                                */ 
        //Ejercicio: El mayor de 2 números con operador ternario
          Scanner scannernumero = new Scanner(System.in);
        System.out.println("Digite un número: ");
        var numero1 = Integer.parseInt(scannernumero.nextLine());
        System.out.println("Vuelva a digitar otro número: ");
        var numero2 = Integer.parseInt(scannernumero.nextLine());

        var resultadoN = (numero1 > numero2) ? numero1 : numero2;
        System.out.println("El número mayor es = " + resultadoN);



    }
}
