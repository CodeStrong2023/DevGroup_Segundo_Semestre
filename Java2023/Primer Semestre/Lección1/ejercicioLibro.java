import java.util.Scanner;

public class ejercicioLibro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona el título del libro: ");
        String titulo = scanner.nextLine();
        System.out.println("Proporciona el autor del libro: ");
        String autor = scanner.nextLine();
        System.out.println(titulo + " fue escrito por: " + autor);
        
}
}
