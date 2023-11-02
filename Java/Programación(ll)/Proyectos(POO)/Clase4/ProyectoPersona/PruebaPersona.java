package ProyectoPersona;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona(); //LLamamos al constructor
        persona1.nombre = "Angelo";
        persona1.apellido = "Vellar";
        persona1.ObtenerInformacion();

        Persona persona2 = new Persona();
        System.out.println("Persona2 = " + persona2 );
        System.out.println("persona1 = " + persona1);
        persona2.ObtenerInformacion();
        persona2.nombre = "Osvaldo";
        persona2.apellido = "Giordanini";
        persona2.ObtenerInformacion();
            
        
    }
}
