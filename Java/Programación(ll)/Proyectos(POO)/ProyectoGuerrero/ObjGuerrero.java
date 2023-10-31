package Clases;
                            
                                //OBJETOS
public class ObjGuerrero {
    public static void main(String[] args) {
        Guerrero g1 = new Guerrero();
        Guerrero g2 = new Guerrero();
        g1.setNombre("Aragon");
        g1.setFuerza(70);
    /* 
        g1.salud = "60";

        g2.nombre = "Legolas";
        g2.fuerza = "23";
        g2.salud = "70";
*/
        System.out.println("El nombre del guerrero s:" + g1.getNombre());
        System.out.println("La fuerza del guerrero es:" + g1.getFuerza());
      
    }
}
