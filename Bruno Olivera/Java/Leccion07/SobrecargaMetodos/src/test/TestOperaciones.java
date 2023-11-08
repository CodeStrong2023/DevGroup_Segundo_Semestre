
package test;

import operaciones.Operaciones;

public class TestOperaciones {
    public static void main(String[] args) {
        double resultado = Operaciones.sumar(7, 9);
        System.out.println("resultado = " + resultado);
        
        double resultado2 = Operaciones.sumar(5.0, 7);
        System.out.println("resultado2 = " + resultado2);
        
        double resultado3 = Operaciones.sumar(7, 6L);
        System.out.println("resultado3 = " + resultado3);
    }
}
