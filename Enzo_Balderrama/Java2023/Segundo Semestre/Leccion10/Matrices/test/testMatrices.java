package Leccion10.Matrices.test;

import Leccion10.Matrices.domain.Persona;

public class testMatrices {
    public static void main(String[] args) {
        int edades[][] = new int[3][2];
        System.out.println("edades = " + edades);
        edades[0][0] = 5;
        edades[0][1] = 7;
        edades[1][0] = 8;
        edades[1][1] = 4;
        edades[2][0] = 14;
        edades[2][1] = 13;
        System.out.println("edades[0][0] = " + edades[0][0]);
        System.out.println("edades[0][1] = " + edades[0][1]);
        System.out.println("edades[1][0] = " + edades[1][0]);
        System.out.println("edades[1][1] = " + edades[1][1]);
        System.out.println("edades[2][0] = " + edades[2][0]);
        System.out.println("edades[2][1] = " + edades[2][1]);
        System.out.println("Recorremos la matriz a partir del ciclo for: ");
        for (int i = 0; i < edades.length; i++) {
            for (int j = 0; j < edades[i].length; j++) {
                System.out.println("edades["+ i +"]["+ j +"]: "+ edades[i][j]);
            }
        }
        // Sintaxis clásica
        // String frutas[][] = new String[3][2];

        // Sintaxis simplificada
        String frutas[][] = {{"Limon", "Pomelo"},{"Ciruela", "Kiwi"}, {"Banana", "Manzana"}};
        // for (int i = 0; i < frutas.length; i++) {
        //     for (int j = 0; j < frutas[i].length; j++) {
        //         System.out.println("frutas["+ i +"]["+ j +"]: "+ frutas[i][j]);
        //     }
        // }
        imprimir(frutas);

        Persona personas[][] = new Persona[2][3];
        personas[0][0] = new Persona("Enzo");
        personas[0][1] = new Persona("Ariel");
        personas[0][2] = new Persona("Marcos");
        personas[1][0] = new Persona("Matias");
        personas[1][1] = new Persona("Ale");
        personas[1][2] = new Persona("Gabriel");
        imprimir(personas);

    }

    public static void imprimir(Object matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Matriz["+ i +"]["+ j +"]: "+ matriz[i][j]);
            }
        }
    }
}
