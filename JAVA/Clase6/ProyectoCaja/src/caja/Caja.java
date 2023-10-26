
package caja; //packeage

public class Caja { //Clase publica caja
    //atributos (caracteristicas)
    int ancho;
    int alto;
    int profundo;
    
    //Metodos y constructores (acciones)
    public Caja(){ //Constructor 1 = vacio
        
    }
    //Constructor con parametros
    public Caja(int ancho, int alto, int profundo) { //Constructor 2
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    
    public int calcularVolumen() { //metodo para calcular
        return ancho*alto*profundo;
    }
}
