
public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona(); // Llamamos al constructor
        persona1.nombre = "Marcos";
        persona1.apellido = "Martos";
        persona1.obtenerInformacion();

        Persona persona2 = new Persona();
        persona2.nombre = "Carla";
        persona2.apellido = "Richiardi";
        persona2.obtenerInformacion();
    }
}
