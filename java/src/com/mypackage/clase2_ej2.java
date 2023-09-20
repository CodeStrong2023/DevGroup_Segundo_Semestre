import javax.swing.JOptionPane;

public class clase2_ej2 {
    public static void main(String[] args) {
        int numero, cuadrado;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Escriba un numero: "));
       
        while(numero >=0){
            cuadrado = (int)Math.pow(numero, 2);
            System.out.println("El numero "+numero+" elevado al cuadrado es: "+cuadrado);
            
            numero = Integer.parseInt(JOptionPane.showInputDialog("Escriba otro numero: "));
        }
        System.out.println("El programa ha finalizado por un numero negativo");   
        
    }
    
}
