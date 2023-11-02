
package test;

import dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Osvaldo", 57.000, false );
        System.out.println("persona1 su nombre es: " + persona1.getNombre());
        System.out.println("persona1 = " + persona1);
        
        //Modificar a través de los métodos
        persona1.setNombre("Juan Ignacio");
        //persona1.nombre = "Juan Ignacio"; //Ya no se puede utilizar
        //System.out.println("El nombre es: " + persona1.nombre); //Error
        
        System.out.println("persona1 con su nombre modificado: " + persona1.getNombre());
        System.out.println("persona1 el resultado para su sueldo: " + persona1.getSueldo());
        System.out.println("persona1 para obtener el booleano: " + persona1.isEliminado());
        
        //Tarea: Crear otro objeto de tipo Persona, asignar valores de manera inicial y imprimir
        //Luego modificar sus valores y  volver a imprimir.
    
        Persona persona2 = new Persona("Fernando", 100.000, true);
        System.out.println("Persona2 su nombre es: " + persona2.getNombre());
        System.out.println("Persona2 su sueldo es: " + persona2.getSueldo());
        
       
        //Modifico valores
        persona2.setNombre("Agustín");
        persona2.setSueldo(150.000);
        
        System.out.println("Persona2 con su nombre modificado : " + persona2.getNombre());
        System.out.println("Persona2 con su sueldo modificado: " + persona2.getSueldo());
        System.out.println("Persona2 para obtener el booleano: " + persona2.isEliminado());
        
        System.out.println("persona1 = " + persona1); //Como ya esta definido toString imprime por si solo 
        System.out.println("persona2 = " + persona2);
    }
    
}
