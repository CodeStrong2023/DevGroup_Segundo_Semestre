import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un número de mes: ");
        var mes = Integer.parseInt(entrada.nextLine());
        var estacion = "Estación desconocida.";
        switch(mes){
            case 1: case 2: case 3:
                estacion = "La estación es Verano.";
                break;
            case 4: case 5: case 6:
                estacion = "La estación es Otoño";
                break;
            case 7: case 8: case 9:
                estacion = "La estación es Invierno";
                break;
            case 10: case 11: case 12:
                estacion = "La estación es Primavera";
        }
        System.out.println(estacion);
    }
    
}
