package domain;

public class PersonaPrueba {
    private int idPersona;
    private static int contadorPersona = 0;
    private String nombre;
    
   public persona(String nombre){
    this.nombre = nombre;
    this.idPersona = ++contadorPersona;
}

    public int getIdPersona() {
        return idPersona;
    }

    public String getNombre() {
        return nombre;
    }
}

package test;
import domain.persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        persona persona1 = new persona("Ariel");
        System.out.println("ID de persona1: " + persona1.getIdPersona());
        persona persona2 = new persona("Naty");
        System.out.println("ID de persona2: " + persona2.getIdPersona());
        imprimir(persona1);
        imprimir(persona2);
        System.out.println("Contador de personas: " + persona.getContador());
    }

    static public void imprimir(persona persona) {
        System.out.println("Nombre de la persona: " + persona.getNombre());
    }
}


