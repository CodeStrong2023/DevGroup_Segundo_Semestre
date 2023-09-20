public class clase1{
    public static void main(String[] args) {
        var conteo = 0;

        while (conteo < 7) {
            System.out.println("Conteo = " + conteo);
            conteo++;

            var contador = 0;
            do{
                System.out.println("contador = " + contador);
                contador++;
            }while (contador <= 7);

            for( var cont = 0 ; cont < 7 ; cont++) {
                System.out.println(" cont = " + cont);
            }

            for( var cont = 0 ; cont < 7 ; cont++){
                if(cont % 2 == 0){
                System.out.println(" cont = " + cont);
                break;
                }
            }

            for( var cont = 0 ; cont < 7 ; cont++){
                if(cont % 2 != 0){
                    continue;
                }
                System.out.println(" cont = " + cont);
            }

            inicio:
            for (var cont1 = 0 ; cont1 < 7 ; cont1++){
                if (cont1 % 2 != 0) {
                    continue inicio;
                }
                System.out.println(" cont1 = " + cont1);
            }
        }
    }
}
