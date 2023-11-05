/* Una compañía de carros usados, paga a su personal de ventas un salario de $1000
 * mensuales más una comisión de $150 por cada carro vendido, más el 5% del valor de
 * la venta por carro. Cada mes el capturista de la empresa ingresa en la computadora
 * los datos pertinentes.
 * Hacer un programa que calcule e imprima el salario mensual de un vendedor dado.
 * El salario de $1000 lo vamos a manejar como un dato constante, para asignarlo debemos
 * utilizar la palabra reservada final.
 */

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        final int salarioFijo = 1000;
        int comision = 150, venta;
        float salarioMensual, ventaCarro, totalCarro;

        System.out.println("Ingrese el numero de carros vendidos por el vendedor: ");
        venta = Integer.parseInt(entrada.nextLine());
        System.out.println("Indique el promedio del precio de los carros vendidos:");
        totalCarro = Float.parseFloat(entrada.nextLine());

        comision *= venta;
        ventaCarro = (totalCarro * 0.05f) * venta;
        salarioMensual = salarioFijo + comision + ventaCarro;
        System.out.println("El salario mensual del vendedor es: $ " + salarioMensual);

    }
    
}
