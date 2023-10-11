package ProyectoCaja;

public class Caja {
    //Creamos los atributos que va tener nuestro objeto
    int ancho;
    int alto;
    int profundidad;    
    
    //Primer constructor
    public Caja(){

    }
    //Segundo constructor
    public Caja(int ancho, int alto, int profundidad){
        this.alto = alto;
        this.ancho = ancho;
        this.profundidad = profundidad;
        
    }
    //Tercer constructor (Formula)
    public int calculo(){
        return (ancho * alto * profundidad);

    }
    

}
