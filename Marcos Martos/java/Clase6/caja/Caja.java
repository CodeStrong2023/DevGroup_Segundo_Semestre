package caja;

public class Caja {

    //Atributos (caracteristicas)
    int ancho;
    int alto;
    int profundo;

    //Métodos y constructores (acciones)
    public Caja(){ // Constructor 1 vacío

    }
    // Constructor con parametros
    public Caja(int alto, int ancho, int profundo){
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }

    public int calcularVolumen(){ // Método para calcular
        return alto * ancho * profundo;
    }
    
}
