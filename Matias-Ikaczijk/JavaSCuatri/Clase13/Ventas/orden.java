package Clase13.Ventas;

import Clase13.Ventas.Producto.Producto;

public class orden {
    // carga de atributos encapsulados
    private int idOrden;
    private Producto productos[];
    private int contadorProducto;
    private static int contadorOrdenes;
    private static final int MAXPRODUCTOS = 10; // constante 

    // const vacio
    public orden(){
        this.idOrden = ++orden.contadorOrdenes; //aumento idOrden
        this.productos = new Producto[orden.MAXPRODUCTOS];
    }

    // metodo que combina clase prod con clase orden. 
    // Agrega productos
    public void agregarProducto(Producto producto){ // agrega siempre y cuando no supere a 10prod
        // cont prod
        if(this.contadorProducto < orden.MAXPRODUCTOS){
            this.productos[this.contadorProducto++] = producto; // lee la var y sufre incremento
        }
        else{
            System.out.println("Se ha superado el maximo de productos.. " + orden.MAXPRODUCTOS);
        }
    }

    // iteramos los elementos ya cargados 

    public double calcularTotal(){
        double total = 0;
        // recorremos el arreglo
        for(int i = 0; i < this.contadorProducto; i++){
           // Producto producto = this.productos[i];
             // total += producto.getPrecio();
             total += this.productos[i].getPrecio(); // recibe, y suma precio
        }
        return total;
    }

    // mostramos el detalle de todos los prod y total
    public void mostrarOrden(){
        System.out.println("Id Orden: " + idOrden);
        double totalOrden = this.calcularTotal();
        System.out.println("El total de la orden es: $" + totalOrden);
        System.out.println(" Los productos de la orden son: " );
        for(int i =0; i < contadorProducto; i++){
            System.out.println(this.productos[i]);
        }
    }

}
