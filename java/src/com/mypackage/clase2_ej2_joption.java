import javax.swing.JOptionPane;

public class clase2_ej2_joption {
    public static void main(String[] args) {
        var num = Integer.parseInt(JOptionPane.showInputDialog("Escriba un num: "));
        while(num != 0){
            if(num > 0){
                JOptionPane.showMessageDialog(null, " El num " + num + " es positivo ");
            }
            else{
                JOptionPane.showMessageDialog(null, "El numero" + num + " es negativo ");
            }
            System.out.println(" Escriba un numero: ");
            num = Integer.parseInt(JOptionPane.showInputDialog(" Escriba otro numero: "));
        }
        JOptionPane.showMessageDialog(null, " El numero: "+ num +" finaliza el programa");
    }
    
}
