
package menu;

import javax.swing.JOptionPane;


public class Menu {
    public static void menu {
    
        if (inv = false) {
         JOptionPane.showMessageDialog(null, "Bienvenido: " + saved_user[x]);
         }
        else {
            JOptionPane.showMessageDialog(null, "Bienvenido ");
            JOptionPane.showMessageDialog(null, "\n Ha ingresado como invitado ");          
        }
        JOptionPane.showMessageDialog(null, "\n       MENU         ");
        
//creamos las variables y se inicializan en 0 por defecto
        int opcion, opcionComprar;
        JOptionPane.showMessageDialog(null, " ");
        //mostrar menu
        JOptionPane.showMessageDialog(null, "1: Comprar un combo");
        JOptionPane.showMessageDialog(null, "2: Armar Pedido");
        opcion = Integer.parseInt(JOptionPane.showInputDialog("\nIngrese una opcion"));
        //tras elegir una opcion
               
        switch(opcion) {
            case 1:
                opcComprar(saved_user,saved_pass,saved_dom,saved_cel,inv,x,total,productos);
            break;
            case 2:
                opcArmar(saved_user,saved_pass,saved_dom,saved_cel,inv,x,total,productos);          
            break;
            }
                
        
    }
}
