
package Ciclos09;

import javax.swing.JOptionPane;


public class Ejercicio09 {
    public static void main(String[] args) {
 
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite el día: "));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes: "));
        int anio = Integer.parseInt(JOptionPane.showInputDialog("Digite el año: "));
        
        if ( (dia != 0) && (dia <= 30) ) {
            if ( (mes != 0) && (mes <= 12))  {
                if ((anio != 0 ) && (mes <= 12)) {
                    JOptionPane.showInputDialog(null,  "La fecha ingresa es: " + dia +"/"+ mes +"/"+ anio);
                    
                }
                else {
                    JOptionPane.showInputDialog(null, "Fecha incorrecta, año incorrecto");
                   
                }
                  
            }
            else {
                 JOptionPane.showInputDialog(null, "Fecha incorrecta, mes incorrecto");
            }
        }
        else{
            JOptionPane.showInputDialog(null, "Fecha incorrecta, día incorrecto");
        }
    }
}
