package propuestos;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto009 {
    /*
    Un cliente de un banco deposita equis cantidad de pesos cada mes en una 
    cuenta de ahorros. La cuenta percibe un interés fijo durante un año de 10% 
    anual. Determinar el total de la inversión final de cada año en los
    próximos N años.
    */
    public static void main(String[] args) {
        System.out.println("*** Programa que realiza una proyección de inversión"
                + " a determinado número de años ***\n");
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("¿A cuantos años desea hacer la proyección? :");
        int anios = n.nextInt();
        System.out.print("¿Qué cantidad depositará cada mes por el número de años "
                + "de su inversión?: $");
        float deposito = n.nextFloat();        
        
        float acumulado = 0;
            
        for (int i = 1; i <= anios; i++){
            
            if (i==1) acumulado = deposito * 12;
            
            DecimalFormat f = new DecimalFormat("#0.00");
            
            float intereses =  acumulado * 0.10f;
            System.out.println("El interes que ganaras en el año ["+i+"] es de $" + 
                    f.format(intereses));
            acumulado+=intereses;          
        }
    }
}
