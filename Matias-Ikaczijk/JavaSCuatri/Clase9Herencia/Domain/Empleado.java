package Clase9Herencia.Domain;

public class Empleado extends Persona { // empleado es herencia de la class persona
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleados;
   
    // constructor
    public Empleado(){ //constructor 1
        this.idEmpleado = ++Empleado.contadorEmpleados; // genera el incremento de objetos
    }

    public Empleado(String nombre, double sueldo){ // constructor 2
        //super(nombre);
        this(); // lamada a un constructor interno, vacio
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
    public String toString(){
        StringBuilder sb = new StringBuilder(); // clase
        sb.append("Empleado (idEmpleado=").append(idEmpleado); //llama y agrega atributos
        sb.append(", sueldo=").append(sueldo);
        sb.append(", ").append(super.toString()); //mostraria todos los datos
        sb.append(")");
        return sb.toString();
    }
    
}

