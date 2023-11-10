package Clase13.TestVentas;

import Clase13.Ventas.orden;
import Clase13.Ventas.Producto.Producto;

public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Pantalon", 18990);
        Producto producto2 = new Producto("Buzo", 25400);

        orden Orden1 = new orden();
        // agregamos prod a la orden
        Orden1.agregarProducto(producto1);
        Orden1.agregarProducto(producto2);

        Orden1.mostrarOrden();

        // Tarea:  crear mas objetos de tipo Producto
        // crear mas obj de tipo orden

        Producto producto3 = new Producto("Pantalon oxford", 28990);
        Producto producto4 = new Producto("Buzo sin mangas", 36990);
        Producto producto5 = new Producto("Bermuda lino", 14990);
        Producto producto6 = new Producto("Bermuda jeans", 16990);
        Producto producto7 = new Producto("Camisa bengalina", 22990);
        Producto producto8 = new Producto("Camisa cuello mao, lino", 26390);
        Producto producto9 = new Producto("Zapatillas vans", 64990);
        Producto producto10 = new Producto("Zapatillas nike sb", 89990);
        Producto producto11 = new Producto("Boxer x3", 27990);
        Producto producto12 = new Producto("Remeras basicas x3", 38390);

        orden Orden2 = new orden();

        Orden2.agregarProducto(producto3);
        Orden2.agregarProducto(producto4);
        Orden2.agregarProducto(producto5);
        Orden2.agregarProducto(producto6);
        Orden2.agregarProducto(producto7);

        Orden2.mostrarOrden();

        orden Orden3 = new orden();

        Orden3.agregarProducto(producto8);
        Orden3.agregarProducto(producto9);
        Orden3.agregarProducto(producto10);
        Orden3.agregarProducto(producto11);
        Orden3.agregarProducto(producto12);

        Orden3.mostrarOrden();

    }
}
