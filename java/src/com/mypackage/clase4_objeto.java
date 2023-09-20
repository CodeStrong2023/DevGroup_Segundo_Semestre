public class clase4_objeto {
    public static void main(String[] args) {
        Persona persona1;
        persona1 = new Persona();
        persona1.nombres = "Juan";
        persona1.apellidos = "Quiles";

        persona1.ObtenerInformacion();

        Persona persona2 = new Persona();
        System.out.println("persona2 = " + persona2);
        System.out.println("persona1 = " + persona1);

        persona2.ObtenerInformacion();

        persona2.nombres = "Leo";
        persona2.apellidos = "Messi";
        persona2.ObtenerInformacion();
    }
}
