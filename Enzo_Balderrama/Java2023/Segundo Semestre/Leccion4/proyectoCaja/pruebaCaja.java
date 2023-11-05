/*
 *  Proyecto Caja:
 *  Ejercicio 1: Crear un proyecto según las especificaciones mostradas
 *  a continuación.
 *  La fórmula es: volumen = ancho * alto * profundidad
 */

package Leccion4.proyectoCaja;

public class pruebaCaja {
    public static void main(String[] args) { // Método main.
        // Variables locales.
        int medidaAlto = 2;
        int medidaAncho = 3;
        int medidaProfundo = 6;

        Caja caja1 = new Caja(); // Instanciamos el objeto, constructor vacío.
        caja1.alto = medidaAlto; // Le pasamos los valores al objeto.
        caja1.ancho = medidaAncho;
        caja1.profundo = medidaProfundo;
        int resultado = caja1.CalcularVolumen(); // Llamamos al método.
        // Primer resultado
        System.out.println("Resultado volumen caja 1 = "+ resultado);

        Caja caja2 = new Caja(2, 4, 6); // Llamamos al constructor 2 con nuevos argumentos.
        // Llamamos con el nuevo objeto al método para un nuevo cálculo.
        System.out.println("Resultado volumen caja 2 = "+ caja2.CalcularVolumen());

    }    
}
