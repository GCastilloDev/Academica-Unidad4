package propuestos;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Propuesto013 {
    /*
    Un vendedor ha realizado N ventas y desea saber cuántas fueron por 10,000
    o menos, cuántas fueron por más de 10,000 pero por menos de 20,000 y cuánto 
    fue el monto de las ventas de cada una y el monto global
    */
    public static void main(String[] args) {
        System.out.println("*** Programa que calcula cuantas ventas fueron por "
                + "menos de $10,000.00, por menos de $20,000.00 y el monto de"
                + " cada uno y el monto global ***\n");
        
        Scanner n = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("#0.00");
        
        System.out.print("Ingrese el número de ventas a registrar: ");
        int numVentas = n.nextInt();
        
        int contador1 = 0;
        int contador2 = 0;
        float acumulado1 = 0;
        float acumulado2 = 0;
        float totalVentas = 0;
        
        for (int i = 1; i <= numVentas; i++){
            System.out.print("Ingrese el monto de la venta ["+i+"] $");
            float monto = n.nextFloat();
            totalVentas+=monto;
            
            if(monto <= 10000){
                contador1++;
                acumulado1+=monto;
            }
            else if(monto < 20000){
                contador2++;
                acumulado2+=monto;
            }
        }
        
        System.out.println("\n");
        System.out.println(contador1 + " ventas por $10,000.00 ó menos.");
        System.out.println("$" + f.format(acumulado1) + " fué el monto de las ventas "
                + "de $10,000.00 ó menos.");
        System.out.println("\n");
        System.out.println(contador2 + " ventas por menos de $20,000.00 pero "
                + "más de $10,000.00");
        System.out.println("$" + f.format(acumulado2) + " fué el monto de las ventas "
                + "por menos de $20,000.00 pero más de $10,000.00.");
        
        Locale mx = new Locale("es","MX");
        NumberFormat nf = NumberFormat.getCurrencyInstance(mx);
        
        System.out.println("\n" + nf.format(totalVentas) + " fué el total de todas las"
                + " ventas.");
    }
}
