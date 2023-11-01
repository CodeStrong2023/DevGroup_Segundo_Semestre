package Clase5.EjerciciosJava;

import java.util.Scanner;


// Pedir el dia, mes y año de una fecha e indicar si es correcta.
// Suponiendo que todos los meses tienen 30 dias

public class Ejercicio9Ciclos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Escriba el dia: ");
        int dia = Integer.parseInt(entrada.nextLine());

        System.out.println("Escriba el mes: ");
        int mes = Integer.parseInt(entrada.nextLine());

        System.out.println("Escriba el año: ");
        int anio = Integer.parseInt(entrada.nextLine());

        if((dia != 0) && (dia <= 30)){
            if((mes != 0) && (anio <= 2023)){
                System.out.println("La fecha ingresada es: " + dia + "/" + mes + "/" + anio);
            }    
            else{
                System.out.println("Fecha incorrecta, año incorrecto");
            }
        }
        else{
            System.out.println("Fecha incorrecta, dia incorrecto");
        }
        entrada.close();
    }
}

