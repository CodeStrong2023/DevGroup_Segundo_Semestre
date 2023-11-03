
public class PruebaAritmetica {
    public static void main(String[] args) {

        int a = 10; // Variables locales
        int b = 7; // Mmemoria stack
        miMetodo(); // Llamamos al nuevo método

        Aritmetica aritmetica1 = new Aritmetica();

        aritmetica1.a = 3;
        aritmetica1.b = 7;
        aritmetica1.sumarNumeros();

        // Para almacenar un objeto o los atributos se utiliza la memoria heap
        int resultado = aritmetica1.sumarConRetorno(); 
        System.out.println("Resultado: " + resultado);

        resultado = aritmetica1.sumarConArgumentos(12, 26);
        System.out.println("Resultado usando argumentos: "+ resultado);

        System.out.println("aritmetica1 a: "+aritmetica1.a);
        System.out.println("aritmetica1 b: "+aritmetica1.b);

        Aritmetica aritmetica2 = new Aritmetica(5,8);
        System.out.println("aritmetica2 a: "+aritmetica2.a);
        System.out.println("aritmetica2 b: "+aritmetica2.b);

        //aritmetica1 = null; nunca utilizar esto
        //System.gc(); metodo para lipiar residuos, es pesado, no utilizar
    }

    public static void miMetodo(){
        int a = 10;
        System.out.println("Aquí hay otro método");

    }

}
