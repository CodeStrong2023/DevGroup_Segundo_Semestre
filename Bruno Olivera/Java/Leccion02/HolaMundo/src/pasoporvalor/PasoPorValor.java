
package pasoporvalor;

public class PasoPorValor {
    public static void main(String[] args) {
       int valorX = 20; 
       System.out.println("valorX = " + valorX);
       cambioValor(valorX); //solo le enviamos una copia
        System.out.println("valorX = " + valorX);
    }
    
    public static void cambioValor(int arg1){
        System.out.println("arg1 = " + arg1);   
        arg1 = 15;
    }
}
