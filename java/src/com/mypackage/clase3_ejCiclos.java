import java.util.Scanner;

public class clase3_ejCiclos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;
        System.out.println("Escriba un número: ");
        numero = Integer.parseInt(entrada.nextLine());

        while(numero != 0){
            if (numero % 2 == 0){ // mientras esto es T, el num es par
                System.out.println("El numero inresado " + numero + " es par");
            }
            else{
                System.out.println("El numero ingresado: " + numero + " es impar");
            }
            System.out.println("Escriba un numero: ");
            numero = Integer.parseInt(entrada.nextLine());
        }

        System.out.println("El numero 0 termina el programa");
        entrada.close();
    }
}
