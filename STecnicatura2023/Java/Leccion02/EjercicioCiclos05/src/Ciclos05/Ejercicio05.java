/*
Ejercicio 5: realizar un juego para advininar un numero,
para ello generar un numero aleatorio entre 0-100, y 
luego ir pidiendo numeros indicando "es mayor" o 
"es menor" segun sea mayor o menos con respecto a N
el proceso termina cuando el usuario acierta y mostramos
el numero de intentos hechos.
*/
package Ciclos05;

import javax.swing.JOptionPane;

public class Ejercicio05 {
      public static void main(String[] args) {
       
        int numero, conteo = 0, aleatorio = 0;
        aleatorio = (int)(Math.random()*100); //esto genera un numero aleatorio
        do {
            
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero: "));
            if (numero<aleatorio){
                JOptionPane.showMessageDialog(null, "Digite un numero mayor");
            } else if (numero>aleatorio){
                JOptionPane.showMessageDialog(null, "Digite un numero menor");
            } else {
                JOptionPane.showMessageDialog(null, "FELICIDADES! Has acertado el numero");
            }
            conteo++;
        } while(numero!=aleatorio);
        JOptionPane.showMessageDialog(null, "Adivinaste el numero en " + conteo + " intentos");
    }
}
