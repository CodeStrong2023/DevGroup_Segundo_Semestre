import java.util.Scanner;

public class clase4_ej6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero, suma = 0;
        do{
            System.out.println("Ingrese un numero: ");
            numero = Integer.parseInt(entrada.nextLine());
            suma+= numero;

        }while(numero != 0);
        System.out.println("La suma de todos los num ingresados es: " + suma);
        entrada.close();
    }
}
