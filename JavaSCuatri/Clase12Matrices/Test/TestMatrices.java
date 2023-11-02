package Clase12Matrices.Test;

import Clase10POO.Domain.Persona;

public class TestMatrices {
    public static void main(String[] args) {
        // Matriz, arreglo de arreglo. tiene filas y columnas 
        int edades[][] = new int[3][2]; // def variable, instanciamos
        System.out.println("edades = " + edades);

        // modificamos valores..
        edades[0][0] = 5;
        edades[0][1] = 7;
        edades[1][0] = 8;
        edades[1][1] = 4;
        edades[2][0] = 1;
        edades[2][1] = 2;

        System.out.println("edades 0-0 = " + edades[0][0]);
        System.out.println("edades 0-1 = " + edades[0][1]);
        System.out.println("edades 1-0 = " + edades[1][0]);
        System.out.println("edades 1-1 = " + edades[1][1]);
        System.out.println("edades 2-0 = " + edades[2][0]);
        System.out.println("edades 2-1 = " + edades[2][1]);

        // Iteramos
        System.out.println("Recorremos la matriz mediante el ciclo for: ");
        for(int fila = 0; fila < edades.length; fila++){ // recorre filas
            for(int columnas = 0; columnas < edades[fila].length; columnas++){ // recorre columnas
                System.out.println("edades " + fila + " - " + columnas + " : " + edades[fila][columnas]);
            }
        }

        // Manejo de matrices
        // String frutas[][] = new String[3][2]; //sintaxis clasica
        
        // sintaxis simplif:
        String frutas[][] = {{" Limon" , " Pomelo"}, {" Ciruela", " Pera"}, {" Banana", " Manzana"}};
        for(int i = 0; i < frutas.length; i++){
            for(int j = 0; j < frutas[i].length;j++){
                System.out.println("frutas " + i + " : " + j + " = " + frutas[i][j]);
            }
        } 

        // utilizamos la clase persona. Matriz de objetos

        Persona personas[][] = new Persona[2][3];
        personas[0][0] = new Persona("Matias"); // asignamos valores
        personas[0][1] = new Persona("Nicolas");
        personas[0][2] = new Persona("Juan");
        personas[1][0] = new Persona("Esteban");
        personas[1][1] = new Persona("Carlos");
        personas[1][2] = new Persona("Jose");

        System.out.println("Matriz de personas: ");
        imprimir(personas);

    }
    public static void imprimir(Object matriz[][]){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length;j++){
                System.out.println("matriz " + i + " : " + j + " = " + matriz[i][j]);
            }
        } 
    }
}
