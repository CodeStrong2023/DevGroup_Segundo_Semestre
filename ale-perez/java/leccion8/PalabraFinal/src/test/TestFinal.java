
package test;


public class TestFinal {
    public static void main(String[] args) {
        final int miDni = 45359425;
        System.out.println("miDni = " + miDni);
        //miDni = 45359425;No se puede modificar       
  System.out.println("mi atributo constante es: "+Persona.CONSTANTE_AQUI);
  
      final Persona persona1 = new Persona();
      persona1.setNombre("ariel bentancud");
      System.out.println("persona1 nombre: "+persona1.getNombre());
       persona1.setNombre("liliana");
      System.out.println("persona1 nombre: "+persona1.getNombre());
      
    }
  
} 

    

