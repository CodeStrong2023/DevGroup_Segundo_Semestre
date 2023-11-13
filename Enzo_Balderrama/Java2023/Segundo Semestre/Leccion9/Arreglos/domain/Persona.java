package Leccion9.Arreglos.domain;

public class Persona {
    private String nombre;

    public Persona(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    } 

    @Override
    public String toString() {
        return "Persona [nombre =" + nombre +", espacio de memoria: "+ super.toString() +"]";
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
