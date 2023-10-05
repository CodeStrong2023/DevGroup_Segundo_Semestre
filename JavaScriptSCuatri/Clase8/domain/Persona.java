package Clase8.domain;
// CONTEXTO ESTÁTICO

public class Persona {
    
    //  Cargamos Atributos encapsulados
    private int idPersona;
    private static int contadorPersona; // Con mod de acceso. se incrementa por cada var creada en el constructor
    private String nombre;

    // constructor
    public Persona(String nombre){
        this.nombre = nombre;
        // atributo estático, incrementar el contador para cada objeto nuevo
        Persona.contadorPersona++; // ref a traves de la clase
       
        // Asignar un nuevo valor a la persona
        this.idPersona = Persona.contadorPersona; // hace el incremento en el constructor
        
    }
    
    public static int getContadorPersona(){
        return contadorPersona; 
    }
    
    public static void setContadorPersona(int aContadorPersona){
        contadorPersona = aContadorPersona;
    }

    public int getIdPersona(){
        return this.idPersona;
    }

    public void setIdPersona(int idPersona){
        this.idPersona = idPersona;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    // Metodo toString, lo sobreescribiremos, asi hereda el metodo de la clase object

    public String toString(){
        return "Persona{" + " idPersona = " + idPersona + ", nombre = " + nombre + "}";
    }

}
