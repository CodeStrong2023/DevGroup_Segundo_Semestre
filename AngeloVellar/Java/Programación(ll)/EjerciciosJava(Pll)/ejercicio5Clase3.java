import java.util.Scanner;

public class ejercicio5Clase3 {
    public static void main(String[] args) {
        //Ejercicio 5: Realizar un juego para adivinar un número, para ello generar un número aleatorio entre
        //0-100 y luego ir pidiendo números indicando "es mayor" o "es menor". Termina cuando el usuario acierta y mostramos
        //el numero de intentos hechos.
        Scanner entrada1 = new Scanner(System.in);
        int numero,aleatorio,conteo = 0;
        aleatorio = (int) (Math.random()*100); //Esto va generar el número aleatorio

        do {
            System.out.print("Digite un número: ");
            numero = Integer.parseInt(entrada1.nextLine());
            if (numero > aleatorio) {
                System.out.println("El número es menor");
            }
            else if (numero < aleatorio) {
                System.out.println("El número es mayor");
            }
            conteo++;
        } while (numero != aleatorio);
        
        System.out.println("¡¡¡¡FELICIDADES HA ADIVINADO EL NÚMERO!!!!");
        System.out.println("Después de "+conteo+" intentos");
        entrada1.close();
    }
}
