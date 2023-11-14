package Leccion10.Matrices.test;

import Leccion9.Arreglos.domain.Persona;

public class testArreglosObject {
    public static void main(String[] args) {
        Persona personas[] = new Persona[2];
        personas[0] = new Persona("Enzo");
        personas[1] = new Persona("Ariel");
        System.out.println("Persona[0] = " + personas[0]);
        System.out.println("Persona[1] = " + personas[1]);

        for(int i = 0; i < personas.length; i++){
            System.out.println("personas["+ i +"] = "+ personas[i]);
        }

        String frutas[] = {"Banana", "Pera", "Durazno"};
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("Frutas["+ i +"] = " + frutas[i]);
        }


    }
    
}
