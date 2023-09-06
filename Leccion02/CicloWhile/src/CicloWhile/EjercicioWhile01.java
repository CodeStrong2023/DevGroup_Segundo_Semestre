package CicloWhile;

public class EjercicioWhile01 {

    public static void main(String[] args) {
        int conteo = 0;
        while (conteo < 3) {
            System.out.println("conteo = " + conteo);
            conteo++;
        }

        int contador = 0;
        do {
            System.out.println("contador = " + contador);
            contador++;
        } while (contador <= 7);
        inicio:
        for (int contando = 0; contando < 7; contando++) {
            if (contando % 2 == 0) {
                System.out.println("contando = " + contando);
                break inicio;
            }
        }
        for (int contando = 0; contando < 7; contando++) {
            if (contando % 2 == 0) {
                continue;
            }
            System.out.println("contando = " + contando);
        }
    }
}
