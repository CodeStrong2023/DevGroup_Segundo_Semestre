package OperacionesAritmetica;

public class PruebaAritmetica {
    public static void main(String[] args) {
        var a = 10; //Variables locales
        int b = 7; //Memoria stack
        miMetodo(); //LLmamos el método nuevo
                        //OBJETO 1
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 3;
        aritmetica1.b = 7;
        aritmetica1.sumarNumeros();
        //Para almacenar un objeto o los atributos se utiliza la memorio heap
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado = " + resultado);
        resultado = aritmetica1.sumarConArgumentos(12,26);
        System.out.println("Resultado usando argumentos = " + resultado);

        System.out.println("aritemetica1 a: " +aritmetica1.a);
        System.out.println("aritemetica1 b: " +aritmetica1.b);

                        //OBJETO 2
        Aritmetica aritmetica2 = new Aritmetica(5,8);
        System.out.println("aritmetica2 = " + aritmetica2.a);
        System.out.println("aritmetica2 = " + aritmetica2.b);

        //aritmetica1 = null = nunca utilizar esto, no se debe hacer
        //System.gc(); método para limpiar residuos, es pesado, no utlizarlo
                    //OBJETO 3

        Persona persona = new Persona("Angelo", "Vellar");
        System.out.println("persona = "+persona);
        System.out.println("Persona nombre: " + persona.nombre);
          System.out.println("Persona nombre: " + persona.apellido);


    }
    //Modularidad creamos un nuevo método
    public static void miMetodo(){
        //int a = 10;
        System.out.println("Aquí hay otro método");


        
    }
}
//Creamos una nueva clase
class Persona{
    String nombre;
    String apellido;

    Persona (String nombre, String apellido){ //Constructor
        super(); //Llamada al constrcutor de la clase Padre object
        //Imprimir imprimir = new Imprimir();
        new Imprimir().imprimir(this);
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Objeto persona usando this: "+ this);
    }
}
//Creamos una clase, luego un constructor y un metodo dentro de la clase Imprimir
class Imprimir{
    public Imprimir(){
        super(); //El constrcutor de la clase padre, para reservar memoria
    }

    public void imprimir(Persona persona){
        System.out.println("Persona de la clase imprimir: " + persona);
        System.out.println("Impresióm del objeto actual (this): "+this);
    
    }
}