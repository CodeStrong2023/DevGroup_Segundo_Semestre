/*
 Ejercicio 9: pedir el dia, mes y año de una fecha e indicar si la fecha es 
correcta. Suponiedo que todos los meses son de 30 dias
 */
package Ciclos09;

import javax.swing.JOptionPane;

public class Ejercicio09 {

    public static void main(String[] args) {
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite un dia: "));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite un mes: "));
        int anio = Integer.parseInt(JOptionPane.showInputDialog("Digite un año: "));

        if ((dia != 0) && (dia <= 30)) {
            if ((mes != 0) && (mes <= 12)) {
                if ((anio != 0) && (anio <= 2023)) {
                    JOptionPane.showMessageDialog(null, "La fecha igresada es: " + dia + "/" + mes + "/" + anio);
                } else {
                    JOptionPane.showMessageDialog(null, "El año ingresado es incorrecto");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El mes ingresado es incorrecto");
            }
        } else {
            JOptionPane.showMessageDialog(null, "El dia ingresado es incorrecto");
        }
    }
}
