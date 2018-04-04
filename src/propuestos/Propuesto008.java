package propuestos;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto008 {
    /*
    Determinar cuánto pagará una persona que adquiere N artículos, los cuales
    están de promoción. Considere que si su precio es mayor o igual a $200 se le
    aplica un descuento de 15%, y si su precio es mayor a $100 pero menor a $200, 
    el descuento es de 12%; de lo contrario, sólo se le aplica 10%. Se debe 
    saber cuál es el costo y el descuento que tendrá cada uno de los artículos y 
    finalmente cuánto se pagará por todos los artículos obtenidos
    */
    public static void main(String[] args) {
        System.out.println("*** Programa que calcula los descuentos de compra"
                + " de una tienda ***");
        
        boolean repetir = true;
        float compraT = 0;
        int contador = 0;
        
        Scanner n = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("#0.00");
        
        do{
            contador++;
            float descuento = 0;
            System.out.print("Ingrese el costo del artículo ["+contador+"] $");
            float costo = n.nextFloat();
            
            if (costo >= 200){
                System.out.println("Costo original del artículo $" + f.format(costo));
                descuento = costo * 0.15f;
                System.out.println("El descuento a aplicar es $" + f.format(descuento));
                costo = costo - descuento;
                compraT+=costo;
                System.out.println("El precio con descuento es $" + f.format(costo));
            }
            else if (costo > 100){
                System.out.println("Costo original del artículo $" + f.format(costo));
                descuento = costo * 0.12f;
                System.out.println("El descuento a aplicar es $" + f.format(descuento));
                costo = costo - descuento;
                compraT+=costo;
                System.out.println("El precio con descuento es $" + f.format(costo));
            }
            else{
                System.out.println("Costo original del artículo $" + f.format(costo));
                descuento = costo * 0.10f;
                System.out.println("El descuento a aplicar es $" + f.format(descuento));
                costo = costo - descuento;
                compraT+=costo;
                System.out.println("El precio con descuento es $" + f.format(costo));
            }
            
            System.out.print("\n¿Desea comprar otro artículo? 1) Si 2) No: ");
            int opc = n.nextInt();
            
            repetir = opc==1?true:false;
            
        }while(repetir==true);
        
        System.out.println("Se comprarón "+contador+" artículos con un pago total "
                + "por ellos de $"  + f.format(compraT));
    }
}
