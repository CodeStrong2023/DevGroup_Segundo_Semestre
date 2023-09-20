import java.util.Scanner;

public class clase3_ej4 {
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      int numero, conteo = 0;

      System.out.println("Escriba un número: ");
      numero = Integer.parseInt(entrada.nextLine());

      while (numero >= 0){
        System.out.println("El numero: " + numero + " es positivo");
        conteo++; // realiza el conteo de cada num ingresado
        System.out.println("Escriba otro numero: ");
        numero = Integer.parseInt(entrada.nextLine()); // vuelve a pedir el num
      }
      // ingresa un negativo y sale del ciclo
      System.out.println("A ingresado: " + conteo + " numeros que no son negativos");
      entrada.close();
    }
}
