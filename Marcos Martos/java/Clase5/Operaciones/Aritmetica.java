package Operaciones;

public class Aritmetica {
    // Atributos de la clase

    int a = 5;
    int b = 4;

    // Método

    public void sumarNumeros(){
        int resultado = a + b;
        System.out.println("Resultado: "+resultado);
    }

    public int sumarConRetorno(){
        int resultado = a + b;
        return resultado;
    }

    public int sumarConArgumentos(int a, int b){
        this.a = a;
        this.b = b;
        // return a + b;
        return this.sumarConRetorno();
    }


}
