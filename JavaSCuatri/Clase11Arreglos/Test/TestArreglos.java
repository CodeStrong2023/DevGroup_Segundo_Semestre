package Clase11Arreglos.Test;

public class TestArreglos {
    public static void main(String[] args) { //lado derecho. instanciamos un objeto
       int edades [] = new  int[3]; // almacenará 3 elementos. Del lado izq declaramos la var
       System.out.println("edades = " + edades);

       // Completamos el arreglo con valores
       edades[0] = 17;
       System.out.println("edades 0 = " + edades[0]);
       edades[1] = 29;
       System.out.println("edades 1 = " + edades[1]);
       edades[2] = 34;
       System.out.println("edades 2 = " + edades[2]);
       
       for(int i = 0; i < edades.length; i++){
        System.out.println("edades y sus elementos " + i + " : "+edades[i]);
       }

    }
}