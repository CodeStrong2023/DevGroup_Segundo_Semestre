package Leccion4.proyectoCaja;

public class Caja {
    int alto;
    int ancho;
    int profundo;
    // Métodos y constructores (acciones)
    public Caja(){ // Constructor 1 vacío.
    }    
    public Caja(int alto, int ancho, int profundo){ // Constructor 2
        this.alto = alto;
        this.ancho = ancho;
        this.profundo = profundo;
    }
    public int CalcularVolumen() { // Método para calcular el volúmen
        return alto * ancho * profundo;
    }
}
