
                    //CICLOS EN JAVA
public class TeoriaCiclos {
    public static void main(String[] args) {
                 //CICLO WHILE
    //Este ciclo va ejecutarse hasta que la condición que le pusimos pase a ser True
        var conteo = 0; //Inferencia de tipos
        while (conteo < 7) {
            System.out.println("Conteo = " + conteo);
            conteo++; //Vamos aumentado en uno la variable
        }
                //CICLO DO WHILE
    /* Este ciclo es lo mismo que el while nada mas que en este se puede ejecutar primero el 
       codigo y luego se revisa la condicion para ver si se sigue ejecutando o no */
        var contador = 0;
        do{
            System.out.println("contador = " + contador);
            contador++;
        } while(contador < 7);

                //CICLO FOR
        /*Para usar el ciclo for es necesario declarar una variable(en este caso "i") ponerle una condición
          y hacerle una "modoficación a la variable que creamos" */
        for(int i = 0; i < 7; i++){
            System.out.println("Contador:" + i);    
        }

        //CONTINUE
        for(int i = 0; i < 7; i++){
            if(i % 2 != 0){
            continue;
            }
            System.out.println("Contador:" + i);
        }
        //BREAK
         for(int i = 0; i < 7; i++){
            if(i % 2 == 0){
            System.out.println("Contador:" + i);
             break;
        }
            
        }

        
    }
}