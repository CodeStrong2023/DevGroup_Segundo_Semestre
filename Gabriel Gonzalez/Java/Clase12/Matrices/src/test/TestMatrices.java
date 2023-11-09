
package test;

import domain.Persona;

public class TestMatrices {
    public static void main(String[] args) {
        int edades [][] = new int [3][2];
        System.out.println("edades = " + edades);
        edades[0][0] = 5; //Llenado manual 
        edades[0][1] = 7; //Es una diferente columna
        edades[1][0] = 8;
        edades[1][1] = 4;
        edades[2][0] = 10; //Terminamos la tarea
        edades[2][1] = 9;
        
        System.out.println("edades 0-0 = " + edades[0][0]);
        System.out.println("edades 0-1 = " + edades[0][1]);
        System.out.println("edades 1-0 = " + edades[1][0]);
        System.out.println("edades 1-1 = " + edades[1][1]);
        System.out.println("edades 2-0 = " + edades[2][0]);
        System.out.println("edades 2-1 = " + edades[2][1]);
        
        System.out.println("Recorremos la matriz atravéz del ciclo for: ");
        for (int fila = 0; fila < edades.length; fila++) {
            for (int col = 0; col < edades[fila].length; col++) {
                System.out.println("edades " + fila + "-" + col + ": " + edades[fila][col]);
            }
            
        }
        
        //Sintaxis clásica
        //String frutas [][] = new String[3][2]; 
        
        //Sintaxis simplificada
        String frutas[][] = {{"Limon", "Pomelo"},{"Ciruela", "Kiwi"}, {"Banana", "Manzana"}};
        imprimir(frutas);
       
//        for (int i = 0; i< frutas.length; i++) {
//            for (int j = 0; j < frutas[i].length; j++) {
//                System.out.println("frutas " + i + "-" + j + ": " + frutas[i][j]);
//            }
//        }
        //Creamos una matriz de objetos
        Persona personas [][] = new Persona[2][3];
        
        //Asignamos valores a la matriz
        personas[0][0] = new Persona("Gabriel");
        personas[0][1] = new Persona("Eugenia");
        personas[0][2] = new Persona("Juani");
        personas[1][0] = new Persona("Emanuel");
        personas[1][1] = new Persona("Facundo");
        personas[1][2] = new Persona("Fernando");
//        System.out.println("persona 0 = " + persona [0][0]);
//        System.out.println("persona 1 = " + persona [0][1]);
//        System.out.println("persona 2 = " + persona [0][2]);
//        System.out.println("persona 3 = " + persona [1][0]);
//        System.out.println("persona 4 = " + persona [1][1]);
//        System.out.println("persona 5 = " + persona [0][2]);
        imprimir(personas);
    } 
    
    public static void imprimir(Object matriz[][]){
        for (int i = 0; i< matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("matriz " + i + "-" + j + ": " + matriz[i][j]);
            }
         }
    }       
}
