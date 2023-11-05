package pasoporreferencia;
import Lección2.persona.persona;
public class PasoPorReferencia {
    public static void main(String[] args) {
        persona persona1 = new persona();
        persona1.nombre = "Myriam";
        System.out.println("persona1 Nombre: " + persona1.nombre);
        cambiarValor(persona1);
        System.out.println("El cambio que hicimos en el nombre es: "+ persona1.nombre);
        persona persona2 = new persona();
        // persona persona2 = null;
        persona2 = cambiarElValor(persona2);
        System.out.println("El nuevo valor del objeto es: " + persona2.nombre);
    
    }
    public static void cambiarValor(persona persona) { // Parametro por referencia.
        persona.nombre = "María";
    }
    public static persona cambiarElValor(persona persona){
        if (persona == null){
            System.out.println("Valor de persona inválido: Null");
            return null;
        } else {
            persona.nombre = "Mónica";
            return persona;
        }
    }
}
