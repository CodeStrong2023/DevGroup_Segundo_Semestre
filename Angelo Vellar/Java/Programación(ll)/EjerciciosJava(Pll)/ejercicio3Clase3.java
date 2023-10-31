import java.util.Scanner;

public class ejercicio3Clase3 {
    public static void main(String[] args) {
        //Leer números hasta que se introduzca un cero, Para cada uno indicar si es par o impar.
        //Primero lo haremos con la clase Scanner, luego con JoptionPane
        Scanner consol = new Scanner(System.in);
        int num;
        System.out.print("Ingrese un número: ");
        num = Integer.parseInt(consol.nextLine());
        while (num != 0) {
            if (num % 2 == 0) {
                System.out.println("El número: "+ num +" Es par");
            }
            else {
                System.out.println("El número " + num +" Es impar");
            }
             System.out.println("Vuelva a ingresar otro número");
             num = Integer.parseInt(consol.nextLine());
        }
        System.out.println("El programa a finalizado");

consol.close();
    }
}
