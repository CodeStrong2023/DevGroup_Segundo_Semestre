// Clase 4 Clases y Objetos Parte 2

// Un metodo es una parte de codigo que vamos a poder
// reutilizar

package Clase4Completa;

public class Persona {

    // ((Las caract son los atributos)) Atributos de la clase

    String nombres; // puede recibir valores(argumento) o regresar (valor de retorno)
    String apellidos;

    // Métodos de la clase (acciones)

    public void ObtenerInformacion() { // indicar que se puede usar por fuera de la clase y el void(no regresa info)
        System.out.println("Nombre: " + nombres); // dentro de la clase podemos definir los atributos
        System.out.println("Apellido: " + apellidos);
    } 

}