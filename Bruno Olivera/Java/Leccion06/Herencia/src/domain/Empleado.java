
package domain;

public class Empleado extends Persona{
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleados;
    
    //constructores

    public Empleado() {
     this.idEmpleado = ++Empleado.contadorEmpleados;   
    } 
    
    public Empleado(String nombre, double sueldo) {
        //super(nombre);
        this(); //estamos llamando desde aqui a un constructor interno
        this.nombre = nombre;
        this.sueldo = sueldo;
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
        return "Empleado{" + "idEmpleado=" + idEmpleado + ", sueldo=" + sueldo + '}';
    }

    
}
