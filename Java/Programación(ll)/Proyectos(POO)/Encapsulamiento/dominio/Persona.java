package Encapsulamiento.dominio;

public class Persona{
    //Atributos
    private String nombre;
    private double sueldo;
    private boolean eliminado;

    //Constructor
    public Persona(String nombre, double Sueldo, boolean eliminado){
        this.nombre = nombre;
        this.sueldo = Sueldo;
        this.eliminado = eliminado;
    }

            //METODOS PARA ATRIBUTO NOMBRE (GET Y SET)
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

            //METODOS PARA ATRIBUTO SUELDO (GET Y SET)
    public Double getSueldo(){
        return sueldo;
    }
    public void setSueldo(double Sueldo) {
        this.sueldo = Sueldo;
    }


            //METODOS PARA ATRIBUTO ELIMINADO (IS Y SET)
    public boolean isEliminado() {
        return eliminado;
    }
    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }
    //METODO TO STRING
    public String toString(){ //Convierte en una cadena cada atributo
        return "Persona [nombre: "+ this.nombre+
                ", sueldo: "+ this.sueldo+
                ", eliminado: "+this.eliminado+" ] ";


    }
}

