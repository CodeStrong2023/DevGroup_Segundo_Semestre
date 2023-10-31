package Lección1;

import java.util.Scanner;

public class Clase9Ejercicio7 {
      public static void main(String[]args) {
       /* Una compañia de venta de carros usados, paga a su personal de ventas un salario de $1000 mensuales mas una 
       comisión de $150 por cada carro vendido, más el 5% del valor de la venta por carro. Cada mes el capturista de la empresa
       ingresa en la computadora los datos pertinentes.
       Hacer un programa que calcule e imprima el salario mensual de un vendedor dado.
       El salario de 1000 lo vamos a manejar como un dato constante, para asignarlo debemos usar la palabra reservada "final"
        */ 
        
      final int sueldoMensual = 1000;
      Scanner scanner1 = new Scanner(System.in);
      System.out.println("Ingrese la cantidad de autos vendidos este mes:");
      var autosVendidos = Integer.parseInt(scanner1.nextLine());
      int comisionVendidos = autosVendidos * 150;
      float porcentajeVenta = comisionVendidos * 0.05F;
        
      float sueldoTotalMes = sueldoMensual + comisionVendidos + porcentajeVenta;
      System.out.println("El salario mensual total de este mes fue de = $" + sueldoTotalMes);

        









      }
}
