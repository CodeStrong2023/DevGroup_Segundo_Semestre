package Clase9Herencia.Test;

import java.util.Date;

import Clase9Herencia.Domain.Cliente;
import Clase9Herencia.Domain.Empleado;

public class TestHerencia {
    // lo que sucede cuando se llama a la class empleado, ve que está vacia
    // pero al ser hija de la class Persona, va y muestra los atributos vacios.. del toString

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Matias", 58000.0);
        System.out.println("Empleado1 = " + empleado1);

        Date fecha1 = new Date();

        // por cada nuevo atributo, hay un nuevo valor

        Cliente cliente1 = new Cliente(new Date(), true, "Jose Flores", "Masc", 33, "Av Alvear O");
        System.out.println("Cliente1= " + cliente1);
    }
}
