import java.util.Scanner;

public class ejercicio9Clase5 {
    public static void main(String[] args) {
    //Ejercicio 9: Pedir el día, mes y año de una fecha e indicar si la fecha es  correcta
    //Suponiendo que todos los meses son de 30 días.

    Scanner consola = new Scanner(System.in);
    System.out.print("Ingrese el día: ");
    int dia = Integer.parseInt(consola.nextLine());
    System.out.print("Ingrese el mes: ");
    int mes = Integer.parseInt(consola.nextLine());
    System.out.print("Ingrese el año: ");
    int año = Integer.parseInt(consola.nextLine());        
    if((dia != 0)&&(dia <= 30)){
         if((mes != 0)&&(mes <= 12)){
            if((año != 0)&&(año <= 2022)){
                System.out.println("La fecha ingresada es: "+dia+"/"+mes+"/"+año);
            }
            else{
                System.out.println("Fecha incorrecta, año incorrecto");
            }
    
         }
         else{
            System.out.println("Fecha incorrecta, mes incorrecto");
         }
    }
    else{
        System.out.println("Fecha incorrecta, día incorrecto");
    }  


    consola.close();

    }
}
