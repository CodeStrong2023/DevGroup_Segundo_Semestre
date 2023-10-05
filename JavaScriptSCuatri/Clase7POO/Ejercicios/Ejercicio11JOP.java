package Ejercicios;

import javax.swing.JOptionPane;

// Diseñar un programa que muestre el prod de los 10 primeros num impares

public class Ejercicio11JOP {
    public static void main(String[] args) {
        long producto = 1; // var local
        for (int i = 1; i<20; i +=2){
            // comienza en uno, suma 2 = 3, 3 +2 5 y asi suce.. hasta llegar al ultimo
            producto *= i; // va calculando el prod de los numeros sumados
        }
        JOptionPane.showMessageDialog(null,"El producto de los numeros impares es: " + producto);
    }
}
