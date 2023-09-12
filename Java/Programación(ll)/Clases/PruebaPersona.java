package Clases;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona(); //LLamamos al constructor
        persona1.nombre = "Angelo";
        persona1.apellido = "Vellar";
        persona1.ObtenerInformacion();

        Persona persona2 = new Persona();
        System.out.println("Persona2 = " + persona2 );
    }
}
