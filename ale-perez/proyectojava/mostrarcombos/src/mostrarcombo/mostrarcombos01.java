import java.util.Arrays;
import javax.swing.JOptionPane;

public class mostrarcombos01 {
    public static void main(String[] args) {
        int total = 0;
        String productos = "";
        boolean inv = true;
        String dom = "";

        mostrarcombos01(total, productos, dom, inv);
    }

    static void mostrarcombos01(int total, String productos, String dom, boolean inv) {
        int i, opcEnvio;
        String dom_inv;
        String[][] combos = {
            {"Pizza especial", "papas", "cerveza", "helado"},
            {"Milanesa", "papas", "cerveza", "helado"},
            {"Pancho", "papas", "cerveza", "helado"},
            {"Empanadas", "papas", "cerveza", "helado"}
        };
        double[] precioCombos = {3500, 4000, 1800, 3000};
        double precio = 0;

        char opcCarrito = 'S';

        while (opcCarrito == 'S' || opcCarrito == 's') {
            String[] comboOptions = new String[combos.length];
            for (i = 0; i < combos.length; i++) {
                comboOptions[i] = "Combo " + (i + 1) + ": " + String.join(" + ", combos[i]);
            }

            Object selectedCombo = JOptionPane.showInputDialog(null, "Elige un combo:", "Selección de Combo", JOptionPane.QUESTION_MESSAGE, null, comboOptions, comboOptions[0]);

            if (selectedCombo != null) {
                int comboIndex = Arrays.asList(comboOptions).indexOf(selectedCombo);
                precio += precioCombos[comboIndex];
                total = Carrito(total, precio);
                productos = ProductosCarrito(productos, selectedCombo.toString());
                mostrarCarrito(total, productos);

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
            mostrarCarrito(total, productos);

            String[] envioOptions = {"Retirar en el local", "Envío a domicilio"};
            opcEnvio = JOptionPane.showOptionDialog(null, "Desea...", "Opciones de Envío", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, envioOptions, envioOptions[0]);

            if (opcEnvio == 1) {
                JOptionPane.showMessageDialog(null, "Ha seleccionado -Envío a Domicilio-");
                JOptionPane.showMessageDialog(null, "El costo de envío es de $200.");
                JOptionPane.showMessageDialog(null, "El monto total es de: $ " + (total + 200));

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
                    JOptionPane.showMessageDialog(null, "El monto total es de: $ " + total);
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

    static void mostrarCarrito(int total, String productos) {
        JOptionPane.showMessageDialog(null, "Productos en el carrito: " + productos + "\nTotal: $" + total);
    }

    static void finCompra() {
        JOptionPane.showMessageDialog(null, "¡Gracias por realizar su compra! Su pedido será entregado pronto.");
    }
}
