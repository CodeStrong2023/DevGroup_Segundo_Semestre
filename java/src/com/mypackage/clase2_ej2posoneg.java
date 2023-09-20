import java.util.Scanner;

public class clase2_ej2posoneg {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba un numero para ver si es + o - : ");
        var num = Integer.parseInt(entrada.nextLine());
        while(num != 0){
            if(num > 0){
                System.out.println(" El numero "+num+" es positivo ");
            }
            else{
                System.out.println("El numero es negativo");
            }
            System.out.println("Escriba un numero: ");
            num = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("El numero: "+ num +" finaliza el programa");
        entrada.close();
    }
    
}
