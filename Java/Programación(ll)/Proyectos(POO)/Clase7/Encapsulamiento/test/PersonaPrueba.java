package Encapsulamiento.test;

import Encapsulamiento.dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
       Persona persona1 = new Persona("Osvaldo", 57.000, false); 

       //Modificar a través de los métodos
       persona1.setNombre("Juan Ignacio");
       //persona1.nombre("Juan Ignacio"); //Ya no se puede utilizar
       //System.out.println("Nombre es:"+persona1.nombre); //Error
       System.out.println("Persona1 su nombre es:"+ persona1.getNombre());
       System.out.println("persona1 el resultado para el sueldo: " +persona1.getSueldo());
       System.out.println("persona1 para obtener el booleano: " +persona1.isEliminado());
    
       //TAREA: crar otro objeto, asignar valores iniciales y modificarlos y imprimir
                        //CREAMOS EL OBJETO PERSONA2
        Persona persona2 = new Persona("Angelo", 50.000, false);
        //Modificamos el nombre del objeto persona2
        persona2.setNombre("Nico");
        //Modificamos el sueldo del objeto persona2
        persona2.setSueldo(80.000);
    
        //Mostramos en pantalla
        System.out.println("persona2 su nombre es:"+ persona2.getNombre());
        System.out.println("persona2 el resultado para el sueldo: " +persona2.getSueldo());
        System.out.println("persona2 para obtener el booleano: " +persona2.isEliminado());

        //METODO TO STRING
        System.out.println("persona1 " + persona1);
    }
}
