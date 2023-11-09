
package Operaciones;

public class Aritmetica {
    //Atributos de la clase
    int a;
    int b;
    
    //El constructor es un metodo especial
    //sobrecarga de constructores
    public Aritmetica(){ //constructor uno
        System.out.println("Se esta ejecutado este constructor numero uno");
    }
    
    public Aritmetica(int a, int b){ //constructor dos
        this.a = a;
        this.b = b;
        System.out.println("Se esta ejecutando este constructor numero dos");
    }
    
    
    //Metodo
    public void sumarNumeros(){
        int resultado = a + b;
        System.out.println("resultado= " + resultado);
    }
    
    public int sumarConRetorno(){
        //int resultado = a + b;
        return this.a+this.b;
    }
    
    public int sumarConArgumentos(int arg1, int arg2){
        this.a = a;
        this.b = b;
       // return a+b;
        return this.sumarConRetorno();
    }
}
