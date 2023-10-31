package domain;

public class Persona {
    private int idPersona;
    private static int contadorPersona;
    private String nombre;

//Constructor
public Persona(String nombre){
     this.nombre = nombre;
     //Incrementar el contador por cada objeto nuevo
     Persona.contadorPersona++; //No utilizar el operador this
     //Vamos a asignar un nuevo valor a la variable idPersona
     this.idPersona = Persona.contadorPersona;
   }
    public static void setcontadorPersona(int aContadorPersona){
        contadorPersona = aContadorPersona;
    }
    public static int getcontadorPersona(){
        return contadorPersona;
    }
            //Get y set idPersona
    public void setIdPersona(int idPersona){
            this.idPersona = idPersona;
        }
    public int getIdPersona(){
        return this.idPersona;
    }   
    
            //Get y set nombre
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
   
    @Override
    public String toString(){
        return "Persona{ " + "idPersona = " + idPersona + ", nombre = " + nombre + "}";
    }

}