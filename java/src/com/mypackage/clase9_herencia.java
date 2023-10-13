public class clase9_herencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 300000.00);
        System.out.println("empleado1: "+empleado1);

        Cliente cliente1 = new Cliente(null, false, null, 0, 0, null);
        System.out.println("cliente1: "+cliente1);
    }
}
