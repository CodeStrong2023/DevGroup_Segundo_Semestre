
import javax.swing.JOptionPane;



public class mostrarComidas01 {
    static int x = 0; // Variable estática para llevar el conteo de productos en el carrito

    public static void main(String[] args) {
        int i, j;
        int opcion, carro = 0;
        int opcEnvio = 0;
        String[][] comidas = new String[4][4];
        String comidaElegida = "";
        String dom_inv = "";
        double precio = 0;
        double precioComida = 0;
        double[][] preciosComida = new double[4][4];
        String[] productos = new String[100];
        double total = 0.0;
        boolean inv = true;
        String saved_user = "";
        String saved_pass = "";
        String saved_dom = "";
        String saved_cel = "";

        // Inicializar variable precio
        precio = 0;

        // Llenar matriz de comidas
        comidas[0][0] = "1) Pizza cuatro quesos";
        comidas[0][1] = "2) Pizza de peperoni";
        comidas[0][2] = "3) Pizza napolitana";
        comidas[0][3] = "4) Pizza fugazzeta";
        comidas[1][0] = "5) Empanadas de jamón y queso";
        comidas[1][1] = "6) Empanadas árabes";
        comidas[1][2] = "7) Empanadas de soja";
        comidas[1][3] = "8) Empanadas de carne";
        comidas[2][0] = "9) Papas con cheddar";
        comidas[2][1] = "10) Papas con crema";
        comidas[2][2] = "11) Papas a caballo";
        comidas[2][3] = "12) Papas con salsa";
        comidas[3][0] = "13) Milanesa napolitana";
        comidas[3][1] = "14) Milanesa a caballo";
        comidas[3][2] = "15) Milanesa suiza";
        comidas[3][3] = "16) Milanesa de berenjena";

        // Llenar matriz de precios de comidas
        preciosComida[0][0] = 800;
        preciosComida[0][1] = 750;
        preciosComida[0][2] = 900;
        preciosComida[0][3] = 880;
        preciosComida[1][0] = 1000;
        preciosComida[1][1] = 950;
        preciosComida[1][2] = 920;
        preciosComida[1][3] = 950;
        preciosComida[2][0] = 600;
        preciosComida[2][1] = 550;
        preciosComida[2][2] = 700;
        preciosComida[2][3] = 500;
        preciosComida[3][0] = 800;
        preciosComida[3][1] = 850;
        preciosComida[3][2] = 750;
        preciosComida[3][3] = 500;

        // Mostrar comidas
        StringBuilder message = new StringBuilder();
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                message.append(comidas[i][j]).append(" $ ").append(preciosComida[i][j]).append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, message.toString());

        String input = JOptionPane.showInputDialog("Ingrese la opción que desee: ");
        opcion = Integer.parseInt(input);

        switch (opcion) {
            case 1:
                comidaElegida = "Pizza cuatro quesos";
                precio += preciosComida[0][0];
                break;
            case 2:
                comidaElegida = "Pizza de peperoni";
                precio += preciosComida[0][1];
                break;
            case 3:
                comidaElegida = "Pizza napolitana";
                precio += preciosComida[0][2];
                break;
            case 4:
                comidaElegida = "Pizza fugazzeta";
                precio += preciosComida[0][3];
                break;
            case 5:
                comidaElegida = "Empanadas de jamón y queso";
                precio += preciosComida[1][0];
                break;
            case 6:
                comidaElegida = "Empanadas árabes";
                precio += preciosComida[1][1];
                break;
            case 7:
                comidaElegida = "Empanadas de soja";
                precio += preciosComida[1][2];
                break;
            case 8:
                comidaElegida = "Empanadas de carne";
                precio += preciosComida[1][3];
                break;
            case 9:
                comidaElegida = "Papas con cheddar";
                precio += preciosComida[2][0];
                break;
            case 10:
                comidaElegida = "Papas con crema";
                precio += preciosComida[2][1];
                break;
            case 11:
                comidaElegida = "Papas a caballo";
                precio += preciosComida[2][2];
                break;
            case 12:
                comidaElegida = "Papas con salsa";
                precio += preciosComida[2][3];
                break;
            case 13:
                comidaElegida = "Milanesa napolitana";
                precio += preciosComida[3][0];
                break;
            case 14:
                comidaElegida = "Milanesa a caballo";
                precio += preciosComida[3][1];
                break;
            case 15:
                comidaElegida = "Milanesa suiza";
                precio += preciosComida[3][2];
                break;
            case 16:
                comidaElegida = "Milanesa de berenjena";
                precio += preciosComida[3][3];
                break;
        }

        JOptionPane.showMessageDialog(null, "Se ha añadido al carrito: " + comidaElegida);

        // Mostrarmos la opción elegida que se añadió al carrito
        // Damos la opción al usuario de agregar o no más productos al carrito
        char opcCarrito = ' ';
        do {
            input = JOptionPane.showInputDialog("¿Desea agregar algo más al carrito? (S/N) ");
            opcCarrito = input.charAt(0);

            if (opcCarrito == 'S' || opcCarrito == 's') {
                carro = Carrito(total, precio);
                productos = ProductosCarrito(productos, comidaElegida);
                mostrarCarrito(carro, productos);
                opcArmar(saved_user, saved_pass, saved_dom, saved_cel, inv, x, total, productos);
            } else {
                if (opcCarrito == 'N' || opcCarrito == 'n') {
                    carro = Carrito(total, precio);
                    productos = ProductosCarrito(productos, comidaElegida);

                    Object[] options = {"Retirar en el local", "Envío a domicilio"};
                    int choice = JOptionPane.showOptionDialog(null, "Desea...", "Opción de envío", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

                    if (choice == 1) {
                        JOptionPane.showMessageDialog(null, "Ha seleccionado -Envío a Domicilio-\nEl costo de envío es de $200.\nEl monto total es de: $ " + (carro + 200));

                        if (inv) {
                            dom_inv = JOptionPane.showInputDialog("Por Favor Ingrese su domicilio: ");
                        } else {
                            if (saved_dom.equals("")) {
                                saved_dom = JOptionPane.showInputDialog("Domicilio No cargado. Por Favor Ingrese su domicilio: ");
                            }
                        }
                        fin_compra();
                    } else {
                        if (choice == 0) {
                            JOptionPane.showMessageDialog(null, "Ha seleccionado -Retirar en el local-\nEl monto total es de: $ " + carro);
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Error. Opción no válida. Ingrese nuevamente.");
                }
            }
        } while (opcCarrito == 'N' || opcCarrito == 'n' || opcCarrito == 'S' || opcCarrito == 's');

        JOptionPane.showMessageDialog(null, " ");
    }

    // Método para calcular el total del carrito
    public static int Carrito(double total, double precio) {
        return (int) (total + precio);
    }

    // Método para agregar productos al carrito
    public static String[] ProductosCarrito(String[] productos, String producto) {
        productos[x] = producto;
        x++;
        return productos;
    }

    // Método para mostrar el contenido del carrito
    public static void mostrarCarrito(int carro, String[] productos) {
        StringBuilder message = new StringBuilder("Contenido del carrito:\n");
        for (int i = 0; i < x; i++) {
            message.append(productos[i]).append("\n");
        }
        JOptionPane.showMessageDialog(null, message.toString() + "Monto total en el carrito: $" + carro);
    }

    // Método para realizar la opción de armar
    public static void opcArmar(String saved_user, String saved_pass, String saved_dom, String saved_cel, boolean inv, int x, double total, String[] productos) {
        // Implementa la lógica de la opción "opcArmar" aquí
    }

    // Método para finalizar la compra
    public static void fin_compra() {
        // Implementa la lógica para finalizar la compra aquí
    }
}

