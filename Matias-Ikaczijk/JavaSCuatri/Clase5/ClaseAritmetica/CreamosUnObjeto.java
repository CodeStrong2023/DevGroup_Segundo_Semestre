package Clase5.ClaseAritmetica;

import Clase4Completa.Leccion4.Aritmetica.Operaciones;

public class CreamosUnObjeto {
    public static void main(String[] args) {
        int a = 7;
        int b = 3; // var local <-- memoria stack
        miMetodo(); // llamamos el metodo nuevo 

        Operaciones aritmetica1 = new Operaciones(); // llamamos al intructor
        aritmetica1.a = 3;
        aritmetica1.b = 7;
        aritmetica1.sumaNum();

        // Para almacenar un objeto u atributo, se utiliza memoria heap

        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("Resultado: " + resultado);

        resultado = aritmetica1.sumarConArgumentos(12, 26);
        System.out.println("Resultado usando argumentos: " + resultado);
        
        // Mod CLASE 6
        System.out.println("aritmetica1 a: " + aritmetica1.a);
        System.out.println("aritmetica1 b: " + aritmetica1.b);

        Operaciones aritmetica2 = new Operaciones(5,8);
        System.out.println("aritmetica2 = " + aritmetica2.a);
        System.out.println("aritmetica2 = " + aritmetica2.b);

        // aritmetica1 = null, nunca usar esto
        Persona persona = new Persona("Matias", "Ikaczijk");
        System.out.println("persona = " + persona);
        System.out.println("Persona nombre = " + persona.nombre);
        System.out.println("Persona apellido = " + persona.apellido);
    }

    // MOD CLASE 6. MODULARIDAD 

    public static void miMetodo(){
        // int a = 10;
        System.out.println("Aquí hay otro metodo");
    }

}
// creamos una clase dentro de otra.. No podrá ser publica
// default o package. NUEVA CLASE:

class Persona{
    // pondremos atributos..
    String nombre;
    String apellido;

    Persona(String nombre, String apellido){
        super(); // metodo constructor de la clase Padre object
        new Imprimir().imprimir(this); 
        this.nombre = nombre;
        this.apellido = apellido; // constructor q apunta a los atributos
        System.out.println("Objeto persona usando this: " + this); //muestra ek num de referencia de la memoria
    }
}
class Imprimir{
    public Imprimir(){
        super(); // constructor de la clase padre, para reservar memoria
    }

    // metodo dentro de la clase..

    public void imprimir(Persona persona){
        System.out.println("Persona desde la clase imprimir: " + persona);
        System.out.println("Impresion del objeto actual (this) : " + this);
    }
}
