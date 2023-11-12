package Leccion5.contextoEstatico.test;

import Leccion5.contextoEstatico.domain.Persona;

public class PersonaPrueba {
    private int contador;
    public static void main(String[] args) {
        Persona persona1 = new Persona("Enzo");
        System.out.println("Persona1 = "+ persona1);
        Persona persona2 = new Persona("Rocio");
        System.out.println("Persona2 = "+ persona2);
        imprimir(persona1);
        imprimir(persona2);
        PersonaPrueba personaP1 = new PersonaPrueba();
        System.out.println(personaP1.getContador());
    }    
    public static void imprimir(Persona persona){
        System.out.println("persona = "+ persona);
    }
    public int getContador(){
        imprimir(new Persona("Ariel"));
        return this.contador;
    }
}
