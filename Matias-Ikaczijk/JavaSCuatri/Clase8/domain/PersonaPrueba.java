package Clase8.domain;

public class PersonaPrueba {
    // podemos crear un atributo..
    private int contador;
    public static void main(String[] args) {
        // poder acceder al metodo solo poniendo el nombre
        Persona Persona1 = new Persona("Anabel");
        System.out.println(" Persona1 = " + Persona1);

        // creamos otro obj
        Persona Persona2 = new Persona("Jesus");
        System.out.println("Persona2 = " + Persona2);

        // imprimir(Persona1);
        // imprimir(Persona2);

        // this.contador = 10; // no se puede referenciar desde un cont estático
        PersonaPrueba personaP1 = new PersonaPrueba(); // lo traemos de forma dinamica
        System.out.println(personaP1.getContador()); // y lo llamamos para  mostrar el resultado
    }
    // CREAMOS OTRO METODO 
    public void imprimir(Persona persona){// no regresa nada, es dinamico
        System.out.println("persona = " + persona);
    } 

    // creamos un metodo (obj) a traves del getContador, en forma dinamica
    public int getContador(){
        imprimir(new Persona("Liliana"));
        return this.contador;
    }

}
