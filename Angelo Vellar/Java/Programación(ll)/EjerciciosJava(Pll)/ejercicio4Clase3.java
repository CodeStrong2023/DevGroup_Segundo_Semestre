import java.util.Scanner;

public class ejercicio4Clase3 {
    public static void main(String[] args) {
        //Ejercicio 4: Pedir números hasta que se teclee uno negativo y mostrar
        //cuantos números se han introducido.
        //Lo hacemos primero con la clase Scanner y con JoptionPane
        Scanner consol1 = new Scanner(System.in);
        int numeros, contador = 0;
        System.out.print("Ingrese un número: ");
        numeros = Integer.parseInt(consol1.nextLine());
        while (numeros >= 0 ) {
            System.out.print("Vuelva a ingresar otro número: ");
            numeros = Integer.parseInt(consol1.nextLine());
            contador++;
        }
        System.out.println("Se han introducido: "+ contador +" números");
       
        consol1.close();
    }

}
