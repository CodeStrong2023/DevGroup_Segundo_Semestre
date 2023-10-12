package Clase9.Herencia.Test;

import java.util.Date;

import Clase9.Herencia.domain.Cliente;
import Clase9.Herencia.domain.Empleado;

public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Marcos", 200000.00);
        System.out.println("empleado1: "+empleado1);

        Cliente cliente1 = new Cliente(new Date(), true, "Carlos", 'M', 38, "9 de Julio 1413");
        System.out.println("cliente1: "+cliente1);
    }
}
