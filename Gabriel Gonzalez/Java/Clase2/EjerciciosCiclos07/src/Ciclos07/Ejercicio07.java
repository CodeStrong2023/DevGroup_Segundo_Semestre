
package Ciclos07;

import javax.swing.JOptionPane;

public class Ejercicio07 {
    public static void main(String[] args) {
        int numero; //Definimos 4 variables numero,conteo,suma,promedio
        int conteo = 0;
        int suma = 0;
        float promedio = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero:"));
        while (numero >= 0) { //Mientras el numero no sea negativo
            suma += numero;
            conteo++;
           numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero:"));
        }
        if (conteo == 0) {
             JOptionPane.showMessageDialog(null, "Error, la division entre 0 no existe");
        } else {
            promedio =  (float) suma / conteo;
        }
         JOptionPane.showMessageDialog(null, "El promedio es: " + promedio);
    }
    
}
