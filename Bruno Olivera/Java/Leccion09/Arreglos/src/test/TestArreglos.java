
package test;

public class TestArreglos {
    public static void main(String[] args) { //lado derecho instanciamos un objeto de tipo object
        int edades[] = new int [3]; //el lado izquierdo deeclaramos la variable
        System.out.println("edades = " + edades);
        
        edades[0] = 17;
        System.out.println("edades 0 = " + edades[0]);
        edades[1] = 18;
        System.out.println("edades 1 = " + edades[1]);
        edades[2] = 19;
        System.out.println("edades 2 = " + edades[2]);
        // edades[3] = 20; FUERA DE RANGO
        for(int i = 0; i < edades.length; i++){
            System.out.println("edades y sus elementos " + i + ": " + edades[i]);
        }
    }
}
