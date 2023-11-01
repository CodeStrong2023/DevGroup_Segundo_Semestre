package Clase9Herencia.Domain;

import java.util.Date;

public class Cliente extends Persona {
    // Atributos:
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorCliente; // tipo estático

    // constructores
    public Cliente(Date fechaRegistro, boolean vip, String nombre, String string, int edad, String direccion){
        super(nombre, genero, edad, direccion);
        this.idCliente = ++contadorCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }

    public int getIdCliente() {
        return this.idCliente;
    }


    public Date getFechaRegistro() {
        return this.fechaRegistro;
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
        StringBuilder sb = new StringBuilder(); // clase
        sb.append("Cliente (idCliente=").append(idCliente); //llama y agrega atributos
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", vip=").append(vip);
        sb.append(", ").append(super.toString());
        sb.append("}");
        return sb.toString();
    }
    
    
}
