package Leccion4;

public class PruebaAritmetica {
    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 3;
        aritmetica1.b = 7;
        aritmetica1.sumar();
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("Resultado = " + resultado);
        resultado = aritmetica1.sumarConArgumentos(5, 3);
        System.out.println("Resultado = " + resultado);
    }
}
