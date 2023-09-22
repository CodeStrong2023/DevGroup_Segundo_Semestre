package Clases;
 
                                //CLASE
                        //ATRIBUTOS Y METODOS

//ATRIBUTOS:
public class Guerrero {
    private String nombre;
    private float fuerza;
    private String salud;


//METODOS:

    //Get
    public String getNombre(){
        return nombre;
    }
    public float getFuerza(){
        return fuerza;
    }

    //Set
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setFuerza(float Fuerza){
        this.fuerza = Fuerza;
    }
}
