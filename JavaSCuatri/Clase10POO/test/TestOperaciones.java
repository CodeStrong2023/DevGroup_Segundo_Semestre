package Clase10POO.test;

import Clase10POO.operaciones.operaciones;

public class TestOperaciones {
    public static void main(String[] args) {
        var resultado = operaciones.sumar(7,9); //inf de tipos
        System.out.println("resultado = " + resultado);

        var resultado2 = operaciones.sumar(5, 7);
        System.out.println("resultado2 = " + resultado2);

        var resultado3 = operaciones.sumar(8, 6L); // muestra el double porq la var es long
        System.out.println("resultado3 = " + resultado3);
    }
}
