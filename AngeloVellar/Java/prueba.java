import javax.swing.JOptionPane;

public class prueba {
    
    public static void main(String[] args) {
         int opcionArmar = 0;
        while (true){
            
            opcionArmar = Integer.parseInt(JOptionPane.showInputDialog("1. Mostrar las comidas disponibles\n" +
            "2. Mostrar las bebidas\n" + "3. Volver atrás\n" ));
            switch(opcionArmar){
                case 1:
                System.out.println("Ingresó 1");
                break;
                case 2:
                 System.out.println("Ingresó 2");
                break;
                case 3:
                JOptionPane.showMessageDialog(null, "Volver atras");
            }
   
    }
 }}
