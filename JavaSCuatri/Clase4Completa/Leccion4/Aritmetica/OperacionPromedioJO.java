package Clase4Completa.Leccion4.Aritmetica;

import javax.swing.JOptionPane;

// Ejercicios: pedir numeros hasta que se introduzca uno negativo y calcular la media

public class OperacionPromedioJO {
    public static void main(String[] args) {
        
        int numero, conteo = 0, suma = 0;
        float promedio = 0;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        //mientras el num no sea neg
        while(numero >=0){
            suma+= numero; // va sumando
            conteo ++; // va sumando uno a conteo
            
            numero = Integer.parseInt(JOptionPane.showInputDialog("Escriba otro numero: "));
        } // Si ingresa neg no va a sumar, contar, nada. Por eso usamos if
        if(conteo == 0){
            JOptionPane.showMessageDialog(null,"Eror, La division por 0 no existe");
        }
        else{
            promedio = (float) suma/conteo;
            JOptionPane.showMessageDialog(null,"El promedio es: " + promedio);
        }
    }
}
