package repasoExtrafacultad;

import java.util.Scanner;

//Determinar si un alumno arpueba o reprueba un curso, sbaiendo que aprobara si su promedio de tres calificaciones es mayor 
// o igual a 70 repurb
public class numPrimos {
    public static void main(String[] args) {
       
        Scanner consola1 = new Scanner(System.in);
        System.out.println("Digite la primer calificación: ");
        var nota1 = Integer.parseInt(consola1.nextLine());
        System.out.println("Digite la segunda calificación: ");
        var nota2 = Integer.parseInt(consola1.nextLine());
        System.out.println("Digite la tercera calificación: ");
        var nota3 = Integer.parseInt(consola1.nextLine());

        var suma = (nota1 + nota2 + nota3);
        Double promedio = Double.valueOf(suma) / 3.0;

        if (promedio >= 70) {
            System.out.println("El alumno está aprobado con: " + promedio);
        }
        else {
            System.out.println("El alumno está desaprobado con: " + promedio);

            }
         

        
    }

           
    
        
            
        
}
  