package Clase7POO.Encapsulamiento;
// dominio

// PARTE 1 ENCAPSULAMIENTO
public class Persona {
    // Atributos:
    private String nombre;
    private double sueldo;
    private boolean eliminado;

    // Constructor de la clase:
    public Persona(String nombre, double sueldo, boolean eliminado){
        this.nombre = nombre;
        this.sueldo = sueldo; // atributo primero y var despues
        this.eliminado = eliminado;
    }

    // Definir metodos, set y get

    public String getNombre(){
        return nombre; // retorna el valor del atributo
    }

    public void setNombre(String nombre){
        this.nombre = nombre; // necesita un parametro y modifica
    }

    public double getSueldo(){
        return sueldo; // retorna el valor guardado en el atributo
    }

    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }
     
    // no se usa el get para recuperar info, se usa is
    public boolean isEliminado(){
        return eliminado;
    }

    public void setEliminado(boolean eliminado){
        this.eliminado = eliminado;
    }

}
