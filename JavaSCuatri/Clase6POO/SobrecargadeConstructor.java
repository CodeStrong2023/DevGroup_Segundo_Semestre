package Clase6POO;

public class SobrecargadeConstructor {
    // atributos de la clase
    int a;
    int b;

    // El constructor es un metodo especial. 3 objetivos:
    // contruye un objeto, reserva espacio de memo, inicia los atrib de la clase 
   
    public SobrecargadeConstructor(){
        System.out.println("Se está ejecutando el constructor 1..");
    }

    public SobrecargadeConstructor(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Se está ejecutando el constructor 2");
    }

}
