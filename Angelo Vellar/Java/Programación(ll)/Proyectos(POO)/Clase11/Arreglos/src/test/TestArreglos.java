
package test;

public class TestArreglos {
    public static void main(String[] args) {  //lado derec. Instanciamos un objeto de tipo object
     
        int edades[] = new int[3]; //el lado izq. Declaramos la variable
        System.out.println("edades = " + edades);
        
        edades[0] = 17;
        System.out.println("edades 0 = " + edades [0]); 
        
        //modificar indice 1 y 2
        edades[1] = 20;
        System.out.println("edades 1 = " + edades [1]); 
        edades[2] = 32;
        System.out.println("edades 2 = " + edades [2]);
        edades[3] = 7; //Fuera de rango
        
        for(int i = 0; i <= edades.length; i++){
              System.out.println("Edades y sus elementos "+i+": "+edades[i]);
        }
        
        
    }
  
    
}
