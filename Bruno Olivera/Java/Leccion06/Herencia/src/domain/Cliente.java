
package domain;

import java.util.Date;

public class Cliente extends Persona{
    //atributos
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorCliente;
    
    //constructor
    public Cliente(Date fechaRegistro, boolean vip, String nombre, char genero, int edad, String direccion){
        super (nombre, genero, edad, direccion);
        this.idCliente = ++Cliente.contadorCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", fechaRegistro=" + fechaRegistro + ", vip=" + vip + '}';
    }
    
    
}
