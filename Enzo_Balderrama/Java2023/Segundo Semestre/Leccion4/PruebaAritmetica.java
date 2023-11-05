package Leccion4;

public class PruebaAritmetica {
    public static void main(String[] args) {
        var a = 7; // Variables locales.
        int b = 10; // Memoria stack.
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 3;
        aritmetica1.b = 7;
        aritmetica1.sumar();
        // Para almacenar un objeto o los atributos se utiliza la memoria heap.
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("Resultado = " + resultado);
        resultado = aritmetica1.sumarConArgumentos(5, 3);
        System.out.println("Resultado usando argumentos = " + resultado);
        System.out.println("aritmetica1 a: "+ aritmetica1.a);
        System.out.println("aritmetica1 b: "+ aritmetica1.b);
        Aritmetica aritmetica2 = new Aritmetica(5, 8);
        System.out.println("aritmetica2: "+ aritmetica2.a);
        System.out.println("aritmetica2: "+ aritmetica2.b);
        Persona persona1 = new Persona("Enzo", "Balderrama");
        System.out.println("Persona nombre: "+ persona1.Nombre);
        System.out.println("Persona apellido: "+ persona1.Apellido);

    }
    // Modularidad creamos un nuevo metodo
    public static void miMetodo() {
        // a = 10; // una variable está limitada.
        System.out.println("Aquí hay otro método.");
    }
}

class Persona{
    String Nombre;
    String Apellido;

    Persona(String Nombre, String Apellido){
        super(); // Llamada al constructor de la clase padre object.
        // Imprimir imprimir = new Imprimir();
        new Imprimir().imprimir(this);
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        System.out.println("Objeto persona usando this: "+ this);
    }
}

class Imprimir{
    public Imprimir(){
        super();
    }
    public void imprimir(Persona persona){
        System.out.println("Persona desde la clase imprimir:" + persona);
        System.out.println("Impresión del objeto actual (this): "+ this);
    }
}
