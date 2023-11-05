import java.util.Scanner;

public class ejercicio1Estaciones {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un mes del año: ");
        var mes = Integer.parseInt(entrada.nextLine());
        var estacion = "Estacion desconocida.";
        if (mes == 1 || mes == 2 || mes == 3){
            estacion = "La estación es verano.";
        } else if (mes == 4 || mes == 5 || mes == 6){
            estacion = "La estación es otoño.";
        } else if (mes == 7 || mes == 8 || mes == 9){
            estacion = "La estación es invierno.";
        } else if (mes == 10 || mes == 11 || mes == 12){
            estacion = "La estación es primavera.";
        }
        System.out.println(estacion);
    }    
}
