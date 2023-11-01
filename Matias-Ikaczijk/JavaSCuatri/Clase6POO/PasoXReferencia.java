package Clase6POO;

import Clase2Ciclos.Leccion3.persona;
import Clase4Completa.Persona;

public class PasoXReferencia {
    public static void main(String[] args) {
        // instanciar un objeto
        Persona persona1 = new Persona(); // llamamos al const de la otra clase
        persona1.nombres = "Juan";
        System.out.println("persona1 nombre = " + persona1.nombres);
        
        CambioValor(persona1);

        System.out.println("El cambio que hicimos en el nombre es: " + persona1.nombres);
        persona1 = cambiarElvalor(persona1);
        
        // Persona persona2 = null;
        
        Persona persona2 = new Persona();
        persona2 = cambiarElvalor(persona2);
        System.out.println("El nuevo valor del obj es: " + persona2.nombres);
    }
    // para acceder al obj y clase: // PASO X REF
    public static void CambioValor(Persona persona){
        persona.nombres = "Esteban";
    }
    // otro metodo 
    public static Persona cambiarElvalor(Persona persona){
        // debemos retornar algo
       // -- en caso que necesitemos incorporar el return varias veces:
       if(persona == null){
        System.out.println("Valor de persona invalido, Null");
        return null;
       }
       else{
        persona.nombres = "Monica";
        return persona; // finalizacion de un metodo
       }

    }
}
