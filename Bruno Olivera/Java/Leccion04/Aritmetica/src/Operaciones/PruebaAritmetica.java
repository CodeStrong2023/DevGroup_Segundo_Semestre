package Operaciones;

public class PruebaAritmetica {

    public static void main(String[] args) {
        int a = 10; //variables locales
        int b = 7; //memoria stack
        miMetodo();
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 3;
        aritmetica1.b = 7;
        // aritmetica1 = null; nunca utilizar esta forma de limpieza
        aritmetica1.sumarNumeros();
        //para almacenar un objeto o los atributos se utiliza la memoria heap
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado= " + resultado);

        resultado = aritmetica1.sumarConArgumentos(12, 26);
        System.out.println("resultado= " + resultado);

        System.out.println("Aritmetica1 a: " + aritmetica1.a);
        System.out.println("Aritmetica1 b: " + aritmetica1.b);

        Aritmetica aritmetica2 = new Aritmetica(5, 8);
        System.out.println("Aritmetica2 = " + aritmetica2.a);
        System.out.println("Aritmetica2 = " + aritmetica2.b);

        Persona persona = new Persona("Bruno", "Olivera");
        System.out.println("persona= " + persona);
        System.out.println("Persona nombre= " + persona.nombre);
        System.out.println("Persona apellido= " + persona.apellido);
    }

    public static void miMetodo() {
        // int a = 10; una variable esta limitada
        System.out.println("Aqui hay otro metodo");
    }

}

class Persona {

    String nombre;
    String apellido;

    Persona(String nombre, String apellido) {
        super(); //llamada al constructor de la clase padre object
        // Imprimir imprimir = new Imprimir();
        new Imprimir().imprimir(this);
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Objeto persona usando this: " + this);
    }
}

class Imprimir {

    public Imprimir() {
        super(); // el constructor de la clase padre para reservar memoria
    }
    public void imprimir(Persona persona){
        System.out.println("Persona desde la clase imprimir: " + persona);
        System.out.println("Impresion del objeto actual (this): " + this);
    }
}
