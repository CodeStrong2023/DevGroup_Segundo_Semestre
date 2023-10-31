import java.util.Scanner;

public class elijeTuPropiaAventura {
    public static void main(String[]args){
        Scanner consol1 = new Scanner(System.in);
        System.out.println("En una noche estrellada, te encuentras en un bosque misterioso:");
        System.out.println("1)Exploras la oscuridad en busca de la fuente de un susurro escalofriante");
        System.out.println("2)Sigues el sandero iluminado hacia una pequeña cabaña acogedora");
        var opcion2 = consol1.nextLine();
        //El usuario escoge “2”:
        String parrafo1 = "Decides seguir el sendero iluminado hacia la pequeña cabaña acogedora. Al llegar a la cabaña, te das cuenta de que hay dos puertas\n" 
                        +    "1) Entras por la puerta de la izquierda\n"
                        +    "2) Optas por la puerta de la derecha\n";
        System.out.println(parrafo1);
        //El usuario escoge “1”:
        var opcion1 = consol1.nextLine();
        String parrafo = "Al abrir la puerta de la izquierda, te encuentras con una habitación llena de tesoros brillantes y mágicos.\n"
                       + "Te maravillas con las joyas y los objetos preciosos que llenan la sala.\n"
                       + "Te das cuenta de que has encontrado el legendario tesoro perdido del bosque.\n"
                       + "Con tu corazón lleno de emoción y riquezas, decides regresar a casa para compartir tu increíble aventura con el mundo. ¡Felicidades, has tenido un final exitoso en tu búsqueda!\n ";
        System.out.println(parrafo);
    }
}
