
public class Aritmetica {
    // Atributos de la clase

    int a = 5;
    int b = 4;

    
// El constructor es un método especial

public Aritmetica (){ // Contructor 1
    System.out.println("Se está ejecutando el Constructor n°1");
}

// Estamos viendo lo que se llama sobrecarga de constructores

public Aritmetica (int a, int b){ // Constructor 2
    this.a = a;
    this.b = b;
    System.out.println("Se está ejecutando el Constructor n°2");
}


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
