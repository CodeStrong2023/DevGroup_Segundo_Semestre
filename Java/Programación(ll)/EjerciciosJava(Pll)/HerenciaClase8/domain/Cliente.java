import java.util.Date;

public class Cliente extends Persona {

    private int idCliente;
    private boolean vip;
    private Date fechaRegistro; //importar clase date
    private static int contadorCliente;

                 //CONSTRUCTUR 1

    public Cliente(Date fechaRegistro, boolean vip,String nombre , char genero,int edad, String direccion){
        super(nombre,genero,edad,direccion);
        this.idCliente = ++Cliente.contadorCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }
    //GET 
    public int getIdCliente() {
        return this.idCliente;
    }

    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{idCliente=").append(idCliente);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", vip=").append(vip);
        sb.append(", ").append(super.toString());
        sb.append("}");
        return sb.toString();
        }


}
