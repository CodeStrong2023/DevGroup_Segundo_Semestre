package Clase3Completa;
import javax.swing.JOptionPane;

// Pedir numeros hasta que se teclee uno negativo y mostrar
// cuantos num se ingresaron 

public class Ejercicio4JOption {
    public static void main(String[] args) {
        int numero, conteo = 0;

      numero = Integer.parseInt(JOptionPane.showInputDialog("Escriba un numero: "));

      while (numero >= 0){
        JOptionPane.showMessageDialog(null,"El numero: " + numero + " es positivo");
        conteo++; // realiza el conteo de cada num ingresado
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Escriba otro numero: ")); // vuelve a pedir el num
      }
      // ingresa un negativo y sale del ciclo
      JOptionPane.showMessageDialog(null,"A ingresado: " + conteo + " numeros que no son negativos");
    }
}
 