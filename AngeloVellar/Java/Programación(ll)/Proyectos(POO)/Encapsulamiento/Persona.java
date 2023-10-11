package Encapsulamiento;

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

    public String getNombre() {
        return nombre;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    public boolean isEliminado() {
        return eliminado;
    }
    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }
}
