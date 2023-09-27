public class aritmetica {
    int a = 5;
    int b = 4;

public aritmetica (){
    System.out.println("Ejecutando el Constructor 1");
}

public aritmetica (int a, int b){
    this.a = a;
    this.b = b;
    System.out.println("Ejecutando el Constructor 2");
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
        return this.sumarConRetorno();
    }
}
