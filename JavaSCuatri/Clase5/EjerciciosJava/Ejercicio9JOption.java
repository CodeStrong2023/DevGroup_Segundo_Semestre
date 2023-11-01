package Clase5.EjerciciosJava;

import javax.swing.JOptionPane;

// Pedir el dia, mes y año de una fecha e indicar si es correcta.
// Suponiendo que todos los meses tienen 30 dias

public class Ejercicio9JOption {
    public static void main(String[] args) {
        
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Escriba el dia"));

        int mes = Integer.parseInt(JOptionPane.showInputDialog("Escriba el mes: "));

        int anio = Integer.parseInt(JOptionPane.showInputDialog("Escriba el año: "));

        if((dia != 0) && (dia <= 30)){
            if((mes != 0) && (mes <= 12)){
                if((mes != 0) && (anio <= 2023)){
                    JOptionPane.showMessageDialog(null,"La fecha ingresada es: " + dia + "/" + mes + "/" + anio);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Fecha incorrecta, año incorrecto");
                }  
            } 
            else{
                JOptionPane.showMessageDialog(null,"Fecha incorrecta, dia incorrecto");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Fecha incorrecta, dia incorrecto");
        }
    }
}
