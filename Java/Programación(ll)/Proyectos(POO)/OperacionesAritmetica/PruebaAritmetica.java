package Operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        var a = 10; //Variables locales
        int b = 7; //Memoria stack
        miMetodo();
                        //OBJETO 1
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 3;
        aritmetica1.b = 7;
        aritmetica1.sumarNumeros();
        //Para almacenar un objeto o los atributos se utiliza la memorio heap
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado = " + resultado);
        resultado = aritmetica1.sumarConArgumentos(12,26);
        System.out.println("Resultado usando argumentos = " + resultado);

        System.out.println("aritemetica1 a: " +aritmetica1.a);
        System.out.println("aritemetica1 b: " +aritmetica1.b);

                        //OBJETO 2
        Aritmetica aritmetica2 = new Aritmetica(5,8);
        System.out.println("aritmetica2 = " + aritmetica2.a);
        System.out.println("aritmetica2 = " + aritmetica2.b);

        //aritmetica1 = null = nunca utilizar esto, no se debe hacer
        //System.gc(); método para limpiar residuos, es pesado, no utlizarlo

    }

    public static void miMetodo(){
        //int a = 10;
        System.out.println("Aquí hay otro método");


        
    }
}
