
package caja;//Package



public class caja { //Clase publica caja
    //Atributos(caracteristicas)
    int ancho;
    int alto;
    int profundo;
    //Metodos y constructores(accion)
    public caja() { //constructor 1 =vacio    
    }
    //Contructor con parametros
    public caja(int ancho, int alto, int profundo) { //Constructor 2
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
        
    }
    public int calcularVolumen() { //Metodo para calcular
        return ancho *alto * profundo;
    }
    
}
