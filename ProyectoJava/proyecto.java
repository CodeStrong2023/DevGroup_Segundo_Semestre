package ProyectoJava;

import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import ProyectoJava.user;

public class proyecto {
    public static void clearScreen() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
    static boolean inv = false; // variable para saber si el usuario ingresa como invitado.
    static String usuario; // Variables para ingresar nombre de usuario, contraseña y domicilio.
    static String pass;
    static String domicilio;
    static int cel;// Variables para, ingresar telefono, y X para el lugar en el arreglo de
                   // usuarios del usuario.
    static int x = 0;
    String[] opc;
    // Inicializar el carrito y la lista de productos
    static double total = 0; // Variable para almacenar el monto del carrito.
    static String productos = "";

    public static void pedir_datos(String usuario, String pass, String domicilio, int cel, user[] users, boolean inv, int x) {
        int j, aux, opc;
        int i = 0;
        String[] opciones = {"Si", "No"};
        aux = -1;
        if (!inv) {
            opc = 1;
            do {// Ciclo do while para volver a pedir datos en caso de que el usuario no esté registrado.
                usuario = JOptionPane.showInputDialog("Usuario: ");

                // Ciclo for, para recorrer todo el arreglo de usuarios almacenados hasta encontrar el proximo usuario vacío (contiene el valor "").
                for (j = 0; j <= 9; j++) {
                    if (users[j] != null && users[j].getUsuario().equals(usuario)) {
                        aux = j;
                        break;
                    }
                }
                if (aux == -1) {
                    opc = JOptionPane.showOptionDialog(null, "¿Usuario no encontrado. ¿Desea registrarse?", "Bienvenido", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[1]);

                    if (opc == 0) {
                        registro(users, inv);
                    }
                }
            } while (aux == -1);

            if (aux != -1) {
                // Ciclo do while Hasta para pedir nuevamente la contraseña.
                do {
                    pass = JOptionPane.showInputDialog("Contraseña: ");
                    if (users[aux].getPass().equals(pass)) {
                        System.out.println(" ");
                        System.out.println("Bienvenido, " + usuario);
                        menu(users, inv, x, total, productos);
                    } else {
                        System.out.println("Contraseña errónea ");
                        i++;
                    }
                    
                } while (!users[aux].getPass().equals(pass) && i < 8);

            }
        }
    }

    public static void registro(user[] users, boolean inv) {
        String[] opciones = {"Si", "No"}, opciones2 = {"Si", "Continuar como Invitado", "Salir"}, opciones3 = {"Si", "No"};
        int opc, opc2, opc3;
        int i, j, x, ok;
        x = 0;
        i = 0;
        j = 0;
        ok = 0;

        opc = JOptionPane.showOptionDialog(null, "¿Posee un usuario?", "Bienvenido", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[1]);

        switch (opc) {
            case 0:
                pedir_datos(usuario, pass, domicilio, cel, users, inv, x);
                break;
            case 1:
                opc2 = JOptionPane.showOptionDialog(null, "¿Desea Registrarse?", "Registro", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones2, opciones2[2]);
                    switch (opc2) {
                        case 0:
                            do {
                                ok = 0;

                                    if (opc2 == 0) {
                                        do {
                                            if (!users[j].getUsuario().equals("")) {
                                                j++;
                                            }
                                        } while (!users[j].getUsuario().equals(""));

                                        users[j].setUsuario(JOptionPane.showInputDialog("Por favor digite un nombre de usuario (no se permiten caracteres especiales como *, {, ], -, etc.):"));

                                            for (i = 0; i < users[j].getUsuario().length(); i++) {
                                                if (users[j].getUsuario().charAt(i) == '*' || users[j].getUsuario().charAt(i) == '{' || users[j].getUsuario().charAt(i) == '}' ||
                                                        users[j].getUsuario().charAt(i) == ']' || users[j].getUsuario().charAt(i) == '[' || users[j].getUsuario().charAt(i) == '-') {
                                                    JOptionPane.showMessageDialog(null, "Ha ingresado caracteres no válidos. Ingrese nombre de usuario nuevamente.");
                                                } else {
                                                    ok++;
                                                }
                                            }
                                    }
                            } while (ok != users[j].getUsuario().length());                            
                        
                            break;
                        case 1:
                            JOptionPane.showMessageDialog(null, "Ha decidido continuar como invitado.");
                            inv = true;
                            ok = 100;
                            break;
                        default:
                            break;
                    }
                if (ok == users[j].getUsuario().length()) {
                    j = x;
                    users[j].setPass(JOptionPane.showInputDialog("Por favor digite una contraseña: "));
                    
                    opc3 = JOptionPane.showOptionDialog(null, "¿Desea cargar sus datos de celular y domicilio ahora?", "Datos adicionales", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones3, opciones3[1]);

                    if (opc3 == 0) {
                        users[j].setCel(Integer.parseInt(JOptionPane.showInputDialog("Celular:")));
                        users[j].setDomicilio(JOptionPane.showInputDialog("Domicilio:"));
                    } else {
                        JOptionPane.showMessageDialog(null, "Ha decidido continuar sin cargar todos los datos.");
                    }

                    JOptionPane.showMessageDialog(null, "El registro se ha realizado con éxito.");
                    pedir_datos(usuario, pass, domicilio, cel, users, inv, x);
                }
                break;
        
            default:
                break;
        }

    };

    public static void main(String[] args) {
        user[] users = new user[10];
        for (int i = 0; i < 10; i++){
            users[i] = new user();
            users[i].setUsuario("");
        }
        int opcInicio; // Opcion para que el usuario ingrese o se registe.
        String[] opcionesInicio = {"Iniciar Sesión.", "Registrarse.", "Salir."};
        System.out.println("\r\n" + //
                "            ######  ####### #######    #    #     #  #####  #     # ######  ######  ### \r\n" + //
                "            #     # #          #      # #   ##    # #     # #     # #     # #     #  #  \r\n" + //
                "            #     # #          #     #   #  # #   # #       #     # #     # #     #  # \r\n" + //
                "            ######  #####      #    #     # #  #  # #       #     # ######  ######   #  \r\n" + //
                "            #     # #          #    ####### #   # # #       #     # #   #   #   #    #  \r\n" + //
                "            #     # #          #    #     # #    ## #     # #     # #    #  #    #   #  \r\n" + //
                "            ######  #######    #    #     # #     #  #####   #####  #     # #     # ### \r\n" + //
                "                                                                             ROTISERIA");
        opcInicio = JOptionPane.showOptionDialog(null, "¿Qué desea hacer?", "Bienvenido", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, new ImageIcon("ProyectoJava/betan (1).jpg"), opcionesInicio, opcionesInicio[2]);
        switch (opcInicio){
            case 0:
                pedir_datos(usuario, pass, domicilio, cel, users, inv, x);
            case 1:
                registro(users, inv);
            case 2:
                System.out.println("Gracias por utilizar nuestros servicios. Hasta la próxima.");
        }
        
    }

    public static void menu(user[] users, boolean inv, int x, double total, String productos) {
        
        if (inv = false) {
         JOptionPane.showMessageDialog(null, "Bienvenido: " + users[x].getUsuario());
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
        opcion = Integer.parseInt(JOptionPane.showInputDialog("\n Ingrese una opcion"));
        //tras elegir una opcion
               
        switch(opcion) {
            case 1:
                opcComprar(users,inv,x,total,productos);
            break;
            case 2:
                opcArmar(users,inv,x,total,productos);          
            break;
            }    
    }
    // SUBP Opc Comprar

    public static void opcComprar(int opcComprar, int carro, char comboDia, char opcCarrito, int opcEnvio, int Productos, int X, int inv, int total, String saveDom[], int dom_inv){
        JOptionPane.showMessageDialog(null,"1: Mostrar combos disponibles");
        JOptionPane.showMessageDialog(null,"2: Mostrar combo del día");
        JOptionPane.showMessageDialog(null,"3: Volver atrás");
        opcComprar = Integer.parseInt(JOptionPane.showInputDialog("Elija una opción:"));

        switch (opcComprar) {
            case 1:
                mostrarCombos();
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Combo del día: Tacos + papas + cerveza + helado");
                JOptionPane.showMessageDialog(null,"El precio del combo del día es de: $4000");
                JOptionPane.showMessageDialog(null,"¿Desea comprar este combo? (s/n)");
                comboDia = JOptionPane.showInputDialog("¿Desea comprar este combo? (s/n)").charAt(0);

                while (comboDia == 'S' || comboDia == 's') {
                    carro = Carrito(carro, 4000);
                    productos = ProductosCarrito(productos, "Tacos + papas + cerveza + helado");
                    mostrar_carrito(carro, productos);

                    do {
                        String opcCarritoStr = JOptionPane.showInputDialog("¿Desea agregar algo más al carrito? (S/N)");
                        opcCarrito = opcCarritoStr.charAt(0);

                        if (opcCarrito == 'S' || opcCarrito == 's') {
                            opcionesArmar();
                        } else if (opcCarrito == 'N' || opcCarrito == 'n') {
                            mostrar_carrito(carro, productos);
                             opcEnvio = Integer.parseInt(JOptionPane.showInputDialog("Desea...\n1 - Retirar en el local.\n2 - Envío a domicilio."));

                            if (opcEnvio == 2) {
                                JOptionPane.showMessageDialog(null, "Ha seleccionado -Envío a Domicilio-");
                                JOptionPane.showMessageDialog(null, "El costo de envío es de $200.");
                                JOptionPane.showMessageDialog(null, "El monto total es de: $" + (carro + 200));

                                if (inv) {
                                    dom_inv = JOptionPane.showInputDialog("Por favor, ingrese su domicilio:");
                                    fin_compra();
                                } else {
                                    if (saveDom[x].equals("")) {
                                        saveDom[x] = JOptionPane.showInputDialog("Domicilio no cargado. Por favor, ingrese su domicilio:");
                                        fin_compra();
                                    } else {
                                        fin_compra();
                                    }
                                }
                            } else if (opcEnvio == 1) {
                                JOptionPane.showMessageDialog(null, "Ha seleccionado -Retirar en el local-");
                                JOptionPane.showMessageDialog(null, "El monto total es de: $" + carro);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Error. Opción no válida. Ingrese nuevamente.");
                        }
                    } while (opcCarrito != 'N' && opcCarrito != 'n' && opcCarrito != 'S' && opcCarrito != 's');
                }
                break;
            case 3:
                System.out.println("Volver atrás\n");
                menu();
                break;
        }
    }

    public static void mostrarCombos() {
        // Implementa la lógica para mostrar los combos disponibles
    }

    public static int Carrito(int carro, int precio) {
        // Implementa la lógica para agregar productos al carrito y actualizar el total
        return carro + precio;
    }

    public static String[] ProductosCarrito(String[] productos, String nuevoProducto) {
        // Implementa la lógica para agregar productos al arreglo de productos del carrito
        // Devuelve el arreglo actualizado
        return productos;
    }

    public static void mostrar_carrito(int carro, String[] productos) {
        // Implementa la lógica para mostrar el contenido del carrito
    }

    public static void opcionesArmar() {
        // Implementa la lógica para agregar más productos al carrito
    }

    public static void fin_compra() {
        // Implementa la lógica para finalizar la compra
    }

    public static void menu() {
        // Implementa la lógica del menú principal
    }
}
    
    
    // Creamos el método opcArmar

    public static void opcArmar(user[] users, boolean inv, int x, double total, String productos) {
        int opcionArmar = 0;
        while (true) {
            opcionArmar = Integer.parseInt(JOptionPane.showInputDialog("1. Mostrar las comidas disponibles\n" +
                    "2. Mostrar las bebidas\n" + "3. Volver atrás\n"));

            switch (opcionArmar) {
                case 1:
                    mostrarComidas(users, inv, x, total, productos);
                    continue;

                case 2:
                    mostrarBebidas(users, inv, x, total, productos);
                    continue;

                case 3:
                    menu(users, inv, x, total, productos);
                    break;
            }

        }

    }

    // Subproceso para mostrar_carrito
    public static void mostrar_carrito(double total, String productos) {
        String mensaje = "Los productos del carrito son:\n" + productos + "\n El monto del carrito es: $ " + total;
        JOptionPane.showMessageDialog(null, mensaje, "Carrito de Compras", JOptionPane.INFORMATION_MESSAGE);
    }

    // Subproceso para elegir opcArmar
        public static void opcArmar(user[] users, boolean inv, int x, int total, String productos) {
        
            int opcionArmar = 0;

        String[] opcionesArmar = {"Mostrar las comidas disponibles", "Mostrar las bebidas disponibles", "Volver atrás"};
        opcionArmar = JOptionPane.showOptionDialog(null, "Seleccione una opción.", "",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcionesArmar, opcionesArmar[2]);

        switch (opcionArmar) {
            case 0:
                mostrarComidas(users, inv, x, total, productos);
                break;
            case 1:
                mostrarBebidas(users, inv, x, total, productos);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Volver atrás");
                // Agrega la lógica para volver atrás
                break;
        }

    }

    // Subproceso fin_compra
    public static void fin_compra() {
        JOptionPane.showMessageDialog(null, "Su pedido ha sido registrado. Recibirá el mismo en 10-20min.");
    }

    // Subproceso Carrito y productosCarrito

    public static String ProductosCarrito(String productos, String producto) {
        productos += producto + "/n";
        return productos;
    }

    public static double Carrito(double total, double precio) {
        total += precio;
        return total;
    }
    //subproceso 8: mostrarcombos

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


    // Subproceso 9: Mostrar comidas disponibles
    public class mostrarComidas01 {
    static int x = 0; // Variable estática para llevar el conteo de productos en el carrito
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
        String save_user = "";
        String save_pass = "";
        String save_dom = "";
        String save_cel = "";

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
                opcArmar(save_user, save_pass, save_dom, save_cel, inv, x, total, productos);
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
                            if (save_dom.equals("")) {
                                save_dom = JOptionPane.showInputDialog("Domicilio No cargado. Por Favor Ingrese su domicilio: ");
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

    // Subproceso 10: Mostrar bebidas disponibles (Marcos)
    public static void mostrarBebidas(user[] users, boolean inv, int x, double total, String productos) {

        // Declarar variables

        int i, j, opcion, opcEnvio;
        String bebidaElegida = "";
        double carro, precio = 0;
        String[][] bebidas = new String[4][4];
        double[][] precioBebidas = new double[4][4];
        String dom_inv = "";

        // Llenamos la matriz bebidas
        bebidas[0][0] = "1) Cerveza: Quilmes";
        bebidas[0][1] = "2) Cerveza: Brahmita";
        bebidas[0][2] = "3) Cerveza: Andes origen negra";
        bebidas[0][3] = "4) Cerveza: Andes origen rubia";
        bebidas[1][0] = "5) Cerveza: Andes origen roja";
        bebidas[1][1] = "6) Cerveza: Andes origen ipa";
        bebidas[1][2] = "7) Cerveza: Coronita";
        bebidas[1][3] = "8) Cerveza: Stella";
        bebidas[2][0] = "9) Cerveza: Salta cautiva";
        bebidas[2][1] = "10) Vino: Chardonnay";
        bebidas[2][2] = "11) Vino: Blanco dulce";
        bebidas[2][3] = "12) Vino: Rosé";
        bebidas[3][0] = "13) Vino: Malbec Roble";
        bebidas[3][1] = "14) Vino: Cabernet sauvignon";
        bebidas[3][2] = "15) Vino: Espumoso";
        bebidas[3][3] = "16) Vino: Malbec";

        // Llenamos la matriz precio de bebidas
        precioBebidas[0][0] = 300;
        precioBebidas[0][1] = 250;
        precioBebidas[0][2] = 400;
        precioBebidas[0][3] = 400;
        precioBebidas[1][0] = 400;
        precioBebidas[1][1] = 400;
        precioBebidas[1][2] = 500;
        precioBebidas[1][3] = 350;
        precioBebidas[2][0] = 300;
        precioBebidas[2][1] = 1000;
        precioBebidas[2][2] = 800;
        precioBebidas[2][3] = 750;
        precioBebidas[3][0] = 900;
        precioBebidas[3][1] = 1200;
        precioBebidas[3][2] = 1300;
        precioBebidas[3][3] = 850;

          // Mostrar lista de bebidas y precios
        StringBuilder bebidasTexto = new StringBuilder();
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                bebidasTexto.append(bebidas[i][j]).append(" $ ").append(precioBebidas[i][j]).append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, bebidasTexto.toString(), "Bebidas Disponibles", JOptionPane.INFORMATION_MESSAGE);

        // Leer la opción
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opción que desee:"));

           switch (opcion) {
            case 1:
                bebidaElegida = "Cerveza: Quilmes";
                precio += precioBebidas[0][0];
                break;
            case 2:
                bebidaElegida = "Cerveza: Brahmita";
                precio += precioBebidas[0][1];
                break;
            case 3:
                bebidaElegida = "Cerveza: Andes origen negra";
                precio += precioBebidas[0][2];
                break;
            case 4:
                bebidaElegida = "Cerveza: Andes origen rubia";
                precio += precioBebidas[0][3];
                break;
            case 5:
                bebidaElegida = "Cerveza: Andes origen roja";
                precio += precioBebidas[1][0];
                break;
            case 6:
                bebidaElegida = "Cerveza: Andes origen ipa";
                precio += precioBebidas[1][1];
                break;
            case 7:
                bebidaElegida = "Cerveza: Coronita";
                precio += precioBebidas[1][2];
                break;
            case 8:
                bebidaElegida = "Cerveza: Stella";
                precio += precioBebidas[1][3];
                break;
            case 9:
                bebidaElegida = "Cerveza: Salta cautiva";
                precio += precioBebidas[2][0];
                break;
            case 10:
                bebidaElegida = "Vino: Chardonnay";
                precio += precioBebidas[2][1];
                break;
            case 11:
                bebidaElegida = "Vino: Blanco dulce";
                precio += precioBebidas[2][2];
                break;
            case 12:
                bebidaElegida = "Vino: Rosé";
                precio += precioBebidas[2][3];
                break;
            case 13:
                bebidaElegida = "Vino: Malbec Roble";
                precio += precioBebidas[3][0];
                break;
            case 14:
                bebidaElegida = "Vino: Cabernet sauvignon";
                precio += precioBebidas[3][1];
                break;
            case 15:
                bebidaElegida = "Vino: Espumoso";
                precio += precioBebidas[3][2];
                break;
            case 16:
                bebidaElegida = "Vino: Malbec";
                precio += precioBebidas[3][3];
                break;
        }
      
         // Muestra el resultado en una ventana emergente
        JOptionPane.showMessageDialog(null, "Se ha añadido al carrito: " + bebidaElegida, "Bebida Agregada", JOptionPane.INFORMATION_MESSAGE);

        // Definimos opcCarrito como string vacío
        String opcCarrito = "";

        
        do {
            opcCarrito = JOptionPane.showInputDialog("¿Desea agregar algo más al carrito? (S/N)").toUpperCase();

            if (opcCarrito.equals("S")) {
                carro = Carrito(total, precio);
                productos = ProductosCarrito(productos, bebidaElegida);
                mostrar_carrito(carro, productos);
                opcArmar(users, inv, x, total, productos);
            } else {
                if (opcCarrito.equals("N")) {
                    carro = Carrito(total, precio);
                    productos = ProductosCarrito(productos, bebidaElegida);
                    mostrar_carrito(carro, productos);

                    String[] opciones = {"Retirar en el local", "Envío a domicilio"};
                    opcEnvio = JOptionPane.showOptionDialog(
                            null,
                            "Desea...",
                            "Opciones de Envío",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            opciones,
                            opciones[0]
                    );

                    if (opcEnvio == 1) {
                        JOptionPane.showMessageDialog(null, "Ha seleccionado -Envío a Domicilio-\nEl costo de envío es de $200.\nEl monto total es de: $" + (carro + 200), "Envío a Domicilio", JOptionPane.INFORMATION_MESSAGE);

                        if (inv) {
                            dom_inv = JOptionPane.showInputDialog("Por Favor Ingrese su domicilio:");
                            fin_compra();
                        } else {
                            if (users[x].getDomicilio().isEmpty()) {
                                users[x].setDomicilio(JOptionPane.showInputDialog("Domicilio No cargado. Por Favor Ingrese su domicilio:"));
                                fin_compra();
                            } else {
                                fin_compra();
                            }
                        }
                    } else {
                        if (opcEnvio == 0) {
                            JOptionPane.showMessageDialog(null, "Ha seleccionado -Retirar en el local-\nEl monto total es de: $" + carro, "Retirar en el Local", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Error. Opción no válida. Ingrese nuevamente.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } while (opcCarrito.equals("S") || opcCarrito.equals("N"));

    }


}