
package ciclos09;

import javax.swing.JOptionPane;

public class ejercicio09 {
    public static void main(String[] args) {
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite el dia: "));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes: "));
        int anio = Integer.parseInt(JOptionPane.showInputDialog("Digite el año: "));
        
        if (anio > 0 && anio <= 2022) {
            if (mes >= 1 && mes <= 12) {
                if (dia >= 1 && dia <= 30) {
                    JOptionPane.showMessageDialog(null, "La fecha ingresada es: " + dia + "/" + mes + "/" + anio);
                } else {
                    JOptionPane.showMessageDialog(null, "Fecha incorrecta, día incorrecto");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Fecha incorrecta, mes incorrecto");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Fecha incorrecta, año incorrecto");
        }
    }
}

