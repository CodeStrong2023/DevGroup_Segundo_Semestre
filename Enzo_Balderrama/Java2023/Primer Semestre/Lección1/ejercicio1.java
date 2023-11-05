import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Proporciona el título del libro: ");
        String titulo = entrada.nextLine();
        System.out.println("Proporciona el ID del libro: ");
        int ID = Integer.parseInt(entrada.nextLine());
        System.out.println("Digite el precio del libro: ");
        double precio = Double.parseDouble(entrada.nextLine());
        System.out.println("Confirme si el envío es gratuito: ");
        boolean envioGratis = Boolean.parseBoolean(entrada.nextLine());

        System.out.println(titulo + " #" + ID);
        System.out.println("Precio: $" + precio);
        System.out.println("El envío es gratuito: " + envioGratis);
    }
}