package Leccion7.test;

import Leccion7.SobrecargaMetodos.Operaciones;

public class TestOperaciones {
    public static void main(String[] args) {
        var resultado = Operaciones.sumar(7, 9);
        System.out.println("resultado = " + resultado);

        var resultado2 = Operaciones.sumar(5.0, 3);
        System.out.println("resultado2 = " + resultado2);

        var resultado3 = Operaciones.sumar(5, 6L);
        System.out.println("resultado3 = " + resultado3);
   
    }
}
