
package pasoporreferencia;

import Clases.Persona;

public class pasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Ester";
        System.out.println("persona1: " + persona1.nombre);
        cambiarValor(persona1);
        System.out.println("El cambio que hicimos en el nombre es: " + persona1.nombre);
        persona1 = cambiarElValor(persona1);
        Persona persona2 = new Persona();
        // NULL Persona persona2 = null;
        persona2 = cambiarElValor(persona2);
        // System.out.println("El nuevo valor de persona2 es " + persona2);
    }
    
    public static void cambiarValor(Persona persona){ //parametro por referencia
        persona.nombre = "Maria";
    }
    
    public static Persona cambiarElValor(Persona persona){
        if (persona == null){
            System.out.println("Valor de persona es invalido: null");
            return null;
        }
        else {
        persona.nombre = "Monica";
        return persona;
        }
    }
}

