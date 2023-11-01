package Encapsulamiento.TestPersonaClase8;

import Encapsulamiento.Persona;
public class PersonaPrueba {
    public static void main(String[] args) {
        Persona Persona1 = new Persona("Nicolas", 57000, false);
        System.out.println("Persona1 su nombre es: " + Persona1.getNombre());
        System.out.println("Persona1: " + Persona1.toString());
        // Modificar a traves de set
        Persona1.setNombre("Juan Ignacio");
        System.out.println("Persona1 con su nombre modificado es: " + Persona1.getNombre());
        System.out.println("Persona1, su sueldo es: " + Persona1.getSueldo());
        System.out.println("Persona1 para obtener el bolleano es: " + Persona1.isEliminado());

        // TAREA: Crear otro objeto de tipo Persona, asignar valores de manera inical, imprimir, modificar valores y volver a imprimir

        Persona Persona2 = new Persona("Azucena", 58000, false);
        System.out.println("Persona2 su nombre es: " + Persona2.getNombre());
        // Modificar a traves de set
        Persona2.setNombre("Anastacia");
        System.out.println("Persona2 con su nombre modificado es: " + Persona2.getNombre());
        System.out.println("Persona2, su sueldo es: " + Persona2.getSueldo());
        System.out.println("Persona2 para obtener el bolleano es: " + Persona2.isEliminado());

        // Metodo toString --> permite imprimir el estado del objeto qe estemos creando, en cualq momento..
        System.out.println("Persona1: " + Persona1.toString());

    }
}
