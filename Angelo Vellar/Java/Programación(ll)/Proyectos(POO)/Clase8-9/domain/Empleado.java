// extedns para llamar a la clase padre
public class Empleado extends Persona{
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleados; //Es para el incremento

    //Constructor

    public Empleado(){ //Constrcutor 1 
        this.idEmpleado = ++Empleado.contadorEmpleados;
    }

    public Empleado ( String nombre, double sueldo){ //Constructor 2
        //super(nombre);
        this(); //Estamos llamando desde aqui al constructor vacio(Llamar a un constrcutor interno)
        this.sueldo = sueldo;
        this.nombre = nombre;
    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }
    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado(idEmpleado)").append(idEmpleado);
        sb.append(",sueldo=").append(sueldo);
        sb.append(", ").append(super.toString());
        sb.append(")");
        return sb.toString();
       
    }


  
    

}
