
package Operaciones;

public class Aritmetica {
    //Atributos de la clase
    int a;
    int b;
    
    //Metodos de la clase
    public void sumarNumeros() {
        int resultado = this.a +this. b;
        System.out.println("resultado = " + resultado);
    }
    public int sumarConRetorno(){
        //int resultado = a + b;
        return  a + b;
    }
    public int sumarConArgumentos(int a, int b) {
        this.a = a; //No modifica los valores de los atributos del objeto //El argumento a se  asigna a this.a
        this.b = b;
        //return a + b;
        return this.sumarConRetorno();
    }
    
            
}
