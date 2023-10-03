import java.util.Scanner;

public class repasoArreglos2 {
    public static void main(String[] args) {
        //1) Crea un array de 10 posiciones de números con valores pedidos por teclado.
        // Muestra por consola el indice y el valor al que corresponde.
        // Haz dos métodos, uno para rellenar valores y otro para mostrar.
        Scanner consola = new Scanner(System.in);
        int numeros[] = new int[10];
        int contador = 0;
         while (contador < 10) {
            System.out.print("Digite un número: ");
            int numero = consola.nextInt();
            numeros[contador] = numero;
            contador++;
        }
        contador = 0;
        while(contador < 10){
              System.out.println("Indice: " +contador+ " El valor es: " + numeros[contador]);
              contador++;
        }
                    //Acá lo hacemos con el ciclo for 

          /*  for( int contador = 0; contador < 10; contador++){
                System.out.print("Digite un número: ");
                int numero = consola.nextInt();
                numeros[contador] = numero;
                
        
            }
            */
    consola.close();

            

    }
}
