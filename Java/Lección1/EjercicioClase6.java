package Lección1;

import java.util.Scanner;

public class EjercicioClase6 {
    public static void main(String[] args) {

        Scanner consola2 = new Scanner(System.in);
        System.out.println("Ingrese los siguientes datos del libro: ");
        System.out.print("Nombre: ");
        var nombreLibro = consola2.next();
        System.out.print("ID:");
        var id = consola2.next();
        System.out.print("Precio:");
        var precioLibro = Integer.parseInt(consola2.next());
        
        System.out.println("Nombre de libro solicitado: " + nombreLibro);
        System.out.println("ID del libro: " + id);
        System.out.println("Precio del libro: " + precioLibro);
        if (precioLibro > 2000) {
            System.out.print("El envio es gratuito sin costo");
        }
        else {
            System.out.println("Precio del envio: $800");
        }
       
    }
}
