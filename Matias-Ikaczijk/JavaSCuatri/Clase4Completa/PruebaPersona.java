package Clase4Completa;

// 4.2 CREACION DE UN OBJETO, a partir de la persona (parte de arriba)

public class PruebaPersona {
    public static void main(String[] args) { // es una variable de tipo local que al terminar la ejecucion se destruye
        Persona persona1; // :tipo de clase
        persona1 = new Persona(); // llama al constructor Persona desde el objeto y permite asignar valor
        persona1.nombres = "Matias"; // atributos. transformamos la clase a objeto
        persona1.apellidos = "Ikaczijk";

        // llamamos al metodo (recibe los valores y los imprime) con el objeto
        
        persona1.ObtenerInformacion(); // Muestra los valores del atributo en la clase

        // -------

        // objetos --> Persona1 y Persona2 Son las instancias que crean al objeto

        Persona persona2 = new Persona(); // creamos otro obj
        System.out.println("persona2 = " + persona2);
        System.out.println("persona1 = " + persona1);

        persona2.ObtenerInformacion(); // da null porque ausenta de valor, no hay nada cargado y los obj no comparten info

        // cargamos los datos de persona2
        persona2.nombres = "Juan";
        persona2.apellidos = "Flores";
        persona2.ObtenerInformacion();

    }
}
