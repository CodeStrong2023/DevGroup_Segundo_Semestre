
package test;
import dominio.Persona;
public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Osvaldo",57000,false);
        
        //modificar a traves de los metodos
        persona1.setNombre("Juan Ignacio");
        // persona1.nombre = "Juan Ignacio"; ya no se puede utilizar
        // System.out.println("Nombre es: " + persona1.nombre); error
        System.out.println("persona1 su nombre es: " + persona1.getNombre());
        System.out.println("persona1 su sueldo es: " + persona1.getSueldo());
        System.out.println("persona1 su boolean es: " + persona1.isEliminado());
        
        System.out.println("persona1: " + persona1);
    }
}
