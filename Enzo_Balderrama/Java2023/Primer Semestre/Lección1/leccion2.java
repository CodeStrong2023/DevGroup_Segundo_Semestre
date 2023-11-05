public class leccion2 {
    public static void main(String[] args) {
        /* var condicion = true;
        if (condicion){
            System.out.println("Condicion verdadera");
        } else{
            System.out.println("La condicion es falsa.");
        }
        var num = 2;
        var numTexto = "Número desconocido.";
        if (num == 1){
            numTexto = "Número uno.";
        } else if (num == 2){
            numTexto = "Número dos.";
        } else if (num == 3){
            numTexto = "Número tres.";
        } else if (num == 4){
            numTexto = "Número cuatro.";
        }
        System.out.println("numTexto: " + numTexto);*/
        var num = 2;
        var numTexto = "Número desconocido.";
        switch(num){
            case 1:
                numTexto = "Número uno.";
                break;
            case 2:
                numTexto = "Número dos.";
                break;
            case 3:
                numTexto = "Número tres.";
                break;
            case 4:
                numTexto = "Número cuatro.";
            default:
                numTexto = "Número desconocido.";
        }
        System.out.println("numTexto = " + numTexto);
    }
}
