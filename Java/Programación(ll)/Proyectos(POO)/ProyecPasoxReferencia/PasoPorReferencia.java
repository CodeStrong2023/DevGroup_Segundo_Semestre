package ProyecPasoxReferencia;

import ProyectoPersona.Persona;

public class PasoPorReferencia {
    public static void main(String[] args) {

        Persona persona1 = new Persona();
        persona1.nombre = "Belén";
        persona1.apellido = "Mateo";
        System.out.println("Persona1 nombre = " + persona1.nombre);
        cambiarValor(persona1);
        System.out.println("El cambio que hicimos en el nombre es: " + persona1.nombre);
        persona1 = cambiarElValor(persona1);
    }
    
    public static void cambiarValor(Persona persona){ //Parámetro por referencia
            persona.nombre = "Nico";
    }
    public static Persona cambiarElValor(Persona persona){
        if (persona == null)
            
        persona.nombre = "Mónica";
        return persona;
    }
}
