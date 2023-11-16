package ProyectoJava;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import ProyectoJava.user;

public class proyecto {

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

    public static void pedir_datos(user[] users) {
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
                        registro(users);
                    }
                }
            } while (aux == -1);

            if (aux != -1) {
                // Ciclo do while Hasta para pedir nuevamente la contraseña.
                do {
                    pass = JOptionPane.showInputDialog("Contraseña: ");
                    if (users[aux].getPass().equals(pass)) {
                        System.out.println(" ");
                        menu(users);
                    } else {
                        System.out.println("Contraseña errónea ");
                        i++;
                    }
                    
                } while (!users[aux].getPass().equals(pass) && i < 8);

            }
        }
    }

    public static void registro(user[] users) {
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
                pedir_datos(users);
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
                    pedir_datos(users);
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
            users[i].setDomicilio("");
            users[i].setCel(0);
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
                pedir_datos(users);
                break;
            case 1:
                registro(users);
                break;
            case 2:
                System.out.println("Gracias por utilizar nuestros servicios. Hasta la próxima.");
                break;
        }
        if (inv){
            menu(users);
        }
        
    }

    private static void menu(user[] users) {
        String[] opcionesMenu = {"Comprar un combo","Armar Pedido"};
        if (!inv) {
         JOptionPane.showMessageDialog(null, "Bienvenido: " + users[x].getUsuario());
         }
        else {
            JOptionPane.showMessageDialog(null, "Bienvenido \nHa ingresado como invitado ");      
        }  
        //creamos las variables y se inicializan en 0 por defecto
        int opcion;
        //mostrar menu
        opcion = JOptionPane.showOptionDialog(null, "¿Qué desea hacer?", "MENU", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, new ImageIcon("ProyectoJava/betan (1).jpg"), opcionesMenu, opcionesMenu[1]);
        //tras elegir una opcion
               
        switch(opcion) {
            case 0:
                opcComprar(users);
            break;
            case 1:
                opcArmar(users);          
            break;
            }    
    }
    // SUBP Opc Comprar

    private static void opcComprar(user[] users) {
        String[] opcionesComprar = {"Mostrar combos disponibles", "Mostrar combo del día", "Volver atrás"}, opcComboDia = {"Si", "No", "Volver atras"};
        String[] opcionesEnvio = {"Envio a domicilio", "Retirar en el local"};
        String[] opcionesComprar2 = {"Agregar un combo", "Mostrar Bebidas", "Mostrar Comidas"};
        String dom_inv = "";
        int opcComprar =  JOptionPane.showOptionDialog(null, "Elija una opción:", "Compras", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, new ImageIcon("ProyectoJava/betan (1).jpg"), opcionesComprar, opcionesComprar[2]);
        switch (opcComprar) {
            case 0:
                mostrarCombos(users);
                break;
            case 1:
                JOptionPane.showMessageDialog(null,"Combo del día: Tacos + papas + cerveza + helado");
                JOptionPane.showMessageDialog(null,"El precio del combo del día es de: $4000");
                int comboDia = JOptionPane.showOptionDialog(null, "¿Desea comprar este combo?", "COMBO DEL DIA", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, new ImageIcon("ProyectoJava/betan (1).jpg"), opcComboDia, opcComboDia[2]);

                if (comboDia == 0) {
                    Carrito(4000);
                    ProductosCarrito("Tacos + papas + cerveza + helado");
                    mostrar_carrito();

                        int opcCarrito = JOptionPane.showOptionDialog(null, "¿Desea agregar algo más al carrito?", "Compras", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, new ImageIcon("ProyectoJava/betan (1).jpg"), opcComboDia, opcComboDia[2]);

                        if (opcCarrito == 0) {
                            int opcComprar2 =  JOptionPane.showOptionDialog(null, "Elija una opción:", "Compras", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, new ImageIcon("ProyectoJava/betan (1).jpg"), opcionesComprar2, opcionesComprar2[2]);
                            switch (opcComprar2) {
                                case 0:
                                    mostrarCombos(users);
                                    break;
                                case 1:
                                    mostrarBebidas(users);
                                    break;
                                case 2:
                                    mostrarComidas(users);
                                    break;
                                default:
                                    break;
                            }
                        } else if (opcCarrito == 1) {
                            mostrar_carrito();
                            int opcEnvio = JOptionPane.showOptionDialog(null, "¿Que desea hacer?", "Compras", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, new ImageIcon("ProyectoJava/betan (1).jpg"), opcionesEnvio, opcionesEnvio[1]);
                            if (opcEnvio == 0) {
                                JOptionPane.showMessageDialog(null, "Ha seleccionado -Envío a Domicilio-");
                                JOptionPane.showMessageDialog(null, "El costo de envío es de $200.");
                                JOptionPane.showMessageDialog(null, "El monto total es de: $" + (total + 200));

                                if (inv) {
                                    dom_inv = JOptionPane.showInputDialog("Por favor, ingrese su domicilio:");
                                    fin_compra();
                                    return;
                                } else {
                                    if (users[x].getDomicilio().equals("")) {
                                        users[x].setDomicilio(JOptionPane.showInputDialog("Domicilio no cargado. Por favor, ingrese su domicilio:"));
                                        fin_compra();
                                        return;
                                    } else {
                                        fin_compra();
                                        return;
                                    }
                                }
                            } else if (opcEnvio == 1) {
                                JOptionPane.showMessageDialog(null, "Ha seleccionado -Retirar en el local-");
                                JOptionPane.showMessageDialog(null, "El monto total es de: $" + total);
                                fin_compra();
                                return;
                            }
                        } 
                }
                break;
            case 2:
                System.out.println("Volver atrás\n");
                menu(users);
                break;
        }
    }

    // Subproceso para mostrar_carrito
    public static void mostrar_carrito() {
        String mensaje = "Los productos del carrito son: " + productos + "El monto del carrito es: $ " + total;
        JOptionPane.showMessageDialog(null, mensaje, "Carrito de Compras", JOptionPane.INFORMATION_MESSAGE);
    }

    // Subproceso para elegir opcArmar
        public static void opcArmar(user[] users) {
        
            int opcionArmar = 0;

        String[] opcionesArmar = {"Mostrar las comidas disponibles", "Mostrar las bebidas disponibles", "Volver atrás"};
        opcionArmar = JOptionPane.showOptionDialog(null, "Seleccione una opción.", "",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcionesArmar, opcionesArmar[2]);

        switch (opcionArmar) {
            case 0:
                mostrarComidas(users);
                break;
            case 1:
                mostrarBebidas(users);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Volver atrás");
                // Agrega la lógica para volver atrás
                break;
        }

    }
    public static void mostrarCombos(user[] users){
        int i, response;
        int opcEnvio;
        String comboElegido = "";
        String dom_inv;
        String[] combos = {
            "Pizza especial + papas + cerveza + helado",
            "Milanesa + papas + cerveza + helado",
            "Pancho + papas + cerveza + helado",
            "Empanadas + papas + cerveza + helado"
        };
        double[] precioCombos = { 3500, 4000, 1800, 3000};
        double precio = 0; // Declarar precio e inicializarlo a 0

            // Muestra la lista de combos
            Object selectedCombo = JOptionPane.showInputDialog(null, "Elige un combo:", "Combos disponibles", JOptionPane.QUESTION_MESSAGE, new ImageIcon("ProyectoJava/betan (1).jpg"), combos, combos[0]);

            if (selectedCombo != null) {
                comboElegido = selectedCombo.toString();
                for (i = 0; i < combos.length; i++) {
                    if (combos[i].equals(comboElegido)) {
                        precio += precioCombos[i];
                        break;
                    }
                }

                // Mostrar resultados
                Carrito(precio);
                ProductosCarrito(comboElegido);
                mostrar_carrito();

                Object[] options = {"Sí", "No"};
                response = JOptionPane.showOptionDialog(null, "¿Desea agregar algo más al carrito?", "Agregar al Carrito", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                if (response == JOptionPane.NO_OPTION) {
                    mostrar_carrito();

                    String[] envioOptions = {"Retirar en el local", "Envío a domicilio"};
                    opcEnvio = JOptionPane.showOptionDialog(null, "Desea...", "Opciones de Envío", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, envioOptions, envioOptions[0]);

                    if (opcEnvio == 1) {
                        JOptionPane.showMessageDialog(null, "Ha seleccionado -Envío a Domicilio-");
                        JOptionPane.showMessageDialog(null, "El costo de envío es de $200.");
                        JOptionPane.showMessageDialog(null, "El monto total es de: $ " + (total + 200));

                        if (inv) {
                            dom_inv = JOptionPane.showInputDialog("Por favor, ingrese su domicilio: ");
                            fin_compra();
                            return;
                        } else {
                            if (users[x].getDomicilio().equals("")) {
                                users[x].setDomicilio(JOptionPane.showInputDialog("Domicilio No cargado. Por Favor Ingrese su domicilio: "));
                                fin_compra();
                                return;
                            } else {
                                fin_compra();
                                return;
                            }
                        }
                    } else {
                        if (opcEnvio == 0) {
                            JOptionPane.showMessageDialog(null, "Ha seleccionado -Retirar en el local-");
                            JOptionPane.showMessageDialog(null, "El monto total es de: $ " + total);
                        }
                    }
                } else {
                    if (response == JOptionPane.OK_OPTION) {
                        opcComprar(users);
                    }
                }
            }
}

    // Método fin_compra
    public static void fin_compra() {
        JOptionPane.showMessageDialog(null, "Su pedido ha sido registrado. Recibirá el mismo en 10-20min.");
    }

    // Métodos Carrito y productosCarrito

    public static void ProductosCarrito(String producto) {
        productos += producto + "\n";
    }

    public static void Carrito(double precio) {
        total += precio;
    }    // Subproceso 9: Mostrar comidas disponibles
    public static void mostrarComidas(user[] users) {
        // Declarar variables
        String[] opciones2 = {"Si", "No"};
        int i, opcEnvio;
        String comidaElegida = "";
        double precio = 0;
        String[] comidas = {"Pizza cuatro quesos $800",
        "Pizza de peperoni $750",w
        "Pizza napolitana $900",
        "Pizza fugazzeta $880",
        "Empanadas de jamón y queso $1000",
        "Empanadas árabes $950",
        "Empanadas de soja $920",
        "Empanadas de carne $950",
        "Papas con cheddar $600",
        "Papas con crema $550",
        "Papas a caballo $700",
        "Papas con salsa $500",
        "Milanesa napolitana $800",
        "Milanesa a caballo $850",
        "Milanesa suiza $750",
        "Milanesa de berenjena -$500"};
        String[] comidasSP = {"Pizza cuatro quesos",
        "Pizza de peperoni",
        "Pizza napolitana",
        "Pizza fugazzeta",
        "Empanadas de jamón y queso",
        "Empanadas árabes",
        "Empanadas de soja",
        "Empanadas de carne",
        "Papas con cheddar",
        "Papas con crema",
        "Papas a caballo",
        "Papas con salsa",
        "Milanesa napolitana",
        "Milanesa a caballo",
        "Milanesa suiza",
        "Milanesa de berenjena"};
        
        String dom_inv = "";

        // Llenamos el arreglo precio de comidas
        int[] precioComidas = {800, 750, 900, 880, 1000, 950, 920, 950, 600, 550, 700, 500, 800, 850, 750, 500};

        // Leer la opción
        Object opcion = JOptionPane.showInputDialog(null, "Elige una opcion", "Comidas disponibles", JOptionPane.QUESTION_MESSAGE, new ImageIcon("ProyectoJava/betan (1).jpg"), comidas, comidas[0]);
        if (opcion != null) {
                for (i = 0; i < comidas.length; i++) {
                    if (comidas[i].equals(opcion)){
                        precio += precioComidas[i];
                        comidaElegida = comidasSP[i];
                        break;
                    }
                }
        }
      
         // Muestra el resultado en una ventana emergente
        JOptionPane.showMessageDialog(null, "Se ha añadido al carrito: " + comidaElegida, "Producto Agregado", JOptionPane.INFORMATION_MESSAGE);

        // Definimos opcCarrito
        int opcCarrito;
        
        opcCarrito = JOptionPane.showOptionDialog(null, "¿Desea agregar algo más al carrito?", "", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, new ImageIcon("ProyectoJava/betan (1).jpg"), opciones2, opciones2[1]);

            if (opcCarrito == 0) {
                Carrito(precio);
                ProductosCarrito(comidaElegida);
                mostrar_carrito();
                opcArmar(users);
            } else {
                if (opcCarrito == 1) {
                    Carrito(precio);
                    ProductosCarrito(comidaElegida);
                    mostrar_carrito();

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
                        JOptionPane.showMessageDialog(null, "Ha seleccionado -Envío a Domicilio-");
                        JOptionPane.showMessageDialog(null, "El costo de envío es de $200.");
                        JOptionPane.showMessageDialog(null, "El monto total es de: $" + (total + 200));
                    
                        if (inv) {
                            dom_inv = JOptionPane.showInputDialog("Por favor, ingrese su domicilio:");
                            fin_compra();
                        } else {
                            if (users[x].getDomicilio().equals("")) {
                                users[x].setDomicilio(JOptionPane.showInputDialog("Domicilio no cargado. Por favor, ingrese su domicilio:"));
                                fin_compra();
                            } else {
                                fin_compra();
                            }
                        }
                        return; // Agregar esta línea para finalizar la compra
                    } else {
                        if (opcEnvio == 0) {
                            JOptionPane.showMessageDialog(null, "Ha seleccionado -Retirar en el local-");
                            JOptionPane.showMessageDialog(null, "El monto total es de: $" + total);
                        }
                        return; // Agregar esta línea para finalizar la compra
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Error. Opción no válida. Ingrese nuevamente.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

    }

    // Subproceso 10: Mostrar bebidas disponibles (Marcos)
    public static void mostrarBebidas(user[] users) {

        // Declarar variables
        String[] opciones2 = {"Si", "No"};
        int i, opcEnvio;
        String bebidaElegida = "";
        double precio = 0;
        String[] bebidas = {"Cerveza: Quilmes $300 ",
        "Cerveza: Brahmita $250",
        "Cerveza: Andes origen negra $400",
        "Cerveza: Andes origen rubia $400",
        "Cerveza: Andes origen roja $400",
        "Cerveza: Andes origen ipa $400",
        "Cerveza: Coronita  $500",
        "Cerveza: Stella $350",
        "Cerveza: Salta cautiva $300",
        "Vino: Chardonnay $1000", 
        "Vino: Blanco dulce $800", 
        "Vino: Rosé $750 ",
        "Vino: Malbec Roble $900 ",
        "Vino: Cabernet Sauvignon $1200", 
        "Vino: Espumoso $1300 ",
        "Vino: Malbec $850 "};
        String[] bebidasSP = {"Cerveza: Quilmes",
        "Cerveza: Brahmita",
        "Cerveza: Andes origen negra",
        "Cerveza: Andes origen rubia",
        "Cerveza: Andes origen roja",
        "Cerveza: Andes origen ipa",
        "Cerveza: Coronita",
        "Cerveza: Stella",
        "Cerveza: Salta cautiva",
        "Vino: Chardonnay", 
        "Vino: Blanco dulce", 
        "Vino: Rosé",
        "Vino: Malbec Roble",
        "Vino: Cabernet Sauvignon", 
        "Vino: Espumoso",
        "Vino: Malbec"};
        
        String dom_inv = "";

        // Llenamos el arreglo precio de bebidas
        int[] precioBebidas = {300, 250,
         400, 400, 400, 400, 500, 350, 300, 1000, 800, 750, 900, 1200, 1300, 850};

        // Leer la opción
        Object opcion = JOptionPane.showInputDialog(null, "Elige una bebida", "Bebidas disponibles", JOptionPane.QUESTION_MESSAGE, new ImageIcon("ProyectoJava/betan (1).jpg"), bebidas, bebidas[0]);
        if (opcion != null) {
                for (i = 0; i < bebidas.length; i++) {
                    if (bebidas[i].equals(opcion)){
                        precio += precioBebidas[i];
                        bebidaElegida = bebidasSP[i];
                        break;
                    }
                }
        }
      
         // Muestra el resultado en una ventana emergente
        JOptionPane.showMessageDialog(null, "Se ha añadido al carrito: " + bebidaElegida, "Bebida Agregada", JOptionPane.INFORMATION_MESSAGE);

        // Definimos opcCarrito
        int opcCarrito;
        
        opcCarrito = JOptionPane.showOptionDialog(null, "¿Desea agregar algo más al carrito?", "", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, new ImageIcon("ProyectoJava/betan (1).jpg"), opciones2, opciones2[1]);

            if (opcCarrito == 0) {
                Carrito(precio);
                ProductosCarrito(bebidaElegida);
                mostrar_carrito();
                opcArmar(users);
            } else {
                if (opcCarrito == 1) {
                    Carrito(precio);
                    ProductosCarrito(bebidaElegida);
                    mostrar_carrito();

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
                        JOptionPane.showMessageDialog(null, "Ha seleccionado -Envío a Domicilio-\nEl costo de envío es de $200.\nEl monto total es de: $" + (total + 200), "Envío a Domicilio", JOptionPane.INFORMATION_MESSAGE);
                    
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
                        return; // Agregar esta línea para finalizar la compra
                    } else {
                        if (opcEnvio == 0) {
                            JOptionPane.showMessageDialog(null, "Ha seleccionado -Retirar en el local-\nEl monto total es de: $" + total, "Retirar en el Local", JOptionPane.INFORMATION_MESSAGE);
                        }
                        return; // Agregar esta línea para finalizar la compra
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Error. Opción no válida. Ingrese nuevamente.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

    }


}