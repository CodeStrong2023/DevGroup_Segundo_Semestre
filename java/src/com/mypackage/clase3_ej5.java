import java.util.Scanner;

public class clase3_ej5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, aleator, cont = 0;
        /// generar un num aleatorio 
        aleator = (int)(Math.random()*100); // conv a entero, genera un aleatorio

        do{
            System.out.println("Escriba un numero: ");
            numero = Integer.parseInt(entrada.nextLine());
            /// una vez que ingresa el num:

            if(numero < aleator){
                System.out.println("Ingrese un numero mayor");
            }
            else if(numero > aleator){
                System.out.println("Ingrese un numero menor");
            }
            else{ // se nuestra una vez que acierta el num
                System.out.println("¡FELICIDADES! Acertaste");
            }
            cont++;
        } while(numero != aleator); // repetir hasta q num sea distinto de aleatorio
        System.out.println("Adivinaste el numero " + aleator + " en: " + cont + " intentos");
        entrada.close();
    }
}
