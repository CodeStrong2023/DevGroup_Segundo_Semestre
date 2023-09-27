// Proyecto Caja:
// Ejercicio 1: Crear un proyecto según las especificaciones
// mostradas a continuación.

public class CajaTest {
    public static void main(String[] args) {
        int medidaAncho = 4;
        int medidaAlto = 3;
        int medidaProf = 8;

        Caja caja1 = new Caja();
        caja1.ancho = medidaAncho;
        caja1.alto = medidaAlto;
        caja1.profundo = medidaProf;
        int resultado = caja1.calcularVolumen();
        System.out.println("Resultado volumen caja 1: "+resultado);

        Caja caja2 = new Caja(3, 4, 8);
        System.out.println("Resultado volumen caja 2: "+caja2.calcularVolumen());
    }
}
