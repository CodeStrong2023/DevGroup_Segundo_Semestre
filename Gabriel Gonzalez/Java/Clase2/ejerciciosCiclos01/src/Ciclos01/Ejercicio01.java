
package Ciclos01;

import javax.swing.JOptionPane;



public class Ejercicio01 {
    public static void main(String[] args) {
       
        int numero, cuadrado;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
    
        while (numero >= 0){//Mientras el numero sea igual a 0 o positivo
            cuadrado = (int)Math.pow(numero, 2);
            System.out.println("El numero "+numero+" elevado al cuadrado es: " +cuadrado);
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        }
          System.out.println("El programa a finalizado por numero negativo");
    }
    
}
