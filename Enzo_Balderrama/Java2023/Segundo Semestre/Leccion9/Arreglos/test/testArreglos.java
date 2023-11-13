package Leccion9.Arreglos.test;

public class testArreglos{
    public static void main(String[] args) {
// IZQ. declaramos variable | DER. instanciamos objeto, tipo object.
        int edades[] = new int[3];
        System.out.println("edades = " + edades);
        edades[0] = 17;
        System.out.println("edades[0] = " + edades[0]);
        edades[1] = 34;
        System.out.println("edades[1] = " + edades[1]);
        edades[2] = 68;
        System.out.println("edades[2] = " + edades[2]);
        // edades[3] = 5; | Fuera de rango, error en tiempo de ejecucion.
        System.out.println("Edades y sus elementos");
        for (int i = 0; i < edades.length; i++) {
            System.out.println("edades["+ i + "] = " + edades[i]);
        }
    }
}