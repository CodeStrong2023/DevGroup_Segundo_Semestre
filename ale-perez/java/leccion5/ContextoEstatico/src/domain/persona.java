
package domain;


public class persona {
    private int idPersona;
    private static int contadorPersona;
    private String nombre;
    
    public persona(String nombre){
        this.nombre = nombre;
       persona.contadorPersona++;
        this.idPersona = persona.contadorPersona;
    }
    
    public static int getcontadorPersona() {
        return contadorPersona;
    }
    
    public static void setcontadorPersona(int acontadorPersona) {
        contadorPersona = acontadorPersona;
    }
    public int getIdPersona() {
        return this.idPersona;
    }
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }
    public String getNombre()  {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + "}";
    }
    
}
