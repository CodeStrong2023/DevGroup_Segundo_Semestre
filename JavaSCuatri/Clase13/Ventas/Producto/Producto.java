package Clase13.Ventas.Producto;

public class Producto {
    // Atributos privados
    private int idProducto;
    private String nombre; // encapsulado
    private double precio;
    private static int contadorProducto;

    // constructor vacio
    private Producto(){ // var statica
        this.idProducto = ++Producto.contadorProducto;
    }

    // const que llama al prod y modifica el idProducto
    public Producto(String nombre, double precio){
        this(); // Llamamos al constructor vacio
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
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

    // heredado de la class obj
    @Override
    public String toString() {
        return "Producto [idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + "]";
    }

}
