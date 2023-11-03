package Encapsulamiento.test;

import Encapsulamiento.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Marcos", 120000, false);

         System.out.println("Persona1 su nombre es: "+persona1.getNombre());

        // Modificar a través de los métodos
        persona1.setNombre("Franco");
        // persona1.nombre = "Franco"; // Ya no se puede utilizar
        // System.out.println("Nombre es: "+persona1.nombre); // Error
        System.out.println("Persona1 con su nombre modificado: "+persona1.getNombre());
        System.out.println("Persona1 sueldo: "+persona1.getSueldo());
        System.out.println("Persona1 booleano: "+persona1.isEliminado());

        System.out.println("persona1 = "+persona1); // Usa toString automaticamente
        // System.out.println("persona1: "+persona1.toString());


        // Tarea: Crear otro objeto persona y mostrarlo con valores iniciales y modificado

        Persona persona2 = new Persona("Matias", 20000, false);

            System.out.println("Persona2 su nombre es: "+persona2.getNombre());

        // Mostrar
        System.out.println("Persona2 nombre: "+persona1.getNombre());
        System.out.println("Persona2 sueldo: "+persona1.getSueldo());
        System.out.println("Persona2 booleano: "+persona1.isEliminado());

        // Modificar 
        persona2.setNombre("José");
        persona2.setSueldo(30000);;
        persona2.isEliminado();

        // Mostrar
        System.out.println("Persona2 nombre: "+persona2.getNombre());
        System.out.println("Persona2 sueldo: "+persona2.getSueldo());
        System.out.println("Persona2 booleano: "+persona2.isEliminado());


    }
}
