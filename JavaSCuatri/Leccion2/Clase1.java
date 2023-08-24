package Leccion2;
public class Clase1{
    public static void main(String[] args) {
        var conteo = 0; // inf de tipo
        // CICLO WHILE
        while (conteo < 7) { // si esta condicion no se cumple, no podremos ver el codigo del prog
            System.out.println("Conteo = " + conteo);
            conteo++; // va incrementando uno

            // ciclo Do WHILE: Por lo menos una vez se ejecuta el ciclo
            var contador = 0;
            do{
                System.out.println("contador = " + contador);
                contador++;
            }while (contador <= 7);

            // 1er espacio se declara la variable, 2do condicion a cumplir, 3ro: incremento o decremento de la var(recorrido)
            for( var cont = 0 ; cont < 7 ; cont++) {
                System.out.println(" cont = " + cont);
            }
            // Palabra break
            for( var cont = 0 ; cont < 7 ; cont++){
                if(cont % 2 == 0){
                System.out.println(" cont = " + cont);
                break;
                }
            }
             
            // para saltar numeros impares..

            for( var cont = 0 ; cont < 7 ; cont++){
                if(cont % 2 != 0){
                    continue; // pasa a la siguiente iteracion, cuando encuentra un numero impar e imprime el par
                }
                System.out.println(" cont = " + cont);
            }

            // uso de etiquetas (LABELS). Nos sirve para indicar a las palabras continue y break ir hacia un punto
            // especifico del programa.

            // Uso de la palabra break y continue junto a las etiquetas
            inicio:
            for (var cont1 = 0 ; cont1 < 7 ; cont1++){
                if (cont1 % 2 != 0) {
                    continue inicio; // pasa a la sgte iteracion
                }
                System.out.println(" cont1 = " + cont1);
            }
            





        }
    }
}