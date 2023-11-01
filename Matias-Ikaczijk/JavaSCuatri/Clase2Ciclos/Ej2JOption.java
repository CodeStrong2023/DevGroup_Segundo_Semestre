package Clase2Ciclos;

import javax.swing.JOptionPane;

//  Ejercicio2= leer un numero e indicar si es pos o neg. 
// se repite el proc hasta que ingrese 0


public class Ej2JOption {
    public static void main(String[] args) {
        // con integer.parseInt nos ayuda a eliminar elproblema con el tipo de dato
        // tipo string a entero
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
