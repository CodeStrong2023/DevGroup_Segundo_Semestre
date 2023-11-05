import javax.swing.JOptionPane;

public class mostrarcombos01 {
    public static void main(String[] args) {
        int total = 0;
        String productos = "";
        String users = "nombre_de_usuario";
        String pass = "mi_contraseña";
        String dom = "mi_direccion";
        String cel = "123-456-7890";
        boolean inv_ = false;
        int x = 0;
        mostrarCombos(total, productos, users, pass, dom, cel, inv_, x);
    }

    static void mostrarCombos(int total, String productos, String users, String pass, String dom, String cel, boolean inv, int x) {
        int i, j, opcDom;
        int carro = 0;
        char opcCarrito = 'S'; // Inicializamos opcCarrito en 'S' para entrar al bucle
        int opcEnvio;
        String comboElegido = "";
        String dom_inv;
        String[] combos = {
            "Pizza especial + papas + cerveza + helado",
            "Milanesa + papas + cerveza + helado",
            "Pancho + papas + cerveza + helado",
            "Empanadas + papas + cerveza + helado"
        };
        double[] precioCombos = { 3500, 4000, 1800, 3000 };
        double precio = 0; // Declarar precio e inicializarlo a 0
        int opcionComboIndex;

        while (opcCarrito == 'S' || opcCarrito == 's') {
            JOptionPane.showMessageDialog(null, "Combos disponibles"); // Muestra la lista de combos

            Object selectedCombo = JOptionPane.showInputDialog(null, "Elige un combo:", "Selección de Combo", JOptionPane.QUESTION_MESSAGE, null, combos, combos[0]);

            if (selectedCombo != null) {
                comboElegido = selectedCombo.toString();
                for (i = 0; i < combos.length; i++) {
                    if (combos[i].equals(comboElegido)) {
                        precio += precioCombos[i];
                        break;
                    }
                }

                // Mostrar resultados
                carro = Carrito(total, precio);
                productos = ProductosCarrito(productos, comboElegido);
                mostrarCarrito(carro, productos);

                Object[] options = {"Sí", "No"};
                int response = JOptionPane.showOptionDialog(null, "¿Desea agregar algo más al carrito?", "Agregar al Carrito", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

                if (response == JOptionPane.NO_OPTION) {
                    opcCarrito = 'N';
                }
            } else {
                JOptionPane.showMessageDialog(null, "Combo no válido. Por favor, elija nuevamente.");
            }
        }

        if (opcCarrito == 'N' || opcCarrito == 'n') {
            mostrarCarrito(carro, productos);

            String[] envioOptions = {"Retirar en el local", "Envío a domicilio"};
            opcEnvio = JOptionPane.showOptionDialog(null, "Desea...", "Opciones de Envío", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, envioOptions, envioOptions[0]);

            if (opcEnvio == 1) {
                JOptionPane.showMessageDialog(null, "Ha seleccionado -Envío a Domicilio-");
                JOptionPane.showMessageDialog(null, "El costo de envío es de $200.");
                JOptionPane.showMessageDialog(null, "El monto total es de: $ " + (carro + 200));

                if (inv) {
                    dom_inv = JOptionPane.showInputDialog("Por favor, ingrese su domicilio: ");
                    finCompra();
                } else {
                    if (dom.equals("")) {
                        dom = JOptionPane.showInputDialog("Domicilio No cargado. Por Favor Ingrese su domicilio: ");
                        finCompra();
                    } else {
                        finCompra();
                    }
                }
            } else {
                if (opcEnvio == 0) {
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

    static void mostrarCarrito(int carro, String productos) {
        JOptionPane.showMessageDialog(null, "Productos en el carrito: " + productos + "\nTotal: $" + carro);
    }

    static void finCompra() {
        JOptionPane.showMessageDialog(null, "¡Gracias por realizar su compra! Su pedido será entregado pronto.");
    }
}
