
package siclowhile;


public class ejercciowhile01 {
    public static void main(String[] args) {
      var conteo = 0; //inferencia de tipos
      while(conteo < 3){
      System.out.println("conteo = " + conteo);
      conteo++; //Vamos aumentando en uno la variable
      }
       
      var contador = 0;
      do{
          System.out.println("contando = " +contador);
          contador++;
      }while(contador<= 7);
      //uso de las palabras break y continue junto a las etiquetas (labels)
      inicio:
      for(var contando = 0;contando < 7; contando++){
          if(contador % 2 ==0) {
          System.out.println("contando = " +contando);
          break inicio;
          }
     
      }
    }
}
