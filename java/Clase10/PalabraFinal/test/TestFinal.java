/*
 * Uso de la palabra final
 * Esta palabra tiene diferentes significados dependiendo donde
 * se la aplique:
 *  Variables: Evita cambiar el valor que almacena la variable 
 *  Métodos: Evita que se modifique la definición o el comportamiento de un método 
 *           desde una subclase (hija)
 *  Clases: Evita que se creen clases hijas 
 * Otra caracteristica es que normalmente, cuando trabajamos con variables
 * se combina con el modificador de acceso estático para convertir una variable en una constante
 * es decir, que no se puede modificar su valor, el ejemplo de esto es la clase Math en el cual 
 * todos sus atributos son de tipo static y final, es por esto que la variable pi* se conoce como 
 * una constante
 */

package Clase10.PalabraFinal.test;

import Clase10.PalabraFinal.domain.Persona;

public class TestFinal {
    public static void main(String[] args) {
        final int miDni = 45361265;
        System.out.println("Mi DNI: "+miDni);
        //Persona.CONSTANTE_AQUI = 9; // No se modifica
        System.out.println("Mi atributo constante es: "+Persona.CONSTANTE_AQUI);

        final Persona persona1 = new Persona();
        //persona1 = new Persona(); // No se puede asignar una nueva referencia
        persona1.setNombre("Marcos Martos");
        System.out.println("persona1 nombre: "+persona1.getNombre());
        persona1.setNombre("Carlos Duarte");
        System.out.println("persona1 nombre: "+persona1.getNombre());
    }
}
