// Guillermo tiene N dólares. Luis tiene la mitad de lo que posee Guillermo. Juan
// tiene la mitad de lo que poseen Luis y Guillermo juntos. Hacer un programa que
// calcule e imprima la cantidad de dinero que tienen entre los 3.

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class ejercicio6 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite la cantidad de dinero de Guillermo: ");
        float dolarGuille = Float.parseFloat(entrada.nextLine());
        float dolarLuis = dolarGuille / 2;
        float dolarJuan = (dolarGuille + dolarLuis) / 2;
        float dolarTotal = dolarGuille + dolarJuan + dolarLuis;
        System.out.println("El dinero de Guillermo es: U$S " + dolarGuille);
        System.out.println("El dinero de Luis es: U$S " + dolarLuis);
        System.out.println("El dinero de Juan es: U$S " + dolarJuan);
        System.out.println("El total de dinero es: U$S" + dolarTotal);

    }
    
}
