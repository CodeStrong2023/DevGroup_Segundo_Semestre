package Clase10.PalabraFinal.domain;

public class Persona {

    public final static int CONSTANTE_AQUI = 15;
    private String nombre;

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void imprimir(){
        System.out.println("Método para imprimir");
    }
}
