package Clase9Herencia.Domain;

public class Persona {
    // atributos de herencia 
    protected  String nombre; // pensado para el concepto de herencia
    protected char genero;
    protected int edad;
    protected String direccion;

    // Cosntructor vacio: es para crear objetos sin necesidad de inicializar los atributos de la clase
    public Persona(){ // constructor 1

    } 
    public Persona (String nombre){ // constructor 2
        this.nombre = nombre;
    }
    // cada  costructor que agregamos sirve para crear distintos tipos
    //  de objetos, con valores iniciales de distintas formas..

    // Constructor 3 completo, con todos los atributos..

    public Persona(String nombre, char genero, int edad, String direccion){
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public char getGenero() {
        return this.genero;
    }
    public void setGenero(char genero) {
        this.genero = genero;
    }
    public int getEdad() {
        return this.edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getDireccion() {
        return this.direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // Metodo toString
    @Override // sobreescribimos el metodo toString
    public String toString(){ // CLase padre
        return "Persona {" + "nombre= "  + nombre + ", genero=" + genero + ", edad= " + edad + " }";
    }
}
