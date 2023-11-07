
package test;


public class TestArreglos {
    public static void main(String[] args) {
        int edades [] = new int [3]; //lado izq: Declaramos la variable. lado der: Instanciamos un objeto de tipo object
        System.out.println("edades = " + edades);
        
        edades[0] = 19;
        System.out.println("edades 0 = " + edades[0]);
        
        edades[1] = 21;
        System.out.println("edades 1 = " + edades[1]);
        
        edades[2] = 23;
        System.out.println("edades 2 = " + edades[2]);
        
        // edades[3] = 10; //Fuera de rango, Error en tiempo de ejecución
       
        for(int i = 0; i < edades.length;  i ++){
            System.out.println("Edades y sus elementos " + i +": "+ edades[i]);
        }
    }
}
