package Leccion9.Arreglos;

import javax.swing.JOptionPane;

/*
 * Ejercicio 3: Leer 5 números por teclado, almacenarlos en 
 * un arreglo y a continuación realizar la media de los
 * números positivos, la media de los números negativos y
 * contar el número de ceros
 */

public class Ejercicio3 {
    public static void main(String[] args) {
        int neg = 0, pos = 0, ceros = 0;
        int sumaneg = 0, sumapos = 0;
        int numeros[] = new int[5];
        for (int i = 0; i < numeros.length; i++) {
           numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(i + " - Digite un numero"));
           if (numeros[i] < 0){
            neg++;
            sumaneg += numeros[i];
           } else if (numeros[i] > 0) {
            pos++;
            sumapos += numeros[i];
           } else {
            ceros++;
           }
        }
        System.out.println("La media de los numeros positivos es: " + sumapos/pos);
        System.out.println("La media de los numeros negativos es: " + sumaneg/neg);
        System.out.println("La cantidad de ceros es: " + ceros);

    }
}
