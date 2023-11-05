package Java2023.Leccion6.Herencia.domain;

import java.util.Date;

public class Cliente extends Persona {
    // Atributos
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorClientes;
    
    // Constructor
    public Cliente(Date date, boolean vip, String nombre, char genero, int edad, String direccion){
        super(nombre, genero, edad, direccion);
        this.idCliente = ++Cliente.contadorClientes;
        this.fechaRegistro = date;
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
        return this.vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente[idCliente = ").append(idCliente);
        sb.append(", Fecha de Registro = ").append(fechaRegistro);
        sb.append(", vip = ").append(vip);
        sb.append(", ").append(super.toString());
        sb.append("]");
        return sb.toString();
    }
}
