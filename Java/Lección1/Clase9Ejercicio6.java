package Lección1;

public class Clase9Ejercicio6 {
        public static void main(String[]args) {
        //Ejercicio 6:
        // Guillermo tiene N dólares. Luis tiene la mitad de lo que posee Guillermo. Juan tiene la mitad de lo que poseen
        //Luis y Guillermo juntos. Hacer un programa qe calcule e imprima la cantidad de dinero que tienen entre los tres.
        // Crear un numevo proyecto llamado Ejercicio 6
        var dinerodeGuillermo = 20000;
        System.out.println("Guillermo tiene: $" + dinerodeGuillermo);
        var dinerodeLuis = 10000;
        System.out.println("Luis tiene $ " + dinerodeLuis);
        var dinerodeJuan = 15000;
        System.out.println("Juan tiene $ " + dinerodeJuan);
        var dineroTotal = dinerodeGuillermo + dinerodeLuis + dinerodeJuan; 
        System.out.println("Entre los tres tienen $ " + dineroTotal);
        
    }
}
