import javax.swing.JOptionPane;

public class mostrarcombos01 {
    public static void main(String[] args) {
        int total = 0;
        String productos = "";
        String user = "nombre_de_usuario";
        String pass = "mi_contraseña";
        String dom = "mi_direccion";
        String cel = "123-456-7890";
        boolean inv_ = false;
        int x = 0;
        mostrarCombos(total, productos, user, pass, dom, cel, inv_, x);
    }

    static void mostrarCombos(int total, String productos, String saved_user, String saved_pass, String saved_dom, String saved_cel, boolean inv, int x) {
        int i, j, opcDom;
        int carro = 0;
        char opcCarrito = 'S'; // Inicializamos opcCarrito en 'S' para entrar al bucle
        int opcEnvio;
        String comboElegido = "";
        String dom_inv;
        String[][] combos = new String[2][2];
        double[][] precioCombos = new double[2][2];
        double precio = 0;
        int opcionCombo;

        while (opcCarrito == 'S' || opcCarrito == 's') {
            JOptionPane.showMessageDialog(null, "Combos disponibles"); // Muestra la lista de combos

            // Llenamos matriz de combos
            combos[0][0] = "1) Pizza especial + papas + cerveza + helado";
            combos[0][1] = "2) Milanesa + papas + cerveza + helado";
            combos[1][0] = "3) Pancho + papas + cerveza + helado";
            combos[1][1] = "4) Empanadas + papas + cerveza + helado";

            JOptionPane.showMessageDialog(null, "Elige un combo");

            // Llenamos matriz de precios de combos
            precioCombos[0][0] = 3500;
            precioCombos[0][1] = 4000;
            precioCombos[1][0] = 1800;
            precioCombos[1][1] = 3000;

            String message = "Combos disponibles y sus precios:\n";
            for (i = 0; i < 2; i++) {
                for (j = 0; j < 2; j++) {
                    message += combos[i][j] + " $ " + precioCombos[i][j] + "\n";
                }
            }
            JOptionPane.showMessageDialog(null, message);

            opcionCombo = 0;
            while (opcionCombo < 1 || opcionCombo > 4) {
                String input = JOptionPane.showInputDialog("Ingrese el número de combo que desea: ");
                opcionCombo = Integer.parseInt(input);

                switch (opcionCombo) {
                    case 1:
                        comboElegido = "Pizza especial + papas + cerveza + helado";
                        precio += precioCombos[0][0];
                        break;
                    case 2:
                        comboElegido = "Milanesa + papas + cerveza + helado";
                        precio += precioCombos[0][1];
                        break;
                    case 3:
                        comboElegido = "Pancho + papas + cerveza + helado";
                        precio += precioCombos[1][0];
                        break;
                    case 4:
                        comboElegido = "Empanadas + papas + cerveza + helado";
                        precio += precioCombos[1][1];
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Valor ingresado no válido. Ingrese nuevamente.");
                }
            }

            // Mostrar resultados
            carro = Carrito(total, precio);
            productos = ProductosCarrito(productos, comboElegido);
            mostrar_carrito(carro, productos);

            String response = JOptionPane.showInputDialog("¿Desea agregar algo más al carrito? (S/N) ");
            opcCarrito = response.charAt(0);
        }

        if (opcCarrito == 'N' || opcCarrito == 'n') {
            mostrar_carrito(carro, productos);
            opcEnvio = Integer.parseInt(JOptionPane.showInputDialog("Desea...\n1 - Retirar en el local.\n2 - Envío a domicilio."));

            if (opcEnvio == 2) {
                JOptionPane.showMessageDialog(null, "Ha seleccionado -Envío a Domicilio-");
                JOptionPane.showMessageDialog(null, "El costo de envío es de $200.");
                JOptionPane.showMessageDialog(null, "El monto total es de: $ " + (carro + 200));

                if (inv) {
                    dom_inv = JOptionPane.showInputDialog("Por favor, ingrese su domicilio: ");
                    fin_compra();
                } else {
                    if (saved_dom.equals("")) {
                        saved_dom = JOptionPane.showInputDialog("Domicilio No cargado. Por Favor Ingrese su domicilio: ");
                        fin_compra();
                    } else {
                        fin_compra();
                    }
                }
            } else {
                if (opcEnvio == 1) {
                    JOptionPane.showMessageDialog(null, "Ha seleccionado -Retirar en el local-");
                    JOptionPane.showMessageDialog(null, "El monto total es de: $ " + carro);
                }
            }
        }
    }

    static int Carrito(int total, double precio) {
        return total + (int) precio;
    }

    static String ProductosCarrito(String productos, String comboElegido) {
        if (productos.isEmpty()) {
            productos = comboElegido;
        } else {
            productos += ", " + comboElegido;
        }
        return productos;
    }

    static void mostrar_carrito(int carro, String productos) {
        JOptionPane.showMessageDialog(null, "Productos en el carrito: " + productos + "\nTotal: $" + carro);
    }

    static void fin_compra() {
        
    }
}
