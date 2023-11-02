
package caja;



public class PruebaCaja {
    public static void main(String[] args) { //Metodo main
        //Variables locales
        int medidaAncho = 3; //Valores ingresados en codigo duro
        int medidaAlto = 2; 
        int medidaProf = 6;
        
        caja cajal = new caja(); //Instanciamos el objetos, contructor vacio
        cajal.ancho = medidaAncho; //Le pasamos los valores al objeto
        cajal.alto = medidaAlto;
        cajal.profundo = medidaProf;
        int resultado = cajal.calcularVolumen(); //Llamamos al metodo
        //Primer resultado
        System.out.println("resultado volumen de caja 1: " + resultado);
        
        caja caja2 = new caja(2, 4, 6); //llamamos al constructor 2 con nuevos argumento
        //llamamos con el nuevo objetos al metodo para un nuevo calculo
        System.out.println("resultado volumen de caja 2: " + caja2.calcularVolumen());
                
    }
    
}
