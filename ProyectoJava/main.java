package ProyectoJava;

import javax.swing.JOptionPane;

public class main {
    public static void clearScreen() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    static boolean inv = false; // variable para saber si el usuario ingresa como invitado.
    static String user; // Variables para ingresar nombre de usuario, contraseña y domicilio.
    static String pass;
    static String domicilio;
    static int cel;// Variables para, ingresar telefono, y X para el lugar en el arreglo de
                   // usuarios del usuario.
    static int x = 0;
    static String[] saved_user = new String[10]; // variables "saved" utilizadas para guardar los datos de usuario.
    static String[] saved_pass = new String[10];
    static String[] saved_dom = new String[10];
    String[] opc;
    static int[] saved_cel = new int[10];
    static int total = 0; // Variable para almacenar el monto del carrito.
    static String productos = "";

    public static void pedir_datos(String user, String pass, String domicilio, int cel, String[] saved_user,
            String saved_pass[], String saved_dom[], int[] saved_cel, boolean inv, int x) {

    }

    public static void registro(String[] saved_user, String[] saved_pass, String[] saved_dom, int[] saved_cel,
            boolean inv) {

    };

    public static void main(String[] args) {
        int opcInicio; // Opcion para que el usuario ingrese o se registe.
        System.out.println("\r\n" + //
                "            ######  ####### #######    #    #     #  #####  #     # ######  ######  ### \r\n" + //
                "            #     # #          #      # #   ##    # #     # #     # #     # #     #  #  \r\n" + //
                "            #     # #          #     #   #  # #   # #       #     # #     # #     #  # \r\n" + //
                "            ######  #####      #    #     # #  #  # #       #     # ######  ######   #  \r\n" + //
                "            #     # #          #    ####### #   # # #       #     # #   #   #   #    #  \r\n" + //
                "            #     # #          #    #     # #    ## #     # #     # #    #  #    #   #  \r\n" + //
                "            ######  #######    #    #     # #     #  #####   #####  #     # #     # ### \r\n" + //
                "                                                                             ROTISERIA");
        opcInicio = Integer.parseInt(JOptionPane
                .showInputDialog("1 - Iniciar Sesión. \n 2 - Registrarse. \n 3 - Salir. \n ¿Qué desea hacer? "));
        registro(saved_user, saved_pass, saved_dom, saved_cel, inv);
        pedir_datos(user, pass, domicilio, cel, saved_user, saved_pass, saved_dom, saved_cel, inv, x);
        // Mostrar Menú.
        menu(saved_user, saved_pass, saved_dom, saved_cel, inv, x, total, productos);
    }

    private static void menu(String[] saved_user, String[] saved_pass, String[] saved_dom, int[] saved_cel,
            boolean inv, int x, int total, String productos) {
    }

                                    // Creamos el método opcArmar

    public static void opcArmar(String user, String pass, String domicilio, int cel, String[] saved_user,
            String saved_pass[], String saved_dom[], int[] saved_cel, boolean inv, int x) {
        int opcionArmar = 0;
        while (true) {
            opcionArmar = Integer.parseInt(JOptionPane.showInputDialog("1. Mostrar las comidas disponibles\n" +
                    "2. Mostrar las bebidas\n" + "3. Volver atrás\n"));

            switch (opcionArmar) {
                case 1:
                    mostrarComidas(user, pass, domicilio, cel, saved_user, saved_pass, saved_dom, saved_cel, inv, x);
                    continue;

                case 2:
                    mostrarBebidas(user, pass, domicilio, cel, saved_user, saved_pass, saved_dom, saved_cel, inv, x);
                    continue;

                case 3:
                    menu(saved_user, saved_pass, saved_dom, saved_cel, inv, x, total, productos);
                    break;
            }

        }

    }
    
    public static void mostrarComidas(String user, String pass, String domicilio, int cel, String[] saved_user,
            String saved_pass[], String saved_dom[], int[] saved_cel, boolean inv, int x) {
    }

    public static void mostrarBebidas(String user, String pass, String domicilio, int cel, String[] saved_user,
            String saved_pass[], String saved_dom[], int[] saved_cel, boolean inv, int x) {
    }

}
