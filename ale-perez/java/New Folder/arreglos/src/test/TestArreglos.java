
package test;




public class TestArreglos {
    public static void main(String[] args) {
      int edades[] =new int [3];
      System.out.println("edades = " + edades);
      
      edades[0] = 17;
      System.out.println("edades 0 = "+ edades[0]);
      
       edades[2] = 22;
      System.out.println("edades 1 = "+ edades[0]);
      
       edades[2] = 18;
      System.out.println("edades 2 = "+ edades[2]);
      
      for(int i = 0; i < edades.length; i++){
          System.out.println("edades y sus elementos "+edades[i]);
      }
    }
    
}
