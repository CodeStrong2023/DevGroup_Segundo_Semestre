package Clase6POO;
import javax.swing.JOptionPane;

//  Ejercicio 10 : Pedir 10 números y escribir la suma total

public class ciclo10JOP {
    public static void main(String[] args) {
        int numero, suma = 0;
        for(int i = 1; i <= 10; i ++){
            
            numero = Integer.parseInt(JOptionPane.showInputDialog("Escriba un numero: "));
            suma += numero;
        }
        JOptionPane.showMessageDialog(null,"La suma de todos los numeros es: "+ suma);
    }
}
