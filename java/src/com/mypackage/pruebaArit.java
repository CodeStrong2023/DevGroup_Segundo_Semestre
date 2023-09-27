public class pruebaArit {
    public static void main(String[] args) {

        miMetodo();

        aritmetica aritmetica1 = new aritmetica();

        aritmetica1.a = 3;
        aritmetica1.b = 7;
        aritmetica1.sumarNumeros();

        int resultado = aritmetica1.sumarConRetorno(); 
        System.out.println("Resultado: " + resultado);

        resultado = aritmetica1.sumarConArgumentos(12, 26);
        System.out.println("Resultado con argumentos: "+ resultado);

        System.out.println("aritmetica1.a: "+aritmetica1.a);
        System.out.println("aritmetica1.b: "+aritmetica1.b);

        aritmetica aritmetica2 = new aritmetica(5,8);
        System.out.println("aritmetica2.a: "+aritmetica2.a);
        System.out.println("aritmetica2.b: "+aritmetica2.b);
    }

    public static void miMetodo(){
        System.out.println("different argument.");

    }
}
