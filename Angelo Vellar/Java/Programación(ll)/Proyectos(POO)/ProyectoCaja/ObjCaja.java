package ProyectoCaja;

public class ObjCaja {
    public static void main(String[] args) {
        //Definimos el objeto y le pasamos los valores
        Caja caja1 = new Caja();
        caja1.alto = 10;
        caja1.ancho = 15;
        caja1.profundidad = 5;

        //Resultado final Caja 1
        System.out.println("El volumen de la caja 1 es: " + caja1.calculo()); 

        //Segundo Objeto
        Caja caja2 = new Caja(20, 30, 10);
        //Resultado final de Caja2
        System.out.println("El volumen de la caja 2 es: " + caja2.calculo());
         
    }
}
