package Leccion2;
                /* Ejercicio3: Sistema Calificaciones con sentencia de control switch */
import java.util.Scanner;

public class Clase10Ejercicio3Switch {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un número del 0 al 10: ");
        var calificacion = Integer.parseInt(entrada.nextLine());
        switch(calificacion) {
            case 10: case 9:
            System.out.println("A");
            break;
            case 8:
            System.out.println("B");
            break;
            case 7:
            System.out.println("C");
            break;
            case 6:
            System.out.println("D");
            break;
            case 5: case 4: case 3: case 2: case 1: case 0:
            System.out.println("F");
            break;
            default:
            System.out.println("Se encuentra fuera de rango");

        }
    }
}
