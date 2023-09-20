public class clase5_object {
    int a = 7;
    int b = 3;
    public static void main(String[] args) {
        Operaciones aritmetica1 = new Operaciones();
        aritmetica1.a = 3;
        aritmetica1.b = 7;
        aritmetica1.sumaNum();

        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("Resultado: " + resultado);

        resultado = aritmetica1.sumarConArgumentos(12, 26);
        System.out.println("Resultado usando argumentos: " + resultado);
        

    }
}
