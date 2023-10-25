import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio10Clase6 {
    //Ejercicio 10: Pedir 10 números y escribir la suma total
    //Hacerlo con la clase Scanner y JOptionPane

                            //CLASE SCANNER 
    /*
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int numeros = 0 , suma = 0; 
        for(int i = 1; i <= 10; i++){
                System.out.println("Ingrese un número");
                numeros = Integer.parseInt(consola.nextLine());
                suma+= numeros;
           }

        System.out.println("La suma total de los números ingresados es de: "+suma);
        consola.close();
    } 
}
*/  

                            //CLASE JOptionPane

     public static void main(String[] args) {
        int numeros = 0 , suma = 0; 
        for(int i = 1; i <= 10; i++){
                numeros = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
                suma+= numeros;
           }

        JOptionPane.showMessageDialog(null,"La suma total de los números ingresados es de: "+suma);
    }
}