package Java2023.Leccion5.encapsulamiento.test;

import Java2023.Leccion5.encapsulamiento.dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona = new Persona("Osvaldo", 2000000, false);
        System.out.println("Nombre: " + persona.getNombre());

        // Modificamos a través de los métodos.
        persona.setNombre("Enzo");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Sueldo: " + persona.getSueldo());
        System.out.println("Eliminado: " + persona.isEliminado());
        // TAREA: Crear un objeto de tipo persona, asignar valores de manera inicial e imprimir.
        // Luego modificar sus valores e imprimir nuevamente.
        Persona personaTarea = new Persona("Rocio", 157000, false);
        System.out.println("Nombre: " + personaTarea.getNombre());
        System.out.println("Sueldo: " + personaTarea.getSueldo());
        System.out.println("Eliminado: " + personaTarea.isEliminado());
        personaTarea.setNombre("Matías");
        personaTarea.setSueldo(233000);
        personaTarea.setEliminado(true);
        System.out.println("Nombre: " + personaTarea.getNombre());
        System.out.println("Sueldo: " + personaTarea.getSueldo());
        System.out.println("Eliminado: " + personaTarea.isEliminado());
        System.out.println("Persona 1: "+persona);
    }
}
