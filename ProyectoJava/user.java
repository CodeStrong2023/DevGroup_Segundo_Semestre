package ProyectoJava;

public class user {
    // Cargamos atributos del usuario.
    private String usuario, pass, domicilio;
    private static int idUsuario;
    private int cel;

    public user(){
        
    }

    public user(String usuario, String pass){
        this.usuario = usuario;
        this.pass = pass;
        user.idUsuario++;

    }

    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return this.pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getDomicilio() {
        return this.domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public static int getIdUsuario() {
        return idUsuario;
    }


    public int getCel() {
        return this.cel;
    }

    public void setCel(int cel) {
        this.cel = cel;
    }

}
