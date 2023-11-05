package Leccion4;

public class Aritmetica {
    // Atributos de la clase.
    int a;
    int b;

    // El Constructor es un método especial.
    public Aritmetica(){ // Aritmetica
        System.out.println("Se esta ejecutando el constructor numero uno.");
    }
    // Estamos viendo los que se llama sobrecarga de constructores.
    public Aritmetica(int a, int b){ // Constructor 2
        this.a = a;
        this.b = b;
        System.out.println("Se está ejecutando el constructor numero dos.");
    }

    // Método.
    public void sumar(){
        int resultado = a + b;
        System.out.println("Resultado = " + resultado);
    }
    public int sumarConRetorno(){
        // int resultado = a + b;
        return this.a + this.b;
    }

    public int sumarConArgumentos(int a, int b){
        this.a = a; // El argumento a se asigna al atributo this.a
        this.b = b; // El argumento a se asigna al atributo this.b
        // return a + b;
        return sumarConRetorno();
    }
}
