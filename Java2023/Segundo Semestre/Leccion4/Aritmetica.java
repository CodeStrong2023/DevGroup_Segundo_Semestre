package Leccion4;

public class Aritmetica {
    // Atributos de la clase.
    int a;
    int b;

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
