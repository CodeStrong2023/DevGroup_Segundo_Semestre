package ProyectoJava;

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
    static int total = 0; // Variable para almacenar el monto del carrito.
    static String productos = "";

    public static void pedir_datos(String usuario, String pass, String domicilio, int cel, user[] users, boolean inv, int x) {
        int i, j, aux;
        i = 0;
        aux = 0;
        if (inv == false) {
            String opc;
            opc = "N";
            do {// Ciclo do while para volver a pedir datos en caso de que el usuario no esté registrado.
                usuario = JOptionPane.showInputDialog("Usuario: ");

                // Ciclo for, para recorrer todo el arreglo de usuarios almacenados hasta encontrar el proximo usuario vacío (contiene el valor "").
                for (j = 0; j <= 9; j++) {
                    if (usuario == users[j].getUsuario()) {
                        aux = j;
                    }
                }
                if (usuario != users[aux].getUsuario()) {
                    opc = JOptionPane.showInputDialog("Usuario no encontrado. ¿Desea registrarse? (S/N)");

                    if (opc == "S" || opc == "s") {
                        registro(users, inv);
                    }
                }
            } while (usuario != users[aux].getUsuario());

            if (users[aux].getUsuario() == usuario) {
                // Ciclo do while Hasta para pedir nuevamente la contraseña.
                do {
                    pass = JOptionPane.showInputDialog("Contraseña: ");
                    if (pass == users[aux].getPass()) {
                        System.out.println(" ");
                        System.out.println("Bienvenido, " + usuario);
                    } else {
                        System.out.println("Contraseña errónea ");
                    }
                    i++;
                } while (pass != users[aux].getPass() || i == 8);

            }
        }
    }

    public static void registro(user[] users, boolean inv) {

    };

    public static void main(String[] args) {
        user[] users = new user[10];
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
        opcInicio = JOptionPane.showOptionDialog(null, "¿Qué desea hacer?", "Bienvenido", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcionesInicio, opcionesInicio[2]);
        switch (opcInicio){
            case 0:
                pedir_datos(usuario, pass, domicilio, opcInicio, users, inv, opcInicio);
            case 1:
                registro(users, inv);
            case 2:
                System.out.println("Gracias por utilizar nuestros servicios. Hasta la próxima.");
        }
        
    }

    private static void menu(user[] users,
            boolean inv, int x, int total, String productos) {
        
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
        opcion = Integer.parseInt(JOptionPane.showInputDialog("\nIngrese una opcion"));
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

    // Creamos el método opcArmar

    public static void opcArmar(String usuario, String pass, String domicilio, int cel, user[] users, boolean inv, int x) {
        int opcionArmar = 0;
        while (true) {
            opcionArmar = Integer.parseInt(JOptionPane.showInputDialog("1. Mostrar las comidas disponibles\n" +
                    "2. Mostrar las bebidas\n" + "3. Volver atrás\n"));

            switch (opcionArmar) {
                case 1:
                    mostrarComidas(usuario, pass, domicilio, cel, users, inv, x);
                    continue;

                case 2:
                    mostrarBebidas(usuario, pass, domicilio, cel, users, inv, x);
                    continue;

                case 3:
                    menu(users, inv, x, total, productos);
                    break;
            }

        }

    }

    // Subproceso para mostrar_carrito
    public static void mostrar_carrito(double carro, String[] productos) {
        String mensaje = "Los productos del carrito son:\n";
        for (String producto : productos) {
            mensaje += producto + "\n";
        }
        mensaje += "El monto del carrito es: $ " + carro;

        JOptionPane.showMessageDialog(null, mensaje);
    }

    // Subproceso para elegir opcArmar
        public static void opcArmar(user[] users, boolean inv, int x, int total, String[] productos) {
        
            int opcionArmar = 0;

        String[] opcionesArmar = {"Mostrar las comidas disponibles", "Mostrar las bebidas disponibles", "Volver atrás"};
        opcionArmar = JOptionPane.showOptionDialog(null, "Seleccione una opción.", "",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcionesArmar, opcionesArmar[2]);

        switch (opcionArmar) {
            case 0:
                mostrarComidas(users, inv, x, total, productos);
                continue;
            case 1:
                mostrarBebidas(users, inv, x, total, productos);
                continue;
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

    /* .
     * .
     * .
     */

    // Subproceso 9: Mostrar comidas disponibles
    public static void mostrarComidas(String user, String pass, String domicilio, int cel, user[] users, boolean inv, int x) {
    }

    // Subproceso 10: Mostrar bebidas disponibles (Marcos)
    public static void mostrarBebidas(String user, String pass, String domicilio, int cel, user[] users, boolean inv, int x) {

        // Declarar variables

        int i, j, opcion, carro, opcEnvio;
        String bebidaElegida = "";
        double precio = 0;
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
