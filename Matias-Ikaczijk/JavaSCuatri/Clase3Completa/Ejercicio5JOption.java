package Clase3Completa;

import javax.swing.JOptionPane;

// Realizar un juego para adivinar el numero, para ello
// generar un numero aleatorio entre 0-100 y luego ir pidiendo
// numeros indicando "es mayor" o "menor", segun sea mayor o menor
// con respecto a N. Termina cuando el usuario acierta y mostramos la cant de intentos

public class Ejercicio5JOption {
    public static void main(String[] args) {
        int numero, aleator, cont = 0;
        /// generar un num aleatorio 
        aleator = (int)(Math.random()*100); // conv a entero, genera un aleatorio

        do{
             numero = Integer.parseInt(JOptionPane.showInputDialog("Escriba un numero: "));
            /// una vez que ingresa el num:

            if(numero < aleator){
                JOptionPane.showMessageDialog(null,"Ingrese un numero mayor");
            }
            else if(numero > aleator){
                JOptionPane.showMessageDialog(null,"Ingrese un numero menor");
            }
            else{ // se nuestra una vez que acierta el num
                JOptionPane.showMessageDialog(null,"¡FELICIDADES! Acertaste");
            }
            cont++;
        } while(numero != aleator); // repetir hasta q num sea distinto de aleatorio
       JOptionPane.showMessageDialog(null,"Adivinaste el numero " + aleator + " en: " + cont + " intentos");
    }
}
