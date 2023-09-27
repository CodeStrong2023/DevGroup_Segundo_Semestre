public class clase6_pasoPorRef {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Juan";
        System.out.println("persona1 nombre: "+persona1.nombre);
        cambiarValor(persona1);
        System.out.println("Cambios: "+persona1.nombre);
        persona1 = cambiarElValor(persona1);
        Persona persona2 = new Persona();
        persona2 = cambiarElValor(persona2);
        System.out.println("Nuevo valor: "+persona2.nombre);

    }

    public static void cambiarValor(Persona persona){
        persona.nombre = "Pablo";
    }

    public static Persona cambiarElValor(Persona persona){
        if(persona == null){
            System.out.println("El valor de persona es inválido : Null");
            return null;
        }else{
            persona.nombre = "Michael";
            return persona;
        }
        
    }
}
