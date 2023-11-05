package Lección2.persona;

public class pruebaPersona {
    public static void main(String[] args) {
        persona persona1;
        persona1 = new persona();
        persona1.nombre = "Enzo";
        persona1.apellido = "Balderrama";
        persona1.obtenerInformacion();
    }
}