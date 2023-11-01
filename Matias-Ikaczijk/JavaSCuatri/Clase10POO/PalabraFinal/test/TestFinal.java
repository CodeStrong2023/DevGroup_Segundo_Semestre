package Clase10POO.PalabraFinal.test;

import Clase10POO.Domain.Persona;

// Palabra final: dif significados dep donde se aplique:
// - variables: evita cambiar el valor que almacena la variable.
// - metodos: evita que se modifique la definicion o el comportamientode un metodo desde una subclase(hija)
// - clase: evita que se creen clases hijas

// Normalmente, cuando se trabaja con variables se combina con el modificador de acceso estático 
// para convertir una variable en una constaante, es decir, que no se puede modificar su valor, el ejemplo de esto es la clase Math
// en la cual todos sus atributos son de tipo static y final, es por esto q la var pi se conoce como constante

public class TestFinal {
    public static void main(String[] args) {
        final int miDni = 32145787;
        System.out.println("miDni = " + miDni);
        // miDni = 54789451; no deja reasignar
        // Persona.CONSTANTE_AQUI = 9; // no se modifica
        System.out.println("Mi atributo constante es: " + Persona.CONSTANTE_AQUI);

        // USO DE LA PALABRA FINAL CON OBJETOS..
        final Persona persona1 = new Persona(); // tampoco se puede reasignar una nueva referencia
        persona1.setNombre("Juan Mason");
        System.out.println("persona1 nombre = " + persona1.getNombre()); // si se puede mod el contenido del objeto
        persona1.setNombre("Andrea");
        System.out.println("persona1 nombre = " + persona1.getNombre());
    }
    
}
