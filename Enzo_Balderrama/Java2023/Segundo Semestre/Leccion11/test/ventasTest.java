package Leccion11.test;

import Leccion11.Ventas.*;

public class ventasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Pantalon", 13000);
        Producto producto2 = new Producto("Campera", 33000);

        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();
        // Tarea:
        // Crear mas objetos de tipo Producto.
        // Crear mas objetos de tipo Orden.
        Producto producto3 = new Producto("Zapatillas", 52000);
        Producto producto4 = new Producto("Remera", 10500);
        Producto producto5 = new Producto("Gorra", 4500);
        Producto producto6 = new Producto("Jeans", 18000);
        Producto producto7 = new Producto("Camisa", 12300);
        Producto producto8 = new Producto("Bufanda", 5500);
        Producto producto9 = new Producto("Gorro", 4300);
        Producto producto10 = new Producto("Shorts", 14200);
        Producto producto11 = new Producto("Musculosa", 8800);
        Producto producto12 = new Producto("Calza", 13800);

        Orden orden2 = new Orden();
        orden2.agregarProducto(producto12);
        orden2.agregarProducto(producto8);
        orden2.agregarProducto(producto9);
        orden2.agregarProducto(producto4);
        orden2.agregarProducto(producto3);
        orden2.mostrarOrden();
        Orden orden3 = new Orden();
        orden3.agregarProducto(producto7);
        orden3.agregarProducto(producto6);
        orden3.agregarProducto(producto10);
        orden3.agregarProducto(producto11);
        orden3.agregarProducto(producto5);
        orden3.agregarProducto(producto3);
        orden3.mostrarOrden();



    }
}
