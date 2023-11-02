
package domain;


public class Cliente extends Persona {
    
    private int idCliente;
    private Date fechaRegistro;
    private boolean vin;
    private static int contadorCliente;
    
    public Cliente(Date fechaRegistro, boolean vip, String nombre,
            char genero, int edad, String direccion) {
        super(nombre, genero, edad, direccion);
        this.idCliente = ++Cliente.contadorCliente;
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

    public boolean isVin() {
        return this.vin;
    }

    public void setVin(boolean vin) {
        this .vin = vin;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("idCliente=").append(idCliente);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", vin=").append(vin);
         sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
}
