import java.util.Scanner;

public class buscadorPaises {
    public static void main(String[]args) {
        Scanner consol1 = new Scanner(System.in);
        System.out.println("Ingrese el nombre del país que quiere buscar: ");
        var pais = consol1.nextLine();
        System.out.println("https://www.google.com/maps/search/" + pais);
        


    }
}
