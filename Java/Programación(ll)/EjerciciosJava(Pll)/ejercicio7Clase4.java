import java.util.Scanner;

public class ejercicio7Clase4 {
    //Ejercicio 7: Pedir números hasta que se introduzca uno negativo y calcular la media
    public static void main(String[] args) {
        Scanner enntrada2 = new Scanner(System.in);
        int numeros = 0;  int media;  int suma = 0; int contador = 0;
        System.out.println("Ingrese un número");
        numeros = Integer.parseInt(enntrada2.nextLine());
        while (numeros >= 0) {
            suma+=numeros; 
            contador++;
            System.out.println("Ingrese otro número");
            numeros = Integer.parseInt(enntrada2.nextLine());
         }
        media = suma / contador;



        System.out.println(media);
        enntrada2.close();
    }
}
