public class clase6_pasoPorValor {
    public static void main(String[] args) {
        var valorX = 10;
        System.out.println("valorX: "+valorX);
        cambioValor(valorX);
        System.out.println("valorX: "+valorX);
    }

    public static void cambioValor(int arg1){
        System.out.println("arg1: "+arg1);
    }
}
