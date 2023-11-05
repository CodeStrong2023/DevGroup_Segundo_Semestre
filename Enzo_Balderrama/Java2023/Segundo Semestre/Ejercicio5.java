/*
 * Ejercicio 5: Realizar un juego para adivinar un numero, para ello
 * generar un número aleatorio entre 0-100 y luego ir pidiendo números indicando,
 * "Es mayor" o "Es menor" según sea mayor o menor con respecto a N. El juego termina
 * cuando el usuario acierta y mostramos el numero de intentos.
 */

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Ejercicio5 {
    public static void main(String[] args) {
        int numero, N, i; // Donde N es el numero a hallar e i el número de intentos.
        N = (int)(Math.random()*(100+1)); i = 0;
        JOptionPane.showMessageDialog(null, "BIENVENIDO", "Adivina el número", JOptionPane.PLAIN_MESSAGE, new ImageIcon("C:\\Users\\enzo_\\Segundo_Semestre\\DevGroup_Segundo_Semestre\\Java2023\\Segundo Semestre/DEV.jpg"));
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        do {
            if (numero>N){
                System.out.println("Error! El número es menor.");
                i++;
            } else if (numero<N){
                System.out.println("Error! El número es mayor.");
                i++;
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número: "));
        } while (numero!=N);
        if(numero==N){
            System.out.println("Felicidades! El número es: "+ numero+ ". Has adivinado! Cantidad de intentos: "+ i);
        }
    }
}
