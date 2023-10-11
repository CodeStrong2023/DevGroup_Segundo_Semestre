
package caja;

public class Caja {
    //Atributos(caracteristicas)
    int ancho;
    int alto;
    int profundo;
    //Metodos y constructores(acciones)
    public Caja() { //Constructor 1 = vacio
    }
    //Constructor con párametros
    public Caja(int ancho, int alto, int profundo) { //Constructor 2
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    
    public int  calcularVolumen () { //Método para calcular 
        return alto * ancho * profundo;
        
    }
    
}
