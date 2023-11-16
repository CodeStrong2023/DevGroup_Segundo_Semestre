
package ar.com.codesystem.ventas.test;

import ar.com.codesystem.ventas.*;

public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Pantalon", 40500.00);
        Producto producto2 = new Producto("Remera", 26000.00);
        Producto producto3 = new Producto("Campera", 81000.00);
        Producto producto4 = new Producto("Lentes", 48200.00);
        Producto producto5 = new Producto("Medias", 1700.00);
        Producto producto6 = new Producto("Zapatillas", 94700.00);
        Producto producto7 = new Producto("Gorra", 10000.00);
        Producto producto8 = new Producto("Reloj", 45000.00);
        Producto producto9 = new Producto("Pulsera", 1000.00);
        Producto producto10 = new Producto("Boxer", 2000.00);
        
        Orden orden1 = new Orden();
        //Agregamos productos al arreglo
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto6);
        orden1.agregarProducto(producto8);
        orden1.mostrarOrden();
    }
}
