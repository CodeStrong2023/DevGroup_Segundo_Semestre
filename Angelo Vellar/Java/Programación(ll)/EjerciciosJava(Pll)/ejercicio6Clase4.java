import java.util.Scanner;

public class ejercicio6Clase4 {
    //Ejercicio 6: Pedir números hasta que se teclee un 0, mostrar la suma de todos
    //los númeos introducidos
    public static void main(String[] args) {
        Scanner entrada1 = new Scanner(System.in);
        int num,sum = 0;
       
        do { 
             System.out.println("Digite un número");
             num = Integer.parseInt(entrada1.nextLine());
             sum+= num;
        } while (num != 0);

         System.out.println("La suma de todos los numeros ingresados es: "+ sum);
        entrada1.close();    
    }
    
    
}
