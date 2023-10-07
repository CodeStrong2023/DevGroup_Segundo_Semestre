package StaticContext.test;

import StaticContext.domain.*;

public class personaPrueba {

    private int contador;
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan");
        System.out.println("persona1: "+persona1);
        Persona persona2 = new Persona("Pablo");
        System.out.println("persona2: "+persona2);
        imprimir(persona1);
        imprimir(persona2);
       personaPrueba personaP1 = new personaPrueba();
       System.out.println(personaP1.getContador());
    }

    public static void imprimir(Persona persona){
        System.out.println("Persona: "+persona);
    }

    public int getContador(){
        imprimir(new Persona("Carla"));
        return this.contador;
    }
}
