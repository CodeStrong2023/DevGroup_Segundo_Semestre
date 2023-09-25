package OperacionesAritmetica;

public class Aritmetica {
    //Atributos de la clase
    int a;
    int b;
    //El constructor es un método especial
    public Aritmetica(){//Constructor 1 vacio
        System.out.println("Se está ejecutando este constructor número uno");
    }
    //Estamos viendo lo que se llama sobrecarga de constructores
    public Aritmetica(int a, int b ){//Constructor 2
        this.a = a;
        this.b = b;
        System.out.println("Se está ejecutando el constructor número dos");
    }

    //Metodo
    public void sumarNumeros(){
        int resultado  = a + b;
    
        System.out.println("resulado = " + resultado);
    }
    
    public int sumarConRetorno(){
        //int resultado = a + b;
        return a + b;
    
    }
}
