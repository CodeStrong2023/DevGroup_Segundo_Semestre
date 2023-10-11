
public class EjerciciosCiclos {
    public static void main(String[] args) {
       /* 
        for(var i = 1; i < 6; i++){
            System.out.println("Contador Númerico: " + i);
            
        }

        //IMPRIMIR EN PANTALLA LA SIGUIENTE SERIE NÚMERICA; 1,3,5,7,9
        int i = 1;
        while(i < 10){
            System.out.println("Contador: " + i);
            i+=2;

        }
        
                     //Imprimir numeros del 1 al 15 con ciclo for,while,do while.
        //WHILE
        int i = 1;
        while(i <= 15){
            System.out.println("Contador: " + i);
            i++;
        }
    


        //DO WHILE
        int i = 1;
        do{
            System.out.println("Contador Do While:" + i);
            i++;
        }while(i <=15);
        
        


        //Ciclo FOR
        
        for( int i = 1; i <= 15; i++ ){
            if(i < 15){
             System.out.print( i + ",");   
            } else{
                System.out.print(i);
            }     
        }
        
        
        Scanner consol1 = new Scanner(System.in);
        System.out.print("Digite un número:");
        int num,cuadrado;
        num = Integer.parseInt(consol1.nextLine());
        while(num >= 0) { //Mientras sea igual a cero O POSITIVO
            cuadrado = (int)Math.pow(num,2);
            System.out.println("El número" + num + "elevado al cuadrado es:" + cuadrado);
            System.out.println("Digite otro número:");
            num = Integer.parseInt(consol1.nextLine());

        }
        System.out.println("A fializado por número negativo");
       

        //Leer un numero he indicar si es positivo o negativo. El proceso se repetirá hasta que se introduzca un cero
        Scanner consol1 = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un número");
        numero = Integer.parseInt(consol1.nextLine());
        while(numero != 0){
          if(numero >= 0){
                System.out.println("El número ingresado es positivo");
            }
          else {
                System.out.println("El numero ingresado es negativo:");
                }
            System.out.print("Digite otro número:");
            numero = Integer.parseInt(consol1.nextLine());
        }
        System.out.println("El programa a finalizado");



        Scanner consol2 = new Scanner(System.in);
        int num;
        System.out.print("Introduzca un número:");
        num = Integer.parseInt(consol2.nextLine());
        while (num != 0 ) {
            if (num > 0) {
                System.out.println("El número" + num + "es positivo");
            }
            else if (num < 0 ) {
                System.out.println("El número" + num + "es negativo");

            }
            System.out.println("Digite otro número");
            num = Integer.parseInt(consol2.nextLine());
        }
        System.out.println("El programa a finalizado");
         */
    }
}
