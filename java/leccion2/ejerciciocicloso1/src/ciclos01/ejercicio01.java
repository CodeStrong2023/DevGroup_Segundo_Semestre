/*
Ejercicio 1: leer un numero y mostrar su cuadrado, repetir 
el proceso hasta que se introduzca un numero negativo 
*/
import javax.swing.JOptionPane;

public class ejercicio01 {
    public static void main(String[] args) {
        int numero, cuadrado;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));

        while (numero >= 0) { // Mientras el número sea cero o positivo
            cuadrado = numero * numero;
            System.out.println("El número " + numero + " elevado al cuadrado es: " + cuadrado);
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));
        }

        System.out.println("El programa ha finalizado debido a un número negativo.");
    }
}
