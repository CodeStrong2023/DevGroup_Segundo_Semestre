import javax.swing.JOptionPane;

public class clase4_ej6_jPane {
    public static void main(String[] args){
         int numero, suma = 0;
         do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Escriba un numero: "));
            suma+= numero;
        
         }while(numero != 0);
         JOptionPane.showMessageDialog(null,"La suma de todos los num ingresados es: " + suma);   
            
    }
}
