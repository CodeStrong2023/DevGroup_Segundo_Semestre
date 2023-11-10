
package ar.com.codesystem.ventas;

public class Producto {
    //atributos de la clase
    private int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;
    
    //constructor vacio

    private Producto() {
        this.idProducto = ++Producto.contadorProductos;
    }
    
    public Producto(String nombre, double precio) {
            this(); //llamamos al constructor vacio
            this.nombre = nombre;
            this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
    
    
    
}
