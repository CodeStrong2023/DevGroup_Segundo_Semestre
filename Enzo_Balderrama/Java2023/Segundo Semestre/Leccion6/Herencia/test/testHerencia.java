package Leccion6.Herencia.test;


import java.util.Date;

import Leccion6.Herencia.domain.Persona;
import Leccion6.Herencia.domain.Cliente;
import Leccion6.Herencia.domain.Empleado;

public class testHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Enzo", 57000);
        System.out.println("Empleado1 = "+ empleado1);


        // Date fecha1 = new Date();

        // Cliente cliente1 = new Cliente(new Date(), true, "Enzo", 'M', 25, "Av. Siempreviva 742");
        // System.out.println("Cliente1 = "+ cliente1);
        
        // Persona persona1 = new Persona();
    }    
}
