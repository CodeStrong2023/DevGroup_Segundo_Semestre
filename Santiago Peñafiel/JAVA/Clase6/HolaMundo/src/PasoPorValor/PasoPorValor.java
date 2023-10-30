/*
mostramos como funciona el paso por valor
 */
package PasoPorValor;

public class PasoPorValor {
    public static void main(String[] args) {
        var valorX= 20;
        System.out.println("valorX = " + valorX);
        cambioValor(valorX); //solo le enviamos una copia
    }
    public static void cambioValor(int arg1){ //parametros por valor
            System.out.println("arg1 = " + arg1);
            arg1 =15;
    }
    
}
