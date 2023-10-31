import javax.swing.JOptionPane;

public class ejercicio1Clase7 {
    //Ejercicio 11: Diseñar un programa que muestre el producto de los 10 primeros impares
    //Hacerlo con JOptionPane
    public static void main(String[] args) {
        long producto = 1;
        for(int i = 1; i<=20 ; i+=2){ //El aumento apunta a los impares
            producto *= i;
        }
        JOptionPane.showMessageDialog(null,"El producto de los números impares es:"+producto);
    }
}
