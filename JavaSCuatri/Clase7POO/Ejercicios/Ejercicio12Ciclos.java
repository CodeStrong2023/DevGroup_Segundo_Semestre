package Ejercicios;

// Pedir un numero y calcular su factorial.
// Hacerlo en Scanner y JOPtion

// import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio12Ciclos {
    public static void main(String[] args) {
    // Scanner entrada = new Scanner(System.in);
    long factorial = 1;
    // System.out.println("Escriba un numero: ");
    int numero = Integer.parseInt(JOptionPane.showInputDialog("Escriba un número: "));
    for(int i = 1; i <= numero; i++){
        factorial *= i; // calculo del factorial
    }

    // System.out.println("\n El factorial del numero ingresado es: " + factorial);
    JOptionPane.showMessageDialog(null, "El factorial del numero ingresado es: " + factorial);
    }
   // entrada.close();
}
