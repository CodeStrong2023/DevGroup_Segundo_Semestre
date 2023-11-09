
package Clases;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona(); //llamamos al constructor
        persona1.nombre = "Bruno";
        persona1.apellido = "Olivera";
        persona1.obtenerInformacion();
        
        Persona persona2 = new Persona();
        System.out.println("persona2 = " + persona2);
        System.out.println("persona1 = " + persona1);
        persona2.obtenerInformacion();
        persona2.nombre = "Osvaldo";
        persona2.apellido = "Giordanini";
        persona2.obtenerInformacion();
    }
}
