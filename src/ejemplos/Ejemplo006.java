package ejemplos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Ejemplo006 {
    /*
    Determinar cuánto ahorrará una persona en un año, si al final de cada mes
    deposita variables cantidades de dinero; además, se requiere saber cuánto
    lleva ahorrado cada mes.
    */
    public static String obtenerMes(int numeroMes){
        String mes="";
        switch (numeroMes){
            case 1:
                 mes = "Enero";
                break;
            case 2:
                mes = "Febrero";
                break;
            case 3:
                mes = "Marzo";
                break;
            case 4:
                mes = "Abril";
                break;
            case 5:
                mes = "Mayo";
                break;
            case 6:
                mes = "Junio";
                break;
            case 7:
                mes = "Julio";
                break;
            case 8:
                mes = "Agosto";
                break;
            case 9:
                mes = "Septiembre";
                break;
            case 10:
                mes = "Octubre";
                break;
            case 11:
                mes = "Noviembre";
                break;
            case 12:
                mes = "Diciembre";
                break;
        }        
        return mes;
    }
    public static void main(String[] args) {
        System.out.println("*** Programa que calcula cuanto ahorrara una persona"
                + " en un año ***");
        
        Scanner n = new Scanner(System.in);
        int mes = 1;
        float ahorroT = 0;
        
        while (mes <= 12){
            System.out.print("\nIngresa la cantidad que ahorraras en " +
                    obtenerMes(mes)+" $");
            float ahorro = n.nextFloat();
            ahorroT = ahorroT + ahorro;
            if(mes<12){
            System.out.print("El ahorro que lleva a " + obtenerMes(mes) + " es $" +
                    ahorroT);
            }
            mes++;
        }
        
        System.out.println("\nEste año usted ahorro $" + ahorroT);
    }    
}
