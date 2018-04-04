package propuestos;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto012 {
    /*
    Se desea saber el total de una caja registradora de un almacén, se conoce
    el número de billetes y monedas, así como su valor. 
    */
    public static void main(String[] args) {
        System.out.println("*** Programa que contabiliza monedad y billetes "
                + "de diferente denominación, dando una sumatoria de estos ***\n");
        
        Scanner n = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("#0.00");
        
        System.out.print("¿Hay billetes en la caja?, 1 para si 2 para no: ");
        int billetes = n.nextInt();
           
        int acumuladoBilletes = 0;
        boolean next = billetes==1?true:false;
        
        while(next == true){
            System.out.print("Ingrese la denominación de los billetes que se van a registrar: $");
            int denominacion = n.nextInt();
            System.out.print("Ingrese cuantos billetes hay de $"+f.format(denominacion)+" : ");
            int cantidad = n.nextInt();
            cantidad*=denominacion;
            acumuladoBilletes+=cantidad;
            System.out.print("¿Hay billetes de otra denominación?, 1 para si 2 para no: ");
            billetes = n.nextInt();
            next = billetes==1?true:false;
        }
        
        System.out.print("\n¿Hay monedas en la caja?, 1 para si 2 para no: ");
        int monedas = n.nextInt();
        
        next = monedas==1?true:false;
        
        float acumuladoMonedas = 0;
        
        while(next == true){
            System.out.print("Ingrese la denominación de las monedas que se van a registrar: $");
            float denominacion = n.nextFloat();
            System.out.print("Ingrese cuantas monedas hay de $"+f.format(denominacion)+" : ");
            float cantidad = n.nextInt();
            cantidad*=denominacion;
            acumuladoMonedas+=cantidad;
            System.out.print("¿Hay monedas de otra denominación?, 1 para si 2 para no: ");
            monedas = n.nextInt();
            next = monedas==1?true:false;
        }
        
        float totalCaja = acumuladoBilletes + acumuladoMonedas;
        System.out.println("El total de la caja es de $" + f.format(totalCaja));
    }
}
