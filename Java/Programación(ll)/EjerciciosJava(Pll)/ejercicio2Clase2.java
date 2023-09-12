import java.util.Scanner;

public class ejercicio2Clase2 {
    public static void main(String[] args) {
        
        Scanner consol2 = new Scanner(System.in);
        int num;
        System.out.print("Introduzca un número:");
        num = Integer.parseInt(consol2.nextLine());
        while (num != 0 ) {
            if (num > 0) {
                System.out.println("El número" + num + "es positivo");
            }
            else if (num < 0 ) {
                System.out.println("El número" + num + "es negativo");

            }
            System.out.println("Digite otro número");
            num = Integer.parseInt(consol2.nextLine());
        }
        System.out.println("El programa a finalizado");

        consol2.close();
    }
}
