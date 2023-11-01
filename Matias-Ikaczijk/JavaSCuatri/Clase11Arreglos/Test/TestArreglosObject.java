package Clase11Arreglos.Test;

import Clase11Arreglos.domain.Persona;

public class TestArreglosObject {
    public static void main(String[] args) {
        Persona personas[] = new Persona[2];
        // Agregamos nuevas referecnias
        personas[0] = new Persona("Matias");
        personas[1] = new Persona("Jorge");
        
        System.out.println("personas 0 = " + personas[0]);
        System.out.println("personas 1 = " + personas[1]);
        
        // Iteracion 
        for(int i = 0; i < personas.length; i++){
            System.out.println("personas " + i + " = " + personas[i]);
        }

        // Arrreglos de sintesis resumida

        String frutas[] = {"Banana", "Pera", "Tomate"};
        for(int i = 0; i < frutas.length; i++){
            System.out.println("Frutas = " + frutas[i]);
        }
    }
}