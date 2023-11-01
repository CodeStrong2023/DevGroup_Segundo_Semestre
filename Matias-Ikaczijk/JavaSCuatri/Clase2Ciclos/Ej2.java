package Clase2Ciclos;
// Ejercicio 1 de ciclos en Java sin la clase Scanner
// Leer un numero y mostrar su cuadrado, hasta que ingrese un numero negativo
import javax.swing.JOptionPane;

public class Ej2 {
    public static void main(String[] args) {
        int numero, cuadrado;
        // JOptionPane, ofrece una ventana emergente mostrando el texto
        numero = Integer.parseInt(JOptionPane.showInputDialog("Escriba un numero: "));
       
        while(numero >=0){
            cuadrado = (int)Math.pow(numero, 2);
            System.out.println("El numero "+numero+" elevado al cuadrado es: "+cuadrado);
            
            numero = Integer.parseInt(JOptionPane.showInputDialog("Escriba otro numero: "));
        }
        System.out.println("El programa ha finalizado por un numero negativo");   
        
    }
    
}
