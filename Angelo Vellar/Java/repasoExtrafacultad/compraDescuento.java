package repasoExtrafacultad;
//En un almacen se hace un 20MOD de descuento a los clientes
//cuya compra supere los $100, Cual será la cantidad que
//pagará una persona por su compra?

import java.util.Scanner;

public class compraDescuento {
    public static void main(String[] args) {
        
        Scanner consol1 = new Scanner(System.in);
        System.out.println("Ingrese el monto de la compra realizada");
        var compra = Integer.parseInt(consol1.nextLine());
        double descuento = compra * 0.2;
        if (compra > 100) {
            System.out.println("Usted a tenido un descuento de: $" + descuento);
        }
        else {
           System.out.println("Su compra no supera el valor dado para el descuento."); 
        }
        
        double precioFinal = (compra - descuento);
        System.out.println("El precio final de su compra es de: $" + precioFinal);
    }
}
